
import javax.swing.JOptionPane;

public class TesteAluno {
    public static void main(String[] args) {
        //variáveis
        int qtdeAlunos, qtdeNotas;
        float mediaGeral = 0;
        Aluno alunos[]; //declaração do vetor de objetos do tipo Aluno
        
        qtdeAlunos = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite a quantidade de alunos do curso"));
        //instanciar o vetor de alunos
        alunos = new Aluno[qtdeAlunos];
        
        for (int i = 0; i < alunos.length; i++){
            qtdeNotas = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite a quantidade de notas do aluno " + (i+1)));
            //instancia o objeto na posição do vetor
            //instancia para cada objeto o vetor de notas
            alunos[i] = new Aluno(qtdeNotas);
            alunos[i].leitura();
            mediaGeral += alunos[i].calculaMedia();
            alunos[i].print();
        }
        System.out.println("Média geral da turma: " + mediaGeral/qtdeAlunos);
    }
    
}
