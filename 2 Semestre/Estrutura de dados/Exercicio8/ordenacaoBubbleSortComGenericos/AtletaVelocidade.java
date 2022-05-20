package ordenacaoBubbleSortComGenericos;

public class AtletaVelocidade extends Atleta implements Comparable { 
    private float tClassificacao;
    private float tFinal;

    public float gettClassificacao() {
        return tClassificacao;
    }

    public void settClassificacao(float tClassificacao) {
        this.tClassificacao = tClassificacao;
    }

    public float gettFinal() {
        return tFinal;
    }

    public void settFinal(float tFinal) {
        this.tFinal = tFinal;
    }

    public AtletaVelocidade() {
        this.nome = "";
        this.pais = "";
        this.sexo = "".charAt(0);
        this.tClassificacao = 0.0f;
        this.tFinal = 0.0f;
    }
    
    public AtletaVelocidade(String nome, String pais, String sexo, float tClassificacao, float tFinal) {
        this.nome = nome;
        this.pais = pais;
        this.sexo = sexo.charAt(0);
        this.tClassificacao = tClassificacao;
        this.tFinal = tFinal;
    }
    
    public String toString() {
        return "Atleta de 100m rasos" + " - nome: " + nome + ", país: " + pais + ", sexo: " + sexo 
                + ", tempo de classificação: " + tClassificacao + ", tempo na final: " + tFinal;
    }
    
    public int compareTo (Object outroAtleta) {
        if(getNome().compareTo(((AtletaVelocidade)outroAtleta).getNome()) < 0 ) return -1;
        else if(getNome().compareTo(((AtletaVelocidade)outroAtleta).getNome()) == 0 ) return 0;
        else return 1;        
    }    
}
