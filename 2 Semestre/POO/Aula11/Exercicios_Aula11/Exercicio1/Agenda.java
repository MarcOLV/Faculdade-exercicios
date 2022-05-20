
public class Agenda {
    private String nome;
    private String dados[][];

    public Agenda() {
    }

    public Agenda(String nome) {
        this.nome = nome;  
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[][] getDados() {
        return dados;
    }

    public void setDados(String[][] dados) {
        this.dados = dados;
    }

    public void imprimir(){
        System.out.println(" \nDados ");
        for(int i = 0; i < dados.length; i++){
              System.out.println("\nAgenda: " + dados[i][0] + " \nnumero: " + dados[i][1]);
        }
    }
    public void busca(){
        for(int i = 0; i < dados.length; i++){
            if(dados[i][0] == dados[i][0]){
                    System.out.println("\nNome buscado: "  + getNome());
            }
            else{
                System.out.println("\nNome não achado");
            }
        }
       
    }
  
}
