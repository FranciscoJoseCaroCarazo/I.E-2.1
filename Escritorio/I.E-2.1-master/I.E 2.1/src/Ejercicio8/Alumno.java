package Ejercicio8;

import Ejercicio7.Asignatura;

public class Alumno {
	
	
	/**
	 * Inicializo los atributos
	 */
	private String nombre;
	private int edad;
	private Asignatura asignatura;
	
	
	/**
	 * Creo un constructor vacio
	 */
	Alumno(){
		
	}

	/**
	 * Creo un cconstructor sobrecargado
	 * @param nombre
	 * @param edad
	 * @param asignatura
	 * @param nota
	 */
	Alumno(String nombre, int edad, String asignatura, int nota){
		this.nombre = nombre;
		this.edad = edad;
		Asignatura asignatura1 = new Asignatura(asignatura,nota);
		this.asignatura = asignatura1;
		
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
	 * Con este metodo no dice todos los datos del alumno
	 * @return
	 */
	public String verDatos() {
		return ("El Alumno "+getNombre()+" con edad de "+getEdad()+" Ha cursado "+asignatura.getAsignatura()+" \n "+
				" y "+asignatura.verNota());
	}
	
}
