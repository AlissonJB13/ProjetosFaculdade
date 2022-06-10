package br.edu.ifpr;

public class cilindro implements volume{
	private String nome;
	private double  raiocircunf, altura;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRaiocircunf() {
		return raiocircunf;
	}

	public void setRaiocircunf(double raiocircunf) {
		this.raiocircunf = raiocircunf;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String nomeFigura() {
		// TODO Auto-generated method stub
		return nome;
	}

	@Override
	public double calculoVolume() {
		// TODO Auto-generated method stub
		double volume = 3.14 * raiocircunf * altura;
		return volume;
	}

}
