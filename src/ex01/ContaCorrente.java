package ex01;

public class ContaCorrente extends Conta {
	
	public ContaCorrente() {
		super();
	}
	
	@Override
	public Double rendimento() {
		Double rendMensal =  saldo * 0.03;
		return rendMensal;
	}
	
	public Double calcularImposto() {
		return rendimento() * 0.10;
	}
}
