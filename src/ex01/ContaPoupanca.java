package ex01;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca() {
		super();
	}
	
	@Override
	public Double rendimento() {
		Double rendMensal =  saldo * 0.05;
		return rendMensal;
	}
	
	public Double calcularImposto() {
		return rendimento() * 0.25;
	}
}
