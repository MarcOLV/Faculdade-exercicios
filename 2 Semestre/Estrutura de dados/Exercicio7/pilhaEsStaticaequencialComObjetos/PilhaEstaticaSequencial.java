package pilhaEsStaticaequencialComObjetos;

import javax.swing.JOptionPane;

public class PilhaEstaticaSequencial {
    private Pilha p = null;  //atributo da classe
    
    public static void main(String[] args) {
        new PilhaEstaticaSequencial();
    }
    
    public PilhaEstaticaSequencial() {
       simulacaoLeituraDeDados();      
       System.out.println("Pilha inicial:");
       System.out.println( p.toString() );     
       System.out.println("Retirando e esvaziando a pilha:");
       while ( !p.isEmpty() ) {
           System.out.println(p.pop());
       }
       if ( p.isEmpty() ) System.out.println("Impossível retirar da pilha. Pilha vazia.");     
       //ou:  if ( p.pop()==null ) System.out.println("Impossível retirar da pilha. Pilha vazia.");  
    }
    
    public void simulacaoLeituraDeDados() {
        //para efetuar teste rápidos, criamos uma pilha com dados fixos:
        p = new Pilha(7);
        p.push( new Trabalhador("Julio",  2000f, 'M') );
        p.push( new Trabalhador("Mariana",  1000, 'F') );
        p.push( new Trabalhador("Renata",  800, 'F') );
        p.push( new Trabalhador("Pedro",  1500f, 'M') );
        p.push( new Trabalhador("Amilton",  6000f, 'M') );
        p.push( new Trabalhador("Jorge",  2200f, 'M') );
        p.push( new Trabalhador("Carlos",  3500f, 'M') );
    }

    public void leituraDeDados () {
        String umNome; float umSalario;  char umSexo;
        int N = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de trabalhadores:"));
        p = new Pilha(N);   //aloca memória para a pilha
        for (int i=0; i<N; i++){
                  umNome = JOptionPane.showInputDialog( "Digite o nome do trabalhador: ");
                  umSalario = Float.parseFloat(JOptionPane.showInputDialog( "Digite o salário de " + umNome + ": "));
                  umSexo= JOptionPane.showInputDialog( "Digite o sexo deste trabalhador: ").charAt(0);
                  umSexo = Character.toUpperCase(umSexo);
                  p.push( new Trabalhador(umNome, umSalario, umSexo) ); //aloca memória para o objeto (e executa o método construtor com parâmetros)
        }
    }
    
}
