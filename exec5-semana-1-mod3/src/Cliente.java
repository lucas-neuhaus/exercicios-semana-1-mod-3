public class Cliente {
    private String nome;
    private int idade;
    private String email;
    private String endereco;
    private String telefone;
    private String cpf;
    private String profissao;
    private String estadoCivil;
    private String nacionalidade;
    private String enderecoTrabalho;

    public Cliente(String nome, int idade, String email, String endereco, String telefone, String cpf, String profissao,
                   String estadoCivil, String nacionalidade, String enderecoTrabalho) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.profissao = profissao;
        this.estadoCivil = estadoCivil;
        this.nacionalidade = nacionalidade;
        this.enderecoTrabalho = enderecoTrabalho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getEnderecoTrabalho() {
        return enderecoTrabalho;
    }

    public void setEnderecoTrabalho(String enderecoTrabalho) {
        this.enderecoTrabalho = enderecoTrabalho;
    }

    public boolean validarCliente() {
        if (nome == null || nome.isEmpty()) {
            System.out.println("Nome inválido.");
            return false;
        }

        if (idade <= 0 || idade > 120) {
            System.out.println("Idade inválida.");
            return false;
        }

        if (email == null || !email.contains("@")) {
            System.out.println("E-mail inválido.");
            return false;
        }

        if (endereco == null || endereco.isEmpty()) {
            System.out.println("Endereço inválido.");
            return false;
        }

        if (telefone == null || telefone.isEmpty()) {
            System.out.println("Telefone inválido.");
            return false;
        }

        if (cpf == null || cpf.length() != 11) {
            System.out.println("CPF inválido.");
            return false;
        }

        if (profissao == null || profissao.isEmpty()) {
            System.out.println("Profissão inválida.");
            return false;
        }

        if (estadoCivil == null || estadoCivil.isEmpty()) {
            System.out.println("Estado civil inválido.");
            return false;
        }

        if (nacionalidade == null || nacionalidade.isEmpty()) {
            System.out.println("Nacionalidade inválida.");
            return false;
        }

        if (enderecoTrabalho == null || enderecoTrabalho.isEmpty()) {
            System.out.println("Endereço de trabalho inválido.");
            return false;
        }

        return true;
    }
}
