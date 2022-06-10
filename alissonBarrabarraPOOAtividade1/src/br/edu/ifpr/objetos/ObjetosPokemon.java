package br.edu.ifpr.objetos;

import br.edu.ifpr.Pokemon;

public class ObjetosPokemon {
	public static void main (String[] args) {
		
		Pokemon p1 = new Pokemon();
		p1.nomePokemon = "Pikachu";
		p1.tipoPokemon = "Elétrico";
		p1.saudePokemon = (float)350.9;
		p1.ataPokemon = (float)112.5;
		p1.ataqueEspecialPok = "Wild Charge";
		p1.DefPokemon = (float) 96.0;
		p1.agilidadePokemon = (float)680.9;
		
		Pokemon p2 = new Pokemon();
		p2.nomePokemon = "Blastoise";
		p2.tipoPokemon = "Aquático";
		p2.saudePokemon = (float)500.5;
		p2.ataPokemon = (float)170.9;
		p2.ataqueEspecialPok = "Hydro Pump";
		p2.DefPokemon = (float)207.5;
		p2.agilidadePokemon = (float)495.99;
		
		Pokemon p3 = new Pokemon();
		p3.nomePokemon = "Charizard";
		p3.tipoPokemon = "Fogo";
		p3.saudePokemon = (float)500.4;
		p3.ataPokemon = (float)223.8;
		p3.ataqueEspecialPok = "Overheat";
		p3.DefPokemon = (float)173.8;
		p3.agilidadePokemon = (float)625.9;
		
		System.out.println(p1.nomePokemon);
		System.out.println(p1.tipoPokemon);
		System.out.println(p1.saudePokemon);
		System.out.println(p1.ataPokemon);
		System.out.println(p1.ataqueEspecialPok);
		System.out.println(p1.DefPokemon);
		System.out.println(p1.agilidadePokemon);
		System.out.println("\n");
		
		System.out.println(p2.nomePokemon);
		System.out.println(p2.tipoPokemon);
		System.out.println(p2.saudePokemon);
		System.out.println(p2.ataPokemon);
		System.out.println(p2.ataqueEspecialPok);
		System.out.println(p2.DefPokemon);
		System.out.println(p2.agilidadePokemon);
		System.out.println("\n");
		
		System.out.println(p3.nomePokemon);
		System.out.println(p3.tipoPokemon);
		System.out.println(p3.saudePokemon);
		System.out.println(p3.ataPokemon);
		System.out.println(p3.ataqueEspecialPok);
		System.out.println(p3.DefPokemon);
		System.out.println(p3.agilidadePokemon);
	}

}
