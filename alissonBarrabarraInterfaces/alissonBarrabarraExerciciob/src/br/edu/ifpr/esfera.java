package br.edu.ifpr;

public class esfera implements volume {
	private String nome;
	private double  raiocircun;
	
	
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
	@Override
	public String nomeFigura() {
		// TODO Auto-generated method stub
		return nome;
	}
	@Override
	public double calculoVolume() {
		// TODO Auto-generated method stub
		double volume = raiocircun * raiocircun * raiocircun * 3.14 * (4/3);
		return volume;
	}
	
	

}
