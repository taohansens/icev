package Lista05.q10;

public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;

	protected Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected int getIdade() {
		return idade;
	}

	protected void setIdade(int idade) {
		this.idade = idade;
	}

	protected String getSexo() {
		return sexo;
	}

	protected void setSexo(String sexo) {
		this.sexo = sexo;
	}

}

abstract class Empregado extends Pessoa {
	private double salario;
	private String matricula;

	protected Empregado(String nome, int idade, String sexo, double salario, String matricula) {
		super(nome, idade, sexo);
		this.salario = salario;
		this.matricula = matricula;
	}

	protected double getSalario() {
		return salario;
	}

	protected void setSalario(double salario) {
		this.salario = salario;
	}

	protected String getMatricula() {
		return matricula;
	}

	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	protected double valorInss() {
		double valor = salario * 0.11;
		return valor;
	}
}

class Cliente extends Pessoa {
	private double valorDivida;
	private int anoNascim;

	protected Cliente(String nome, int idade, String sexo, double valorDivida, int anoNascim) {
		super(nome, idade, sexo);
		this.valorDivida = valorDivida;
		this.anoNascim = anoNascim;
	}

	protected double getValorDivida() {
		return valorDivida;
	}

	protected void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	protected int getAnoNascim() {
		return anoNascim;
	}

	protected void setAnoNascim(int anoNascim) {
		this.anoNascim = anoNascim;
	}

	@Override
	public String toString() {
		return "Cliente Nome: " + getNome() + ", Idade: " + getIdade() + ", Sexo: " + getSexo() + ", Valor da Divida: "
				+ getValorDivida() + ", Ano de Nasc.: " + getAnoNascim();
	}
}

class Gerente extends Empregado {
	private String nomeGerencia;

	protected Gerente(String nome, int idade, String sexo, double salario, String matricula, String nomeGerencia) {
		super(nome, idade, sexo, salario, matricula);
		this.nomeGerencia = nomeGerencia;
	}

	protected String getNomeGerencia() {
		return nomeGerencia;
	}

	protected void setNomeGerencia(String nomeGerencia) {
		this.nomeGerencia = nomeGerencia;
	}

	@Override
	public String toString() {
		return "Gerente Nome: " + getNome() + ", Idade: " + getIdade() + ", Matricula: " + getMatricula()
				+ ", Valor do Inss: " + valorInss() + ", Nome da Gerencia:" + getNomeGerencia();
	}

}

class Vendedor extends Empregado {
	private double valorVendas;
	private int qntVendas;

	protected Vendedor(String nome, int idade, String sexo, double salario, String matricula, double valorVendas,
			int qntVendas) {
		super(nome, idade, sexo, salario, matricula);
		this.valorVendas = valorVendas;
		this.qntVendas = qntVendas;
	}

	protected double getValorVendas() {
		return valorVendas;
	}

	protected void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	protected int getQntVendas() {
		return qntVendas;
	}

	protected void setQntVendas(int qntVendas) {
		this.qntVendas = qntVendas;
	}

	@Override
	public String toString() {
		return "Vendedor - Nome: " + getNome() + ", Salario: " + getSalario() + ", Valor de Vendas: " + getValorVendas()
				+ ", Qtd Vendas: " + getQntVendas();
	}

}