package br.edu.ifpr.Principal;
import br.edu.ifpr.*;
public class piramidePoo {
	public static void main(String[] args) {
	piramide p1 = new piramide();
	p1.setNome("Pirâmide");
	p1.setBase(9);;
	p1.setAltura(5);
	System.out.println("A figura geométrica é: "+p1.nomeFigura());
	System.out.println("O volume é de: "+p1.calculoVolume());
	}
}
