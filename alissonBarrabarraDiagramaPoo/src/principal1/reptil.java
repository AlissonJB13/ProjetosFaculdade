package principal1;

import principal.animal; 

public class reptil extends animal {
	public void repClasseH() { 
		animal reptil = new animal();
		reptil.setHabitat("Os r�pteis vivem em ambientes aqu�ticos e terrestre.");
		System.out.println(reptil.getHabitat());
		reptil.setCaminhar("R�teis em geral apresentam quatro patas, como � o caso dos crocodilos, funcionando para \nlocomo��o tanto na terra quanto na �gua, entretanto, cobras n�o apresentam patas, rastejando \npara que possa se locomover");
		System.out.println(reptil.getCaminhar());
	}
}
