public class Login {
    private String nome;
    private String acesso;
    private String password;
    private String users[][];

    public Login() {
    }

    public Login(String nome, String password) {
        this.nome = nome;  
        this.password = password;
    }

    public String getAcesso() {
        return acesso;
    }

    public String getNome() {
        return nome;
    }

    public String getPassword() {
        return password;
    }

    public String[][] getUsers() {
        return users;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsers(String[][] users) {
        this.users = users;
    }
    public boolean autentica(){
        for (int i = 0; i< users.length; i++){
            if(users[i][0].equals(nome) && users[i][1].equals(password)){
                return true;
            }            
        }
        return false;
    }
    
    
    
    
    
}
