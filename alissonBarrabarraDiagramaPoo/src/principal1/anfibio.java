package principal1;

import principal.animal;

public class anfibio extends animal {
		String anfibio;
		String caminhar;
		
		public String anfibioClasseH() { 
		animal anfibio1 = new animal();
		anfibio1.setHabitat("Os anf�bios vivem em ambientes aqu�ticos e terrestre.");
		System.out.println(anfibio1.getHabitat());
		return anfibio;
	}
		public String caminharAnfibio() {
			animal anfibio= new animal();
			anfibio.setCaminhar("O sapo em seu est�gio larval anf�bio n�o caminha, pois vive em ambiente �quatico, se locomovendo atrav�s \nde uma cauda que funciona como nadadeira.\nEst�gio adulto anf�bio se locomove normalmente tanto em ambiente aqu�tico (dependendo da \nesp�cie de anf�bio) e terrestre por meio de suas patas.\n");
			System.out.println(anfibio.getCaminhar());
			return caminhar;
		}
}
