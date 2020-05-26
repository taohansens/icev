package Lista04.q03;

public class Conta {
	String titular;
	String agencia;
	String numero;
	double saldo;
	String dataDeAbertura;

	/**
	 * @param titular
	 * @param agencia
	 * @param numero
	 * @param dataDeAbertura
	 */
	public Conta(String titular, String agencia, String numero, String dataDeAbertura) {
		this.titular = titular;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0;
		this.dataDeAbertura = dataDeAbertura;
	}

	/**
	 * @param titular
	 * @param agencia
	 * @param numero
	 */
	public Conta(String agencia, String numero, String titular) {
		this.titular = titular;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0;

	}

	/**
	 * @return the titular
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * @param titular the titular to set
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * @return the agencia
	 */
	public String getAgencia() {
		return agencia;
	}

	/**
	 * @param agencia the agencia to set
	 */
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the dataDeAbertura
	 */
	public String getDataDeAbertura() {
		return dataDeAbertura;
	}

	/**
	 * @param dataDeAbertura the dataDeAbertura to set
	 */
	public void setDataDeAbertura(String dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}

	/*
	 * SACAR
	 */
	void saca(double valorSac) {
		double qtdTemp = this.saldo - valorSac;
		if (qtdTemp >= 0) {
			this.saldo = qtdTemp; } else {}}
	
	/*
	 * DEPOSITAR
	 */
	void deposita(double valorDep) {
		this.saldo = this.saldo + valorDep;}
	
	/*
	 * CALCULAR RENDIMENTO
	 */
	double calcularRendimento() {
		this.saldo = this.saldo*1.01;
		return this.saldo;
	}
	
	String recuperaDadosParaImpressao() {
		return ("Titular da conta: " + this.getTitular() + "\nAgencia: " + this.getAgencia() + "\nNum. da Conta: " + this.getNumero()
				+ "\nData de Abertura: " + this.getDataDeAbertura()+"\nSALDO ATUAL DA CONTA: R$"+ this.getSaldo());
	}
	
	void aposTransacao() {
		System.out.println("Conta: "+this.getNumero()+"| Saldo após transação: R$"+ this.getSaldo());
	}

}