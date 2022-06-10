package principalDeriv;

import principal1.anfibio;
import principal1.ave;
import principal1.mamifero;
import principal1.peixe;
import principal1.reptil;

public class Animais {
	public static void main(String[] args) {
		anfibio sapo = new anfibio();
		sapo.anfibioClasseH();
		sapo.caminharAnfibio();
		
		ave pato = new ave();
		pato.aveClasseH();
		pato.aveClasseC();
		
		mamifero mamifero1 = new mamifero();
		mamifero1.mamiClasseH();
		mamifero1.mamiClasseC();
		
		peixe tubarao = new peixe();
		tubarao.peixeClasseH();
		tubarao.peixeClasseC();
		
		reptil crocodilo = new reptil();
		crocodilo.repClasseH();
		}
}
