package Ejercicio16;

public class Main_Personaje {

	public static void main(String[] args) {
		
		Guerrero sportacus = new Guerrero("Sportacus", 100, "lanza");
		Mago merlin = new Mago("Merlin", "fuego");
		
		System.out.println(sportacus.combatir(20));
		System.out.println(merlin.encantar());
		sportacus.alimentarse(15);
		merlin.alimentarse(15);
		
	}

}
