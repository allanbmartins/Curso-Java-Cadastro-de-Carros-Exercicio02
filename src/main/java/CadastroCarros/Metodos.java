package CadastroCarros;

import javax.swing.*;
import java.util.ArrayList;


public class Metodos {
    private static ArrayList<Carros> listaCarros = new ArrayList<>();

    //Metodo Get
    public static ArrayList<Carros> getListaCarros() {
        return listaCarros;
    }

    //Adicionar objeto na lista
    static public void adicionar(Carros l) {
        listaCarros.add(l);
    }

    //Lista os dados de todos os objetos da lista
    static public String listar() {
        String saida = "";
        int i = 1;
        for (Carros l : listaCarros) {
            saida += "\n======= CARRO N " + (i++) + "====\n";
            saida += l.imprimir() + "\n";
        }

        return saida;
    }

    //Lista os dados de todos os objetos da lista pesoas
    static public String listar2() {
        String saida = "";
        int i = 1;
        for (Carros l : listaCarros) {
            saida += "\n======= CARRO N " + (i++) + "====\n";
            saida += l.imprimir() + "\n";
        }

        return saida;
    }


    //Pesquisar por carro
    public static int pesquisar(String modelo) {
        int qtd = 0;

        for (Carros l: listaCarros) {
            if (l.getModelo().equalsIgnoreCase(modelo)) {
                qtd++;
            }
        }
            return qtd;
    }

    //Remover um carro
     public static boolean remover (String modelo){
            for (Carros l : listaCarros) {
                if (l.getModelo().equalsIgnoreCase(modelo)) {
                    listaCarros.remove(l);
                    return true;
                }
            }
            return false;
     }

    //Alterar quantidade passageiros
     public static String alterar () {

         String qtdpassgeiros = JOptionPane.showInputDialog("Digite a quantidade de passageiros do carro que quer alterar: ");
         String novo = JOptionPane.showInputDialog("Digite a nova quantidade de passageiros do carro: ");

         for (int d = 0; d < listaCarros.size(); d++) {
                if (listaCarros.get(d).getQpassageiros().equals(qtdpassgeiros)) {
                    listaCarros.get(d).setQpassageiros(novo);
                    return null;
                }

         }
         return null;

     }

}
