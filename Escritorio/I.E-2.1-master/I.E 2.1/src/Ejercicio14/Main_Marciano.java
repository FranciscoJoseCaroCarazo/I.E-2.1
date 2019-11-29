package Ejercicio14;

import java.util.Scanner;

public class Main_Marciano {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//creo un array con 4 espacios para 4 marcianos
		Marciano array [] = new Marciano [4];
		System.out.println("Vamos crear unos marcianos");
		
		/*
		 * Recorro la array para que vaya creando cada marciano
		 * en cada espacio
		 */
		for (int i = 0; i < 3; i++) {
			System.out.println("�Como se llama el marciano?");
			String nombre = entrada.nextLine();
			Marciano et = new Marciano(nombre);
			array [i] = et;
			/*
			 * Justo despues de Crear el marciano nos saldra el 
			 * mensaje de que ha nacido y cuantos marcianos vivos hay.
			 */
			System.out.println(array [i].nace());
			System.out.println(array [i].cuentaMarcianos());			
		}
		
		//aqui mato al marciano que esta en el hueco 2
		System.out.println(array[1].muere());
		
		//Aqui hago que nazca en la posicion 4
		System.out.println("¿Como se llama el marciano?");
		String nombre = entrada.nextLine();
		Marciano et = new Marciano (nombre);
		//Metemos el marciano en el hueco 4 de la array
		array [3] = et;
		
		//vuelvo a pedir que maten al marciano de la posicion 2
		System.out.println(array[1].muere());
		
		
		for (int x = 0; x < array.length; x++) {
			System.out.println(array[x].estaVivo());
		}
		
	}

}
