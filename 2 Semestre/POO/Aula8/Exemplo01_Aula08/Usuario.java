public class Usuario extends Pessoa implements Imprimivel, Seguranca{
    private String nomeUsuario;
    private String senha;
    
    //construtores

    public Usuario() {
    }

    public Usuario(String nomeUsuario, String senha) {       
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public Usuario(String nomeUsuario, String senha, String nomeCompleto, int idade) {
        super(nomeCompleto, idade);
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }
    
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    @Override
    public String formatoString() {
        String dados = "Nome Completo: " + nomeCompleto + NLIN + "Idade: " + idade +
                NLIN +"Usuário: " + nomeUsuario + NLIN + "Senha: " + senha;
        return dados;
    }

    @Override
    public void formatoSystemOut() {
        System.out.println("Nome Completo: " + nomeCompleto + NLIN + "Idade: " + idade + 
                NLIN +"Usuário: " + nomeUsuario + NLIN + "Senha: " + senha);
    }

    @Override
    public boolean validar() {
        return !(nomeUsuario.equals("") || senha.equals(""));
    }
}
