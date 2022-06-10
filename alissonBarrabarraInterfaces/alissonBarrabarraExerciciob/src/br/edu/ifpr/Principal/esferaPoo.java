package br.edu.ifpr.Principal;
import br.edu.ifpr.*;
public class esferaPoo {
	public static void main(String[] args) {
		esfera e1 = new esfera();
		e1.setNome("Esfera");
		e1.setRaiocircun(5);
		System.out.println("A figura geométrica é: "+e1.nomeFigura());
		System.out.println("O volume é de: "+e1.calculoVolume());
	}
}
