package Ejercicio1;

import java.util.Scanner;

public class main_DVDCine {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		DVDCine pelicula1 = new DVDCine();
		
		//Ahora pongo los Syso para pedir los datos de la película.
		//Y debajo un scanner vinculado con cada atributo de la pelicula
		
		
		System.out.println("Por favor introduzca los datos");
		System.out.println("Por favor introduzca el nombre de la pelicula ");
			pelicula1.setTitulo(entrada.nextLine());
		System.out.println("Por favor introduzca el director de la pelicula ");
			pelicula1.setDirector(entrada.nextLine());
		System.out.println("Por favor introduzca los actores de la pelicula ");
			pelicula1.setActores(entrada.nextLine());
		System.out.println("Por favor introduzca el genero de la pelicula ");
			pelicula1.setGenero(entrada.nextLine());
		System.out.println("Por favor introduzca el resumen de la pelicula ");
			pelicula1.setResumen(entrada.nextLine());
		System.out.println("Por favor introduzca la duracion de la pelicula ");
			pelicula1.setDuracion(entrada.nextInt());	

		//Llamo a los metodos
		System.out.println(pelicula1.muestraDVDCine());
		System.out.println(pelicula1.esThriller());
		System.out.println(pelicula1.tieneResumen());
		System.out.println(pelicula1.muestraDuracion());
			
			
			
	}

}

