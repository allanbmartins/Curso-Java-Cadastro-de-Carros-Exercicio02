package CadastroCarros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Main_Menu {
     public static void main(String[] args){

         SpringApplication.run(Main_Menu.class, args);

         Scanner entrada = new Scanner(System.in);
         Scanner entradaString = new Scanner(System.in);

         int menu;
         double vInicial, vFinal;
         //Referencia para a classe carro
         Carros objCarro;

         String modelo, qpassageiros;

         do{
             exibirMenu();
             menu = entrada.nextInt();

             switch (menu){
                 case 1: //CADASTRAR CARRO

                     System.out.println("_________________________________________________________________________");
                     System.out.print("=====>CADASTRAR CARRO<====\n");
                     System.out.println("_______________________________________________________________________\n");
                     System.out.print("Digite o modelo: ");
                     modelo = entradaString.nextLine();

                     System.out.print("Digite a quantidade de passageiros no carro: ");
                     qpassageiros = entradaString.nextLine();

                     //Criar objeto da classe
                     objCarro = new Carros(modelo, qpassageiros);
                     System.out.println("_______________________________________________________________________\n");

                     //Guadar no ArrayLista
                     Metodos.adicionar(objCarro);

                     break;


                 case 2: //LISTAR CARROS CADASTRADOS
                        System.out.println("_________________________________________________________________________");
                        System.out.print("=====>LISTAR CARROS CADASTRADOS<====\n");
                        System.out.print(Metodos.listar());
                        System.out.println("_______________________________________________________________________\n");

                        break;


                 case 3: //PESQUISAR CARRO CADASTRADO
                        System.out.println("_________________________________________________________________________");
                        System.out.print("=====>PESQUISAR CARRO CADASTRADO<====\n");
                        System.out.print("Digite o modelo: ");
                        modelo = entradaString.nextLine();
                        System.out.print("Existe " + Metodos.pesquisar(modelo)
                                + " carros(s) com modelo " + modelo);
                        System.out.println("_______________________________________________________________________\n");

                        break;


                 case 4://REMOVER CARRO CADASTRADO
                        System.out.println("_________________________________________________________________________");
                        System.out.print("=====>REMOVER CARRO CADASTRADOO<====\n");
                        System.out.print("Digite o modelo: ");
                        modelo = entradaString.nextLine();

                        if ( ! (Metodos.getListaCarros().isEmpty())) { //Acervo não vazio
                            if (Metodos.remover(modelo)) {
                                System.out.print("Carro removido com sucesso!!!");
                                System.out.println("_______________________________________________________________\n");
                            } else {
                                System.out.print("Modelo não encontrado!!!");
                                System.out.println("_______________________________________________________________\n");
                            }

                        } else {
                            System.out.println("_____________________________________________________________________");
                            System.out.print("=====>!!!AVISO!!!<====\n");
                            System.out.print("Não existe carros no cadastro!!!");
                            System.out.println("___________________________________________________________________\n");
                        }

                        break;


                 case 5://ALTERAR QUANTIDADE DE PASSAGEIROS NOS CARROS CADASTRADOS
                        System.out.println("_________________________________________________________________________");
                        System.out.print("=====>LISTA DE PASSAGEIROS NOS CARROS CADASTRADOS<====\n");
                        System.out.print(Metodos.listar());

                        System.out.print(Metodos.alterar());

                        System.out.print("=====>LISTA DE PASSAGEIROS NOS CARROS CADASTRADOS ATUALIZADOS<====\n");
                        System.out.print(Metodos.listar());
                        System.out.println("_________________________________________________________________________");

                        break;

                 case 6://MENSAGEM INFORMATIVA QUE ESTÁ SAINDO DA APLICAÇÃO
                        System.out.print("SAINDO!!! \n");
                        break;

                 default:
                        System.out.println("OPÇÃO DE MENU INVÁLIDA!!!");

             }
         }while (menu !=6);

     }//Fim main menu


     static void exibirMenu(){

            System.out.println("_____________________________________________________________________________________");
            System.out.println("* * *    MENU PRINCIPAL DE CADASTRO DE CARROS   * * * ");
            System.out.println("_____________________________________________________________________________________");
            System.out.println("Opção 1 - CADASTRAR CARRO");
            System.out.println("Opção 2 - LISTAR CARROS CADASTRADOS");
            System.out.println("Opção 3 - PESQUISAR CARRO CADASTRADO");
            System.out.println("Opção 4 - REMOVER CARRO CADASTRADO");
            System.out.println("Opção 5 - ALTERAR QUANTIDADE DE PASSAGEIROS NOS CARROS CADASTRADOS");
            System.out.println("Opção 6 - SAIR DO PROGRAMA");
            System.out.println("## Escolha uma das opções acima: ##");
            System.out.println("_____________________________________________________________________________________");
            System.out.print("Digite aqui sua opção: ");

     }

}
