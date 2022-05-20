public class Data {
    //atributos
    int dia;
    int mes;
    int ano;

    //construtor  - padrão
    Data(){

    }
    //com parâmetros
    Data(int dia, int mes, int ano){
        this.dia = dia; //this refere ao atributo da classe
        this.mes = mes;
        this.ano = ano;
    }
}
