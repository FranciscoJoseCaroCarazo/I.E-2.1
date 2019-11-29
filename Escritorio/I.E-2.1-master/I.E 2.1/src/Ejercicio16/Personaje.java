package Ejercicio16;

public class Personaje {
	
	//inicio de Atributos
	
	protected String nombre;
	protected int energia;
	
	/**
	 * constructor vacio
	 */
	Personaje(){
		
	}
	
	/**
	 * Constructor Sobrecargado
	 * @param nombre
	 * @param energia
	 */
	Personaje(String nombre, int energia){
		
		this.nombre = nombre;
		this.energia = energia;
	}
	
	//Accedentes y mutadores

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
	/**
	 * En este método se le suma a energia la energia introducida
	 * por ell metodo.
	 * @param energia
	 */
	
	public void alimentarse(int energia) {
		this.energia += energia;
		
	}
}
