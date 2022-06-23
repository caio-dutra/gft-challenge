package ex03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int diesel = 0;
		int gasol = 0;
		
		Model a1 = new Model();
		Model a2 = new Model();
		Model a3 = new Model();
		Model a4 = new Model();
		Model a5 = new Model();
			
			System.out.println("\nDigite o modelo do carro: ");
			a1.setModelo(scan.next());
			System.out.println("Digite a marca do carro: ");
			a1.setMarca(scan.next());
			System.out.println("Digite o tipo de combustível do carro: ");
			a1.setTipoCombustivel(scan.next());
			
			if(a1.getTipoCombustivel() == "Diesel" || a1.getTipoCombustivel() == "diesel") {
				diesel = diesel + 1;
			}
			if(a1.getTipoCombustivel() == "Gasolina" || a1.getTipoCombustivel() == "gasolina") {
				gasol = gasol + 1;
			}
			
			System.out.println("\nDigite o modelo do carro: ");
			a2.setModelo(scan.next());
			System.out.println("Digite a marca do carro: ");
			a2.setMarca(scan.next());
			System.out.println("Digite o tipo de combustível do carro: ");
			a2.setTipoCombustivel(scan.next());
			
			if(a2.getTipoCombustivel() == "Diesel" || a2.getTipoCombustivel() == "diesel") {
				diesel = diesel + 1;
			}
			if(a2.getTipoCombustivel() == "Gasolina" || a2.getTipoCombustivel() == "gasolina") {
				gasol = gasol + 1;
			}
			
			System.out.println("\nDigite o modelo do carro: ");
			a3.setModelo(scan.next());
			System.out.println("Digite a marca do carro: ");
			a3.setMarca(scan.next());
			System.out.println("Digite o tipo de combustível do carro: ");
			a3.setTipoCombustivel(scan.next());
			
			if(a3.getTipoCombustivel() == "Diesel" || a3.getTipoCombustivel() == "diesel") {
				diesel = diesel + 1;
			}
			if(a3.getTipoCombustivel() == "Gasolina" || a3.getTipoCombustivel() == "gasolina") {
				gasol = gasol + 1;
			}
			
			System.out.println("\nDigite o modelo do carro: ");
			a4.setModelo(scan.next());
			System.out.println("Digite a marca do carro: ");
			a4.setMarca(scan.next());
			System.out.println("Digite o tipo de combustível do carro: ");
			a4.setTipoCombustivel(scan.next());
			
			if(a4.getTipoCombustivel() == "Diesel" || a4.getTipoCombustivel() == "diesel") {
				diesel = diesel + 1;
			}
			if(a4.getTipoCombustivel() == "Gasolina" || a4.getTipoCombustivel() == "gasolina") {
				gasol = gasol + 1;
			}
			
			System.out.println("\nDigite o modelo do carro: ");
			a5.setModelo(scan.next());
			System.out.println("Digite a marca do carro: ");
			a5.setMarca(scan.next());
			System.out.println("Digite o tipo de combustível do carro: ");
			a5.setTipoCombustivel(scan.next());
			
			if(a5.getTipoCombustivel() == "Diesel" || a5.getTipoCombustivel() == "diesel") {
				diesel = diesel + 1;
			}
			if(a5.getTipoCombustivel() == "Gasolina" || a5.getTipoCombustivel() == "gasolina") {
				gasol = gasol + 1;
			}
			
			a1.imprimirDados();
			a2.imprimirDados();
			a3.imprimirDados();
			a4.imprimirDados();
			a5.imprimirDados();
			
			System.out.println("Total de carros á diesel: " + diesel);
			System.out.println("Total de carros á gasolina: " + gasol);

		scan.close();
	}
}
