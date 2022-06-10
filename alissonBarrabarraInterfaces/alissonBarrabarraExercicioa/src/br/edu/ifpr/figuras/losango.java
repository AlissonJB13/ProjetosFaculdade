package br.edu.ifpr.figuras;

public class losango implements geometrica {
	private String nome;
	private double lado, diagonalMaior, diagonalMenor;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getDiagonalMaior() {
		return diagonalMaior;
	}

	public void setDiagonalMaior(double diagonalMaior) {
		this.diagonalMaior = diagonalMaior;
	}

	public double getDiagonalMenor() {
		return diagonalMenor;
	}

	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}

	public String nomeFigura() {
		return nome;
	}

	public double calculaPerimetro() {
		double perimetro = lado*4;
		return perimetro;
	}

	public double calculaArea() {
		double area = (diagonalMaior*diagonalMenor)/2; 
		return area;
	}

}
