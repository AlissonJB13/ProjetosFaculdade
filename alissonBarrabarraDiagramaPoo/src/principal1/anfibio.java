package principal1;

import principal.animal;

public class anfibio extends animal {
		String anfibio;
		String caminhar;
		
		public String anfibioClasseH() { 
		animal anfibio1 = new animal();
		anfibio1.setHabitat("Os anfíbios vivem em ambientes aquáticos e terrestre.");
		System.out.println(anfibio1.getHabitat());
		return anfibio;
	}
		public String caminharAnfibio() {
			animal anfibio= new animal();
			anfibio.setCaminhar("O sapo em seu estágio larval anfíbio não caminha, pois vive em ambiente áquatico, se locomovendo através \nde uma cauda que funciona como nadadeira.\nEstágio adulto anfíbio se locomove normalmente tanto em ambiente aquático (dependendo da \nespécie de anfíbio) e terrestre por meio de suas patas.\n");
			System.out.println(anfibio.getCaminhar());
			return caminhar;
		}
}
