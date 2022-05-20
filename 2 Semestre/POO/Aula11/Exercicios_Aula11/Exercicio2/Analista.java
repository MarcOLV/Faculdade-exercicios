    public class Analista extends Empregado {
    private float valorPorProjeto[];


    public Analista(){

    }


    public Analista(String nome, String matricula, int vP){
        super(nome,matricula);
        valorPorProjeto = new float[vP];
    }

    public float[] getValorPorProjeto() {
        return valorPorProjeto;
    }

    public void setValorPorProjeto(float[] valorPorProjeto) {
        this.valorPorProjeto = valorPorProjeto;
    }
    @Override
    public String getNome() {
        return super.getNome();
    }
    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getMatricula() {
        return super.getMatricula();
    }

    @Override
    public void setMatricula(String matricula) {
        super.setMatricula(matricula);
    }

    public float calculaSalario(float valor){
        return valor;
    }


}
