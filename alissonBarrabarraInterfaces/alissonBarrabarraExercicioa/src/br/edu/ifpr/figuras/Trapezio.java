package br.edu.ifpr.figuras;

public class Trapezio implements geometrica {
	private String nome;
	private double base1, base2, lado1, lado2, altura;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getBase1() {
		return base1;
	}
	public void setBase1(double base1) {
		this.base1 = base1;
	}
	public double getBase2() {
		return base2;
	}
	public void setBase2(double base2) {
		this.base2 = base2;
	}
	public double getLado1() {
		return lado1;
	}
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	public double getLado2() {
		return lado2;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public String nomeFigura() {
		return nome;
	}
	@Override
	public double calculaPerimetro() {
		double perimetro = base1 + base2 + lado1 + lado2;
		return perimetro;
	}
	@Override
	public double calculaArea() {
		double area = ((base1 + base2)*altura)/2;
		return area;
	}
	
	
}
