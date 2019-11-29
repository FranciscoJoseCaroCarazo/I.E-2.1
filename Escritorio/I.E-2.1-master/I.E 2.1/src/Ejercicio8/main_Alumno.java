package Ejercicio8;

public class main_Alumno {

	public static void main(String[] args) {
		
		
		//Creo los objetos con sus atributos
		Alumno ruso = new Alumno ("Ruso", 40, "lengua", 10 );
		Alumno fermin = new Alumno ("Fermin", 45, "matematicas", 4);
		Alumno barrasa = new Alumno ("Barroso", 13, "Sociales", 8);
		
		//Llamo a los metodos de las clases
		System.out.println(ruso.verDatos());
		System.out.println(fermin.verDatos());
		System.out.println(barrasa.verDatos());
	}
}

