package Ejercicio14;

public class Marciano {
	
	/**
	 * Creamos los atributos
	 */
	private static int contadorMarciano;
	private boolean vivo = false;
	private String nombre;
	
	/**
	 * Hacemos el constructor vaciio
	 */
	Marciano(){
		
	}
	
	/**
	 * Creamos el constructor sobrecargado que 
	 * autom�ticamente diga que pase a estar vivo
	 * que lo a�ada al contador de marcianos vivos
	 * y que imprima el mensaje de nacer.
	 * @param nombre
	 */
	Marciano(String nombre) {
		
		this.nombre = nombre;
		vivo = true;
		contadorMarciano ++;
		nace();
	}
	
	//Este m�todo crea el mensaje de que un marciano a nacido
	public String nace() {
		return "Hola he nacido y soy el marciano "+nombre;
	}
	
	/*
	 * En este m�todo se pueden matar los marcianos y que los quite
	 * de la lista de los que estan vivos
	 */
	public String muere() {
		if (vivo == true) {
			vivo = false;
			contadorMarciano --;
			return "El marciano "+nombre+" ha muerto";
		}else{
			return "El marciano ya esta muerto";	
		}
	}
	
	//Con este m�todo podemos comprobbar que marcianos estan vivos
	public String estaVivo(){
		if (vivo == true) {
			return "El marciano "+nombre+ "esta vivo";
		}else {
			return "El marciano "+nombre+" esta muerto";
		}
	}
	
	//Este m�todo nos indica cunatos macianos hay vivos
	public String cuentaMarcianos() {
		return "Hay "+contadorMarciano+" marcianos vivos";
	}

}
