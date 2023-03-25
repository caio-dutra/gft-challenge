package ex03;

public class Model extends Carro {
	
	private String tipoCombustivel;

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		
		this.tipoCombustivel = tipoCombustivel;
	}

	public Model() {
		super();
	}
	
	public void imprimirDados() {
		System.out.println("-----------------------------------------");
		System.out.println("Modelo: " + modelo);
		System.out.println("Marca: " + marca);
		System.out.println("Tipo de combustível: " + tipoCombustivel);
	}
	

	@Override
	public String toString() {
		return "[Modelo = " + modelo + ", " +
			   "Marca = " + marca + ", " + 
			   "Tipo de combustível = " + tipoCombustivel + "]";
	}
	
}
