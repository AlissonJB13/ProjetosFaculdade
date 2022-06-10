package br.edu.ifpr.figuras;

public class triangulo implements geometrica {
	private String nome;
	private double ladoa, ladob, ladoc, base, altura;
	
	public double getLadoa() {
		return ladoa;
	}

	public void setLadoa(double ladoa) {
		this.ladoa = ladoa;
	}

	public double getLabob() { 
		return ladob;
	}

	public void setLabob(double ladob) {
		this.ladob = ladob;
	}

	public double getLadoc() {
		return ladoc;
	}

	public void setLadoc(double ladoc) {
		this.ladoc = ladoc;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	public String nomeFigura() {
		return nome;
	}

	
	public double calculaPerimetro() {
		double perimetro = ladoa+ladob+ladoc;
		return perimetro;
	}

	public double calculaArea() {
		double area = (base*altura)/2; 
		return area;
	}

}
