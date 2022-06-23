package ex01;

public class Conta {
	
	protected String titular;
	protected int numero;
	protected Double saldo;
	
	public Double rendimento() {
		return saldo;
	}
	
	public Double calcularImposto() {
		return rendimento();
	}
	
	public String getTitular() {
		return titular;
	}
	public int getNumero() {
		return numero;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
}
