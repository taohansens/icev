package Lista04.q03;

import java.util.GregorianCalendar;

public class ContaBancaria {
	String cliente;
	int numeroConta;
	int agencia;
	double saldo;
	private GregorianCalendar data;
	/**
	 * @return the cliente
	 */
	public String getCliente() {
		return cliente;
	}
	/**
	 * @param cliente the cliente to set
	 */
	private void setCliente(String cliente) {
		this.cliente = cliente;
	}
	/**
	 * @return the numeroConta
	 */
	private int getNumeroConta() {
		return numeroConta;
	}
	/**
	 * @param numeroConta the numeroConta to set
	 */
	private void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	/**
	 * @return the agencia
	 */
	public int getAgencia() {
		return agencia;
	}
	/**
	 * @param agencia the agencia to set
	 */
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	/**
	 * @return the saldo
	 */
	private double getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * @return the data
	 */
	public GregorianCalendar getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(GregorianCalendar data) {
		this.data = data;
	}
	/**
	 * @param cliente
	 * @param numeroConta
	 * @param agencia
	 * @param saldo
	 * @param data
	 */
	public ContaBancaria(String cliente, int numeroConta, int agencia, double saldo, GregorianCalendar data) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.saldo = saldo;
		this.data = data;
	}
	public ContaBancaria(String cliente, int numeroConta, int agencia, GregorianCalendar data) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.saldo = 0;
		this.data = data;
	}
	public ContaBancaria(int agencia, int numeroConta) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.saldo = 0;
		this.data = data;
	}
	
	

	
}
