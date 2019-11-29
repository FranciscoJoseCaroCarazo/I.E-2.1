package Ejercicio12;

public class Empleado {
	
	/**
	 * Inicializo los atributos
	 */
	private String nombre;
	private double tarifa, horas;
	
	/**
	 * constructor vacio
	 */
	
	Empleado (){
		
	}

	/**
	 * Constructor sobrecargado
	 * @param nombre
	 * @param tarifa
	 * @param horas
	 */
	
	public Empleado(String nombre, double tarifa, double horas) {
		
		this.nombre = nombre;
		this.tarifa = tarifa;
		this.horas = horas;
	}
	
	/**
	 * Metodo que nos calcula el sueldo de los trabajadores
	 * @return
	 */
	
	public double sueldo() {
		if (horas < 40) {
			return (tarifa*horas);
		}else{
			return 40*tarifa + (horas - 40)*(tarifa*1.5);
		}
	
		
		
	}
	
	/**
	 * este metodo nos da toda la informacion de los trabajadores
	 * @return
	 */
	
	public String getInfo() {
		if (horas <40) {
			return ("El empleado "+nombre+" ha trabajado "+horas+" y su sueldo es "+sueldo());
		}else {
			return ("El empleado "+nombre+" ha trabajado "+horas+" y ha hecho "+(horas-40)+" horas extras cobrando "
					+" y su sueldo es "+sueldo());
		}
		
	}
}
	
	
	


