package ex02;

public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Caio", "Rua são josé", 252439884);
		
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Endereço: " + pessoa.getEndereco());
		System.out.println("Nome: " + pessoa.getTelefone());
	}
}
