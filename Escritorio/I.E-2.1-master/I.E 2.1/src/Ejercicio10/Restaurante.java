package Ejercicio10;

public class Restaurante {
	
	/**
	 * Inicializo los atributos
	 */
	
	private int chocos, papas, comensales;
	
	/**
	 * Creamos constructor vacio
	 */
	
	Restaurante (){
		
	}
	
	/**
	 * Constructor sobrecargado
	 * @param chocos
	 * @param papas
	 */
	
	Restaurante (int chocos, int papas){
		this.chocos = chocos;
		this.papas = papas;
		
	}
	
	//Accedentes y mutadores
	
	public void showPapas() {
		System.out.println("En el almacen hay "+papas+" kilogramos de papas");
	}

	public void showChocos() {
		System.out.println("En el almacen hay "+chocos+" kilogramos de chocos");
	}
	
	/**
	 * este metodo añade chocos a los existentes
	 * @param c
	 */

	public void addChocos(int c) {
		chocos = chocos + c;
	}
	
	/**
	 * Este metodo añade papas a las existentes
	 * @param p
	 */
	
	public void addPapas(int p) {
		papas = papas + p;
	}
	
	/**
	 * Metodo para saber los comensales totales que puede alimentar
	 * @return
	 */
	public int getComensales() {
		int gentepapa = papas*3;
		int gentechoco = (chocos/2)*3;
		
		if (gentepapa > gentechoco) {
			comensales =  gentechoco;
		}if (gentechoco > gentepapa) {
			comensales = gentepapa;
		}
		return comensales;
		
	}
	
	
}