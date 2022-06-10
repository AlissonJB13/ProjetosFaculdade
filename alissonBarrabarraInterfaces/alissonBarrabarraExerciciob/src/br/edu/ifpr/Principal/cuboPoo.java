package br.edu.ifpr.Principal;
import br.edu.ifpr.*;
public class cuboPoo {
	public static void main(String[] args) {
		cubo f1 = new cubo();
		f1.setNome("Cubo");
		f1.setLado(10.5);
		System.out.println("A figura geométrica é: "+f1.nomeFigura());
		System.out.println("O volume é de: "+f1.calculoVolume());
	}
}
