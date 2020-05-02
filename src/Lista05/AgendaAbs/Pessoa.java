package Lista05.AgendaAbs;

abstract class Pessoa {
    private String nome;
    private String endereco;
    private int telefone;

    public Pessoa(String nome, String endereco, int telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}

class PessoaFisica extends Pessoa {
    private String rg;

    public PessoaFisica(String nome, String endereco, int telefone, String rg) {
        super(nome, endereco, telefone);
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "NOME: " + getNome() +"\nRG: "+ getRg() +
                "\nENDERECO: " + getEndereco() +"\nTELEFONE: " + getTelefone();
    }
}

class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, int telefone, String cnpj) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "NOME: " + getNome() +"\nCNPJ: "+ getCnpj() +
                "\nENDERECO: " + getEndereco() +"\nTELEFONE: " + getTelefone();
    }
}