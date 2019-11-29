package Ejercicio6;

/**
 * convertimos la clase emplado en hija de
 * la clase Persona
 * @author Curro Caro
 * @see Persona
 *
 */
class Empleado extends Persona {
	
	
	/**
	 * Inicializamos los atributos
	 */
	private int sueldo;
	
	
	/**
	 * Creamos un constructor vacio
	 */
	Empleado(){
		
	}
	
	/**
	 * Creamos constructor sobrecargado
	 * @param nombre
	 * @param edad
	 * @param sueldo
	 */
	Empleado(String nombre, int edad, int sueldo) {
		super(nombre, edad);
		this.sueldo = sueldo;
	}
	
	//Accedentes y mutadores

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	
	/**
	 * Este metodo nos da el sueldo al mes del emplado
	 * @return
	 */
	public String mostrarSueldo() {
		return ("Su sueldo es de "+sueldo+" euro al mes");
	}
}
