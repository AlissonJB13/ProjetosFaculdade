package br.edu.ifpr.Principal;
import br.edu.ifpr.*;
public class cilindroPoo {
	public static void main(String[] args) {
	cilindro C = new cilindro();
	C.setNome("cilindro");
	C.setRaiocircunf(9);
	C.setAltura(8);
	System.out.println("A figura geom�trica �: "+C.nomeFigura());
	System.out.println("O volume � de: "+C.calculoVolume());
}
}
