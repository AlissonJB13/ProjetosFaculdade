package principal1;

import principal.animal;

public class peixe extends animal {
	public void peixeClasseH() { 
		animal peixe = new animal();
		peixe.setHabitat("Os peixes vivem somente em ambientes aqu�ticos.");
		System.out.println(peixe.getHabitat());
	}
	public void peixeClasseC() {
		animal peixe = new animal();
		peixe.setCaminhar("Ao inv�s de apresentarem patas para locomo��o em ambientes terrestres, os peixes apresentam \nnadadeiras, o que permite com que esses animais possam se locomover dentro da �gua.\n");
        System.out.println(peixe.getCaminhar());	
	}

}
