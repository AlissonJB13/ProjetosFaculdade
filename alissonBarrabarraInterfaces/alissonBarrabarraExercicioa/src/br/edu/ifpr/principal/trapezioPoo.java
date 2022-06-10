package br.edu.ifpr.principal;
import br.edu.ifpr.figuras.*;
public class trapezioPoo {
	public static void main(String[] args) {
		Trapezio t1 = new Trapezio();
		t1.setNome("Trapezio");
		t1.setBase1(3);
		t1.setBase2(9);
		t1.setLado1(1.5);
		t1.setLado2(0.5);
		t1.setAltura(3.2);
		
		System.out.println("A figura é um: "+t1.nomeFigura());
		System.out.println("O perimetro é: "+t1.calculaPerimetro());
		System.out.println("A área é: "+t1.calculaArea());
	}
}
