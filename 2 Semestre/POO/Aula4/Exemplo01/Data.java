
import javax.swing.JOptionPane;

public class Data {
    //atributos
    int dia;
    int mes;
    int ano;
    //construtores
    //padrão
    Data(){}
    //com parâmetros
    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    //métodos
    void cadastraDados(){
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês"));
        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano"));
    }
    void imprimeDados(){
        JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano);
    }
    
}
