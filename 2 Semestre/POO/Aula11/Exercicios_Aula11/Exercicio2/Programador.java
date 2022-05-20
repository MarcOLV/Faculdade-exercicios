public class Programador extends Empregado{
    private float qtdeHoras;
    private float valorHora;

    public Programador(){

    }

    public Programador(String nome, String matricula, float qtdeHoras, float valorHora){
        super(nome,matricula);
        this.qtdeHoras = qtdeHoras;
        this.valorHora = valorHora;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }
    @Override
    public String getMatricula() {
        return super.getMatricula();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }
    @Override
    public void setMatricula(String matricula) {
        super.setMatricula(matricula);
    }

    public float getQtdeHoras() {
        return qtdeHoras;
    }
    public float getValorHora() {
        return valorHora;
    }
    public void setQtdeHoras(float qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }
    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
    
    public float calculaSalario(){
        return valorHora * qtdeHoras;
    }


}
