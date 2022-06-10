package br.edu.ifpr.objetos;

import br.edu.ifpr.bMedico;

public class ObjetosMedico {
	public static void main (String[] args) {
		
		bMedico m1 = new bMedico();
		m1.nomeMedico = "Sergio da Silva ";
		m1.datanascimentoMedico = "20/05/1979 ";
		m1.cpfMedico = "063.215.975-00 ";
		m1.rgMedico = "02.313.451-0 ";
		m1.crmMedico = "PR 18293";
		m1.salarioMedico = 15000.00;
		
		bMedico m2 = new bMedico();
		m2.nomeMedico = "Maria Almeida ";
		m2.datanascimentoMedico = "30/10/1982 ";
		m2.cpfMedico = "132.255.999-09 ";
		m2.rgMedico = "10.129.481-0";
		m1.crmMedico = "SC 18294";
		m2.salarioMedico = 12500.00;
		
		bMedico m3 = new bMedico();
		m3.nomeMedico = "Eduarda Cardoso ";
		m3.datanascimentoMedico = "06/04/1985 ";
		m3.cpfMedico = "075.855.939-76 ";
		m3.rgMedico = "12.382.142-0";
		m1.crmMedico = "PR 21293";
		m3.salarioMedico = 11000.00;
		
		System.out.println(m1.nomeMedico);
		System.out.println(m1.datanascimentoMedico);
		System.out.println(m1.cpfMedico);
		System.out.println(m1.rgMedico);
		System.out.println(m1.crmMedico);
		System.out.println(m1.salarioMedico);
		
		System.out.println(m2.nomeMedico);
		System.out.println(m2.datanascimentoMedico);
		System.out.println(m2.cpfMedico);
		System.out.println(m2.rgMedico);
		System.out.println(m2.crmMedico);
		System.out.println(m2.salarioMedico);
		
		System.out.println(m3.nomeMedico);
		System.out.println(m3.datanascimentoMedico);
		System.out.println(m3.cpfMedico);
		System.out.println(m3.rgMedico);
		System.out.println(m3.crmMedico);
		System.out.println(m3.salarioMedico);
	}
}
