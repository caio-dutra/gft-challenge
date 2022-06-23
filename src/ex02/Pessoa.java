package ex02;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private int telefone;
	
	public Pessoa(String nome, String endereco, int telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	
	public String getNome() {
		return nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
}
