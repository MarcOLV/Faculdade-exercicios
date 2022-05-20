public class Empresa {
    private Trabalhador trab[];
    private Chefe diretor;

    public Empresa() {
    }
    public Empresa(Trabalhador[] trab, Chefe diretor) {
        this.trab = trab;
        this.diretor = diretor;
    }
    public Chefe getDiretor() {
        return diretor;
    }
    public Trabalhador[] getTrab() {
        return trab;
    }
    public void setDiretor(Chefe diretor) {
        this.diretor = diretor;
    }
    public void setTrab(Trabalhador[] trab) {
        this.trab = trab;
    }
    public void imprimir(){
        for(int i=0; i < trab.length; i++){
            if(trab[i]!=null){
                trab[i].imprimir();
            }
        }
        diretor.imprimir();
    }
    
}
