
import javax.swing.JOptionPane;

public class TesteObjetos {

    public static void main(String[] args) {
        //variáveis auxiliares
        float base, altura;
        int dia, mes, ano;
        //declaração de objetos
        Triangulo t1, t2;
        Data d1, d2;
        
        //entrada de dados
        base = Float.parseFloat(JOptionPane.showInputDialog("Digite a base"));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura"));
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês"));
        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano"));
        
        //criando os objetos
        t1 = new Triangulo();
        d1 = new Data();
        
        t2 = new Triangulo(base, altura);
        d2 = new Data(dia, mes, ano);
        
        //usando os métodos
        JOptionPane.showMessageDialog(null, t2.imprimeDados());
        d2.imprimeDados();
        
        d1.cadastraDados();
        d1.imprimeDados();
        
        JOptionPane.showMessageDialog(null, t1.imprimeDados());
        
    }
    
}
