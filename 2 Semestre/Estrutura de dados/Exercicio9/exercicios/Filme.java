package filaEstaticaSequencial;

public class Filme {
	private String titulo;
	private String diretor;
	private String pais;
	private String genero;
	private int ano;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	@Override
	public String toString() {
		return "Titulo: " + titulo + "; Diretor: " + diretor + ", Gênero: " + genero + ", País: " +
				pais + "; Ano: " + ano;
	}
}
