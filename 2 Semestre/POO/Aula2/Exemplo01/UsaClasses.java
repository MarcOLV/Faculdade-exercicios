import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class UsaClasses {
    public static void main(String[] args) {
        
        //declaração do objeto
        Pessoa p;
        //instanciação (criar o objeto na memória = associar os atributos e métodos)
        p = new Pessoa(); //construtor padrão

        //declarar e instanciar na mesma linha
        Pessoa p1 = new Pessoa(); //construtor padrão
        Pessoa p2 = new Pessoa("Pelé", 82, 30.00);
        //Objeto Cliente
        Cliente c = new Cliente();

        //define valores dos atribtos
        p.nome = "Mariana";
        p.idade = 27;
        p.renda = 2500.0;

        //entrada de dados para os atributos
        c.nome = JOptionPane.showInputDialog("Digite o nome do Cliente");
        c.endereco = JOptionPane.showInputDialog("Digite o endereço do Cliente");
        c.email = JOptionPane.showInputDialog("Digite o e-mail do Cliente");
        c.telefone = JOptionPane.showInputDialog("Digite o telefone do Cliente");

        //mostrando os valores dos atributos
        System.out.println("Nome: " + p.nome + "\nIdade: " + p.idade + "\nRenda: " + p.renda);
        System.out.println("Nome: " + p1.nome + "\nIdade: " + p1.idade + "\nRenda: " + p1.renda);
        System.out.println("Nome: " + p2.nome + "\nIdade: " + p2.idade + "\nRenda: " + p2.renda);
        //mostra dados do cliente
        System.out.println("Nome: " + c.nome + "\nEndereço: " + c.endereco + 
            "\ne-mail: " + c.email + "\nTelefone: " + c.telefone);
    }
}
