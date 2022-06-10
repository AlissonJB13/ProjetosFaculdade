package br.edu.ifpr.figuras;

public class circulo implements geometrica{
	private String nome;
	private double raiocircun;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getRaiocircun() {
		return raiocircun;
	}
	public void setRaiocircun(double raiocircun) {
		this.raiocircun = raiocircun;
	}
	public String nomeFigura() {
		return nome;
	}
	@Override
	public double calculaPerimetro() {
		double perimetro = 2*3.14*raiocircun;
		return perimetro;
	}
	@Override
	public double calculaArea() {
		double area = 3.14 * (raiocircun * raiocircun);
		return area;
	} 
	
}
