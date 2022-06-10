package br.edu.ifpr.figuras;

public class hexagono implements geometrica {
	private String nome;
	private double lado, altura;
	@Override
	public String nomeFigura() {
		return nome;
	}
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
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public double calculaPerimetro() {
		double perimetro = lado * 6;
		return perimetro;
	}
	@Override
	public double calculaArea() {
		double area = ((3 * altura * altura)*1.73)/2;
		return area;
	}
}
