package Ejercicio13;

public class Alimentos {
	
	/**
	 * Creamos los atributos de la clase
	 */
	private double lipidos, hiidratoscarbono, proteinas;
	private boolean origenanimal;
	private String nombre;
	private char vitaminas, minerales;
	
	/**
	 * Creamos el constructor vacio
	 */
	Alimentos(){
		
	}
	
	/**
	 * Creamos el constructor sobrecargado
	 * @param lipidos
	 * @param hiidratoscarbono
	 * @param proteinas
	 * @param origenanimal
	 * @param nombre
	 * @param vitaminas
	 * @param minerales
	 */
	Alimentos(String nombre, double lipidos, double hiidratoscarbono, double proteinas, 
			boolean origenanimal, char vitaminas, char minerales) {
		
		this.nombre = nombre;
		this.lipidos = lipidos;
		this.hiidratoscarbono = hiidratoscarbono;
		this.proteinas = proteinas;
		this.origenanimal = origenanimal;
		this.nombre = nombre;
		this.vitaminas = vitaminas;
		this.minerales = minerales;
	}
	
	/**
	 * En este metodo sabremos que  si el alimento en diieteticosi los lipidos son
	 * mayores de 20 y si tiene alto o media cantidad de vitaminas
	 * @return
	 */
	public boolean esDietetico() {
		boolean a;
		if (lipidos < 20 && this.vitaminas == 'A' || this.vitaminas == 'M'){
				a = true;
			}else{
				a = false;
			}return a;
	
	}
	
	/**
	 * En este metodo lo que hacemos es que dependiendo de si es de origen animal
	 * mostrara todos los datos y dira si es animal o no
	 * @return
	 */
	public String muestraAlimentos() {
		if (origenanimal == true) {
		return ("Este alimento "+nombre+" tiene "+lipidos+" % de lipidos,\n "+vitaminas+" % de"
				+ " vitaminas, "+proteinas+" % de proteinas, tiene "+vitaminas+" vitaminas \n"
				+ " y "+minerales+ " mineraleses. Es de origen animal ");
		
		}else{
		return ("Este alimento "+nombre+" tiene "+lipidos+" % de lipidos,\n "+vitaminas+" % de"
				+ " vitaminas, "+proteinas+" % de proteinas, tiene "+vitaminas+" vitaminas \n"
				+ " y "+minerales+ " mineraleses. No es de origen animal ");
		}
		
		
	}	
}
