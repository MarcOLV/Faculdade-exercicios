import javax.swing.*;

public class TrabalhadoresEmpresa {
    //Armazenaremos os dados dos trabalhadores da empresa em um vetor:
    private Trabalhador trab[];
    private int N;
    
public static void main(String[] args) {
    TrabalhadoresEmpresa principal = new TrabalhadoresEmpresa();
}

public TrabalhadoresEmpresa () {
    simulacaoLeituraDeDados() ;
    mostraTrabalhadoresCadastrados();
}

public void simulacaoLeituraDeDados() {
    //para efetuar testes r�pidos, criamos um vetor de objetos com dados fixos:
    N = 7;
    trab = new Trabalhador[N];
    trab[0] = new Trabalhador("Julio",  2000f, 'M');
    trab[1] = new Trabalhador("Mariana",  1000, 'F');
    trab[2] = new Trabalhador("Renata",  800, 'F');
    trab[3] = new Trabalhador("Pedro",  1500f, 'M');
    trab[4] = new Trabalhador("Amilton",  6000f, 'M');
    trab[5] = new Trabalhador("Jorge",  2200f, 'M');
    trab[6] = new Trabalhador("Carlos",  3500f, 'M');
}

public void leituraDeDados() {
        String umNome;
        float umSalario;
        char umSexo;
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de trabalhadores:"));
        trab = new Trabalhador[N];   //aloca mem�ria para o vetor

        for (int i = 0; i < N; i++) {
            umNome = JOptionPane.showInputDialog("Digite o nome do trabalhador " + (i + 1) + ": ");
            umSalario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário de " + umNome + ": "));
            umSexo = JOptionPane.showInputDialog("Digite o sexo deste trabalhador: ").charAt(0);
            umSexo = Character.toUpperCase(umSexo);
            trab[i] = new Trabalhador(umNome, umSalario, umSexo); //aloca mem�ria para o objeto (e executa o m�todo construtor com par�metros)
            // a inicializa��o anterior do objeto poderia ser em etapas:
            //	trab[i] = new Trabalhador();  //usando o construtor sem par�metros
            //	trab[i].setNome(umNome);
            //	trab[i].setSalario(umSalario);
            //	trab[i].setSexo(umSexo);
        }
}

public void mostraTrabalhadoresCadastrados () {
    String cad = "";
    for (int i=0; i<N; i++) {
      cad +=  trab[i].toString()+ "\n";
    }    
    JTextArea outputArea = new JTextArea(15,40);  //15 linhas e 40 colunas
    outputArea.setText(cad);
	JScrollPane rolagem = new JScrollPane(outputArea);
	JOptionPane.showMessageDialog(null,rolagem,"Dados dos trabalhadores cadastrados",
	                    JOptionPane.INFORMATION_MESSAGE);
}

//  Os m�todos 'quickSort' e 'separar' a seguir ordenam um vetor de elementos de tipo double.
//  Crie  m�todos para ordenar o vetor de objetos Trabalhador trab[]:
//  1) em ordem decrescente pelos sal�rios, 2) em ordem crescente considerando o atributo nome. 

 public boolean quickSort (double[] vetor, int inicio, int fim) {

        if (vetor == null) return false;   
        if (inicio < fim) {
           int posicaoPivo = separar (vetor, inicio, fim);
           quickSort(vetor, inicio, posicaoPivo - 1);
           quickSort(vetor, posicaoPivo + 1, fim);
        }        
        return true;
    }

 private int separar (double[] vetor, int inicio, int fim) {
      double pivo = vetor[inicio];
      int i = inicio + 1, f = fim;
      while (i <= f) {
         if (vetor[i] <= pivo) i++;
         else if (pivo < vetor[f]) f--;
         else {
             double troca = vetor[i];
             vetor[i] = vetor[f];
             vetor[f] = troca;
             i++;
             f--;
         }
      }
      vetor[inicio] = vetor[f];
      vetor[f] = pivo;
      return f;
   }

    
}
