public class Livro extends Publicacao{
    private String editora;

    public Livro(String editora, String titulo, String dataPublicacao) {
        super(titulo, dataPublicacao);
        this.editora = editora;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public void imprimir() {
        System.out.println("Titulo: " + this.getTitulo() + 
                "\nData Publicação: " + this.getDataPublicacao()+
                "\nEditora: " + editora);
    }
    
    
}
