package psv;

public class ClienteBean {
    private String nome;
    private String email;
    private String telefone;
    private String CPF;

    public ClienteBean() {
    }

    public ClienteBean(String nome, String email, String telefone, String CPF) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }  
    
    
}
