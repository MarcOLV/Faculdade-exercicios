
import javax.swing.JOptionPane;

public class TesteComposicao {
    public static void main(String[] args) {
        //declaração dos objetos
        Empresa sistemas;
        Chefe diretor;
        //Variáveis auxiliares
        String n, r;
        double s, b;
        int qtdeT; //quantidade de trabalhos
        
        qtdeT = 3;
        Trabalhador trab[] = new Trabalhador[qtdeT];
        
        for (int i=0; i< qtdeT; i++){
            n = JOptionPane.showInputDialog("Digite o nome");
            r = JOptionPane.showInputDialog("Digite o registro");
            s = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario"));
            //instancia um objeto do tipo trabalhador no vetor
            trab[i] = new Trabalhador(n, r, s);
        }
        n = JOptionPane.showInputDialog("Digite o nome do diretor");
        r = JOptionPane.showInputDialog("Digite o registro do diretor");
        s = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do diretor"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o benefício do diretor"));
        diretor = new Chefe(b, n, r, s);
        //instaciando o objeto do tipo Empresa
        sistemas = new Empresa(trab, diretor);
        sistemas.imprimir();
    }
    
}
