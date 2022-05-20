public class Compra {
	private String nomeComprador;
	private String nomeProduto;
	private float valorProduto;
	public String getNomeComprador() {
        return nomeComprador;

    }public String getNomeProduto() {
        return nomeProduto;

    }public float getValorProduto() {
        return valorProduto;

    }public void setNomeComprador(String nomeComprador) {
        this.nomeComprador = nomeComprador;

    }public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;

    }public void setValorProduto(float valorProduto) {
        this.valorProduto = valorProduto;
    }
	@Override
	public String toString() {
		return "Nome do comprador: " + nomeComprador + "; Nome do Produto: " + nomeProduto + 
				"; Valor Produto: " + valorProduto;
	}
}
