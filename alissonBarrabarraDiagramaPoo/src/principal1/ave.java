package principal1;

import principal.animal; 

public class ave extends animal{
	String habitat;
	
	
	public String aveClasseH() { 
		animal ave = new animal();
		ave.setHabitat("As aves vivem em ambientes aquáticos e terrestre.");
		System.out.println(ave.getHabitat());
		return habitat;
	}
	
	public void aveClasseC() {
		animal ave= new animal();
		ave.setCaminhar("As aves apresentam duas asas e duas patas, sendo que em alguns casos como por exemplo o pato\napresenta as patas com membrana entre os dedos, o que permite essas aves viverem em \nambientes aquáticos.\n");
		System.out.println(ave.getCaminhar());
	}
}
