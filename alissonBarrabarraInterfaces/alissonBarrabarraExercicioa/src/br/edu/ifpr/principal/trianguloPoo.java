package br.edu.ifpr.principal;
import br.edu.ifpr.figuras.*;

public class trianguloPoo {
	public static void main(String[] args) {
		triangulo t1= new triangulo();
		t1.setNome("Tri�ngulo");
		t1.setLadoa(3);
		t1.setLabob(2);
		t1.setLadoc(3);
		t1.setAltura(8);
		t1.setBase(8);
		System.out.println("A figura � um: " +t1.nomeFigura());
		System.out.println("O valor do per�metro do triangulo � de " +t1.calculaPerimetro());
		System.out.println("O valor da �rea do triangulo � de " +t1.calculaArea());
	}

}
