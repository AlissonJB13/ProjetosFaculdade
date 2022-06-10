package principal1;

import principal.animal; 

public class reptil extends animal {
	public void repClasseH() { 
		animal reptil = new animal();
		reptil.setHabitat("Os répteis vivem em ambientes aquáticos e terrestre.");
		System.out.println(reptil.getHabitat());
		reptil.setCaminhar("Réteis em geral apresentam quatro patas, como é o caso dos crocodilos, funcionando para \nlocomoção tanto na terra quanto na água, entretanto, cobras não apresentam patas, rastejando \npara que possa se locomover");
		System.out.println(reptil.getCaminhar());
	}
}
