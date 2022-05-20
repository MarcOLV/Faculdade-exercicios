
import javax.swing.JOptionPane;

public class TesteLogin {
    public static void main(String[] args) {
        Login usuario;        
        
        String [][] matrizUsuarios = {{"marco","123"},
                {"admin", "111"},
                {"luiza", "333"},
        };
        
        String nome, password, acesso;
        
        nome = JOptionPane.showInputDialog("Digite o nome");
        password = JOptionPane.showInputDialog("Digite a senha");
        acesso = JOptionPane.showInputDialog("Digite o tipo de acesso");
        
        usuario = new Login(nome, password);
        usuario.setUsers(matrizUsuarios);
        usuario.setAcesso(acesso);
        
        if (usuario.autentica()){
            JOptionPane.showMessageDialog(null, "Acesso permitido");
        }
        else{
            JOptionPane.showMessageDialog(null, "Dados incorretos");
        }
        
    }
    
}
