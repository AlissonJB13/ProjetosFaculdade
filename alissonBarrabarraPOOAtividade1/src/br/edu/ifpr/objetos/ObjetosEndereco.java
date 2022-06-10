package br.edu.ifpr.objetos;
import br.edu.ifpr.aEndereco;

public class ObjetosEndereco {
	public static void main (String[] args) {
		
		aEndereco e1 = new aEndereco ();
		e1.rua = "Oziani coelho ";
		e1.numero = 434;
		e1.bairro = " Klubege ";
		e1.complemento = "Casa 2 Loteamento Benedetti ";
		e1.cep = "85555-000 ";
		e1.cidade = "Palmas ";
		e1.estado = "Paraná ";
		
		aEndereco e2 = new aEndereco ();
		e2.rua = "Rio Grande do Sul ";
		e2.numero = 86;
		e2.bairro = " Klubege ";
		e2.complemento = "Prox. Mercado Amigão ";
		e2.cep = "85555-000 ";
		e2.cidade = "Palmas ";
		e2.estado = "Paraná ";
		
		aEndereco e3 = new aEndereco ();
		e3.rua = "AV. Clevelandia ";
		e3.numero = 494;
		e3.bairro = " Centro ";
		e3.complemento = "Proximo a Prefeitura ";
		e3.cep = "85555-000 ";
		e3.cidade = "Palmas ";
		e3.estado = "Paraná ";
		
		System.out.println(e1.rua + e1.numero);
		System.out.println(e1.complemento + e1.bairro + e1.cep);
		System.out.println(e1.cidade + e1.estado);
		
		System.out.println(e2.rua + e2.numero);
		System.out.println(e2.complemento + e2.bairro + e2.cep);
		System.out.println(e2.cidade + e2.estado);
		
		System.out.println(e3.rua + e3.numero);
		System.out.println(e3.complemento + e3.bairro + e3.cep);
		System.out.println(e3.cidade + e3.estado);
	}

}
