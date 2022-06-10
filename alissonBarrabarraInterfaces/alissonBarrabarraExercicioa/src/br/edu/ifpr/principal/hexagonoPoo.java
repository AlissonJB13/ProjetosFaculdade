package br.edu.ifpr.principal;
import br.edu.ifpr.figuras.*;
public class hexagonoPoo {
	public static void main(String[] args) {
		hexagono h1 = new hexagono();
		h1.setNome("Hexagono");
		h1.setLado(5);
		h1.setAltura(8);
		
		System.out.println("A figura é um: "+h1.nomeFigura());
		System.out.println("O perimetro é: "+h1.calculaPerimetro());
		System.out.println("A área é: "+h1.calculaArea());
	}
}
