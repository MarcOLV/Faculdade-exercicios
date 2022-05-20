public class Calcado extends Vestuario {
    private String materialInterno;

    public Calcado() {
    }

    public Calcado(String materialInterno, String cor, String tamanho, int codigo, String descricao, float valor) {
        super(cor, tamanho, codigo, descricao, valor);
        this.materialInterno = materialInterno;
    }

    public String getMaterialInterno() {
        return materialInterno;
    }

    public void setMaterialInterno(String materialInterno) {
        this.materialInterno = materialInterno;
    }
    
    public String print(){
        return super.print() + "\nMaterial Interno: " + materialInterno;
    }
    
    
}
