package ex01;

public class Main {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca poupanca = new ContaPoupanca();
		
		cc.setTitular("Caio Dutra");
		cc.setNumero(15);
		cc.setSaldo(500.0);
		
		poupanca.setTitular("Caio Dutra");
		poupanca.setNumero(39);
		poupanca.setSaldo(900.0);
		
		Double rendimentoContaCorrente = cc.rendimento();
		Double rendimentoContaPoupanca = poupanca.rendimento();
		
		Double impostoContaCorrente = cc.calcularImposto();
		Double impostoContaPoupanca = poupanca.calcularImposto();
		
		
		System.out.println("-----Conta Corrente-----");
		System.out.println("Titular: " + cc.getTitular());
		System.out.println("Número: " + cc.getNumero());
		System.out.println("Saldo: " + cc.getSaldo());
		System.out.println("Rendimento mensal: " + rendimentoContaCorrente);
		System.out.println("Imposto calculado: " + impostoContaCorrente);
		
		System.out.println("\n-----Conta Poupança-----");
		System.out.println("Titular: " + poupanca.getTitular());
		System.out.println("Número: " + poupanca.getNumero());
		System.out.println("Saldo: " + poupanca.getSaldo());
		System.out.println("Rendimento mensal: " + rendimentoContaPoupanca);
		System.out.println("Imposto calculado: " + impostoContaPoupanca);


		
		
	}
}
