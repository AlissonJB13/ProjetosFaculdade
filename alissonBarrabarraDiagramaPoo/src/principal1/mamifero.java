package principal1;

import principal.animal;

public class mamifero extends animal {
	public void mamiClasseH() { 
		animal mamifero = new animal();
		mamifero.setHabitat("Os mamiferos vivem em ambientes aquáticos e terrestre.");
		System.out.println(mamifero.getHabitat());
	}
	public void mamiClasseC() {
		animal mamifero1 = new animal();
		mamifero1.setCaminhar("Os cachorros vivem em ambientes terrestres e apresentam dois pares de \npatas, se locomovendo por meio delas.");
		System.out.println(mamifero1.getCaminhar());
		animal mamifero2 = new animal();
		mamifero2.setCaminhar("Os gatos, assim como os cachorros, vivem em ambientes terrestres e apresentam dois pares de \npatas, se locomovendo por meio delas.");
		System.out.println(mamifero2.getCaminhar());
		animal mamifero3 = new animal();
		mamifero3.setCaminhar("Os morcegos por outro lado são os únicos mamíferos que possuem asas, sendo que essas são \nadaptações de suas patas, onde há uma membrana entre as patas dianteiras e traseiras, \npermitindo como que esse animal possa voar, e também se locomover no solo.\n");
		System.out.println(mamifero3.getCaminhar());
	}
}
