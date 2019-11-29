package Ejercicio16;

public class Guerrero extends Personaje {
	
	/**
	 * Creamos los atributos de la clase Guerrero
	 */
	
	private String arma;
	
	/**
	 * Constructor vacio (Sin atributos)
	 */
	
	Guerrero(){
		
		
	}
	
	
	/**
	 * Constructor sobrecargado con todos los atributos
	 * @param nombre
	 * @param energia
	 * @param arma
	 */
	Guerrero(String nombre, int energia, String arma){
		super(nombre, energia);

		this.arma = arma;	
	}
	
	//Accedentes y mutadores

	public String getArma() {
		return arma;
	}


	public void setArma(String arma) {
		this.arma = arma;
	}
	
	/**
	 * En este metodo el guerrero ataca con un arma y pierde energia
	 * @param energia
	 * @return
	 */
	public String combatir(int energia) {
		this.energia -= energia;
		return "El gerrero "+nombre+" a atacado con su "+arma+" y ha hastado "+energia+" de energia";
		
	}
}
