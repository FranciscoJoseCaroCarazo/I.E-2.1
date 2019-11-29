package Ejercicio6;

public class Persona {
	
	
	/**
	 * 
	 * Inicializamos los atributos
	 */
	private String nombre;
	private int edad;
	
	/**
	 * Creamos constructor vacio
	 */
	public Persona(){
		
	}
	
	/**
	 * Creamos constructor sobrecargado
	 * @param nombre
	 * @param edad
	 */
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//Accedentes y mutadores

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	/**
	 * Este metodo nos muestra los datos de la clase 
	 * persona
	 * @return
	 */
	public String Responsavilidades() {
		return ("El nombre del Trabajador es "+nombre+" y su edad es "+edad);
	}

}
