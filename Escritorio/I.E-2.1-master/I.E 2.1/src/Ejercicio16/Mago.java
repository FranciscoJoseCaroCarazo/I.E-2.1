package Ejercicio16;

public class Mago extends Personaje {
	
	/**
	 * Creamos los atributos de la clase Mago
	 */
	
	private String poder;
	
	/**
	 * Creamos el constructor Vacio
	 */
	Mago(){
		
	}
	
	/**
	 * Creamos el constructor sobrecargado y le ponemos al mago 100
	 * de energia por defecto al ser creado.
	 * @param nombre
	 * @param energia
	 * @param poder
	 */
	Mago(String nombre, String poder){
		super(nombre, 100);

		this.poder = poder;	
	}
	
	//Accedentes y mutadores.

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}
	
	/**
	 * con este metodo el mago ataca con su poder pierde dos de su
	 * energia total
	 * @return
	 */
	public String encantar() {
		energia -= 2;
		return "El mago "+nombre+" a atacado con su poder "+poder+" y ha hastado 2 de energia y le queda "+energia+" energia";
		
	}

}
