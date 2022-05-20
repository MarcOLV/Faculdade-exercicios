
import javax.swing.JOptionPane;

public class Aluno {
    private String rgm;
    private float notas[]; //declaração do vetor de notas
    private float media;

    public Aluno() {
    }

    public Aluno(String rgm, int qtde) {
        this.rgm = rgm;
        notas = new float[qtde]; //instancia o vetor de notas
    }
    
    public Aluno(int qtde){
        notas = new float[qtde]; 
    }

    public String getRgm() {
        return rgm;
    }

    public void setRgm(String rgm) {
        this.rgm = rgm;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }
    public void leitura(){
        rgm = JOptionPane.showInputDialog("Digite o RGM: ");
        for(int i=0; i < notas.length; i++){
            notas[i] = Float.parseFloat(
                    JOptionPane.showInputDialog("Digite uma nota"));
        }
    }
    public float calculaMedia(){
        float soma=0;
        for(int i = 0; i < notas.length; i++){
            soma = soma + notas[i];
        }
        media = soma/notas.length; //atualiza o atributo média
        return media; //retorna o valor do atributo
    }
    public void print(){
        String saida = " RGM: " + rgm + "\nNotas: ";
        for(int i = 0; i < notas.length; i++){
            saida += notas[i] + ", ";
        }
        saida += "\nMédia: " + media;
        System.out.println("Dados do aluno: \n" + saida);
    }
}
