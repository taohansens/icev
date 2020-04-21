package Lista05.Agenda;

public abstract class Contato {
	
	private String nome;
	private String telefone;
	private String endereco;
	private String documento;

	public Contato(String nome) {
		this(nome, "","","");
	}
	
	public Contato(String nome, String telefone, String endereco, String documento) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.documento = null;
	}

	public String getNome() {
		return nome;
	}
	
	public String getDocumento() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

/*!! Não funcionou
abstract class Documento {
	String rg;
	String cnpj;
	
	private void RG(String RG){
		this.rg = RG;
	}
	
	public String getRg() {
		return rg;
	}
	
	private void CNPJ(String CNPJ){
		this.cnpj = CNPJ;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
}
*/

class PessoaFisica extends Contato {

	public PessoaFisica(String nome, String telefone, String endereco, String documento) {
		super(nome, telefone, endereco, documento);
	}
	
	}

class PessoaJuridica extends Contato {
	public PessoaJuridica(String nome, String telefone, String endereco, String documento) {
		super(nome, telefone, endereco, documento);
	}
	}
