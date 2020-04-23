package Lista05.Agenda;

public class Pessoa {

	private String nomePessoa;
	private String telefone;
	private String endereco;
	private String cnpj;
	private String rg;
	private boolean pfPj; // Estou definindo como true = PF;

	public Pessoa(boolean pfOuPj, String nomePessoa, String documento, String telefone, String endereco) {
		this.pfPj = pfOuPj;
		this.nomePessoa = nomePessoa;
		this.rg = documento;
		this.cnpj = documento;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public String getNome() {
		return nomePessoa;
	}

	public void setNome(String nome) {
		this.nomePessoa = nome;
	}

	public boolean getPfPj() {
		return pfPj;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
