package br.edu.ifpr.principal;
import br.edu.ifpr.figuras.*;
public class losangoPoo {
	public static void main(String[] args) {
		losango L1= new losango();
		L1.setNome("Losango");
		L1.setLado(7.8);
		L1.setDiagonalMaior(9.1);
		L1.setDiagonalMenor(8.9);
		
		System.out.println("A figura � um: " +L1.nomeFigura());
		System.out.println("O valor do per�metro do losango � de " + L1.calculaPerimetro());
		System.out.println("O valor da �re do losango � de " +L1.calculaArea());
	}
}
