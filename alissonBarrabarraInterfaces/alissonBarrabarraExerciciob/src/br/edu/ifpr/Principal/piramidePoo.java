package br.edu.ifpr.Principal;
import br.edu.ifpr.*;
public class piramidePoo {
	public static void main(String[] args) {
	piramide p1 = new piramide();
	p1.setNome("Pir�mide");
	p1.setBase(9);;
	p1.setAltura(5);
	System.out.println("A figura geom�trica �: "+p1.nomeFigura());
	System.out.println("O volume � de: "+p1.calculoVolume());
	}
}
