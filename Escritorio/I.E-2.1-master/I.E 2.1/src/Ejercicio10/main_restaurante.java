package Ejercicio10;

public class main_restaurante {

	public static void main(String[] args) {
		
	//Añado los valores de los atributos.	
	Restaurante casaconde = new Restaurante(60,50);
			
	//Llamo a los métodos
			casaconde.addChocos(0);
			casaconde.addPapas(15);
			casaconde.showChocos();
			casaconde.showPapas();
			System.out.println(casaconde.getComensales());

	}

}


