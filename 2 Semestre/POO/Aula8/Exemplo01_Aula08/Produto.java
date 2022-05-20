
import javax.swing.JOptionPane;

public class Produto implements Seguranca, Imprimivel{
    private String descricao;
    private int quantidade;

    public Produto(String descricao, int quantidade) {
        this.descricao = descricao;
        this.quantidade = quantidade;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getDescricao() {
        return descricao;
    }
    public int getQuantidade() {
        return quantidade;
    }
    
    @Override
    public boolean validar() {
        if (quantidade < 0){
            JOptionPane.showMessageDialog(null, "Quantidade incorreta");
            return false;
        }
        return true;
    }

    @Override
    public String formatoString() {
        String dados = "Descrição: " + descricao + NLIN + "Quantidade: " + quantidade;
        return dados;
    }

    @Override
    public void formatoSystemOut() {
        System.out.println("Descrição: " + descricao + NLIN + "Quantidade: " + quantidade);
    }
    
    
    
    
}
