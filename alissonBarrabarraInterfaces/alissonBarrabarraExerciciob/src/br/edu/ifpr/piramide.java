package br.edu.ifpr;

public class piramide implements volume {
	private String nome;
	private double base, altura;
	
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
		double volume = (base*altura)/3;
		return volume;
	}
	

}
