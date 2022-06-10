package br.edu.ifpr.principal;
import br.edu.ifpr.figuras.*;
public class circuloPoo {
	public static void main(String[] args) {
		circulo C1 = new circulo();
		C1.setNome("Circulo");
		C1.setRaiocircun(3);
		
		System.out.println("A figura é um: " + C1.nomeFigura());
		System.out.println("O valor do perímetro do circulo é de " + 
		C1.calculaPerimetro());
		System.out.println("O valor da área é de "+ C1.calculaArea());
		
	}

}
