package br.com.caelum.contas.modelo;

/**
 * Classe responsável por moldar as Contas do Banco
 * 
 * @author dvitoriano
 *
 */

public class Conta {
	protected double saldo;
	private String titular;
	private int numero;
	private String agencia;

	/**
	 * Método que incrementa o valor
	 * @param valor
	 */
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public String getTipo() {
		return "Conta";
	}
	
	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}
	
	// getters and setters

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public double getSaldo() {
		return this.saldo;
	}
}
