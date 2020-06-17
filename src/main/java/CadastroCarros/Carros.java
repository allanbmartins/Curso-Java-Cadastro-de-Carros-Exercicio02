package CadastroCarros;

public class Carros {

    private String modelo;
    private String qpassageiros;


    public Carros(String modelo, String qpassageiros) {
        this.modelo = modelo;
        this.qpassageiros = qpassageiros;
    }

    public String getModelo() {
        return modelo;
    }

    public String getQpassageiros() {
        return qpassageiros;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setQpassageiros(String qpassageiros) {
        this.qpassageiros = qpassageiros;
    }

    //médoto de classe
    public String imprimir() {
        return "Modelo: "+modelo+"" +
                "\n"+"Quantidade de Pessoas: "+ qpassageiros +"\n";
    }
}

