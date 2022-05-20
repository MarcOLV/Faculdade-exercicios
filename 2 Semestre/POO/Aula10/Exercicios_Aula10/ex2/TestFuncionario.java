import javax.swing.JOptionPane;

public class TestFuncionario{
    public static void main(String[] args) {
    Gerente g = new Gerente();
    Funcionario f = new Funcionario();

    
    System.out.println("Funcionario");
    f.setNome(JOptionPane.showInputDialog(null, "Digite seu nome"));
    f.setCpf(JOptionPane.showInputDialog(null, "Digite seu CPF"));
    f.setSalario(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite seu salario")));
     
    System.out.print("Nome: " + f.getNome() + "\nCPF: " + f.getCpf() + "\nSalario " + f.getSalario() );

    f.autentica(111);
    System.out.print ("Sua bonificação será de "+ f.bonificacao());

    /////
    System.out.println("\n");
    System.out.println("Gerente");
    g.setNome(JOptionPane.showInputDialog(null, "Digite seu nome"));
    g.setCpf(JOptionPane.showInputDialog(null, "Digite seu CPF"));
    g.setSalario(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite seu salario")));
    g.setfuncionariosGerenciados(Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos funcionarios você gerencia")));
    System.out.print("Nome: " + g.getNome() + "\nCPF: " + g.getCpf() + "\nSalario " + g.getSalario() );
    System.out.print ("\nVocê gerencia "+ g.getFuncionariosGerenciados() + " funcionario e é o " + f.getNome());
    g.setSenha(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a senha")));
    if(g.getSenha() == 234){
        g.autentica(234);
    }
    else{
        System.out.println("\nVocê não tem direito ao sistema interno do banco");
    }
    System.out.print ("Sua bonificação será de "+ g.bonificacao());

}
}