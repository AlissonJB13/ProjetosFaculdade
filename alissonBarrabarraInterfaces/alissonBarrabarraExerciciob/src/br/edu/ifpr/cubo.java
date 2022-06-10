package br.edu.ifpr;
//import java.util.Scanner;

public class cubo implements volume {
	private String nome;
	private double  lado; //raiocircun, base, altura; 

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/*public double getRaiocircun() {
		return raiocircun;
	}

	public void setRaiocircun(double raiocircun) {
		this.raiocircun = raiocircun;
	}

	public double getLado() {
		return lado;
	}*/

	public void setLado(double lado) {
		this.lado = lado;
	}

	/*public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}*/

	public String nomeFigura() {
		
	/*	Scanner name = new Scanner(System.in);
		System.out.println("Figuras disponíveis para calculo do volume geométrico: CUBO, PIRAMIDE, CILINDRO, ESFERA");
		System.out.println("Digite o nome da figura: ");
		nome = name.nextLine();*/
		return nome;
	}

	@Override
	public double calculoVolume() {
		double volume;
		/*if(nome=="cubo") {
			lado = 5;*/
			volume = lado*lado*lado;
		//}
		return volume;
	}
	

}
