public class Chefe extends Trabalhador{
    private double beneficio;

    public Chefe() {
    }

    public Chefe(double beneficio, String nome, String registro, double salario) {
        super(nome, registro, salario);
        this.beneficio = beneficio;
    }

    public double getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(double beneficio) {
        this.beneficio = beneficio;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Benefício: " + beneficio);
    }
    
}
