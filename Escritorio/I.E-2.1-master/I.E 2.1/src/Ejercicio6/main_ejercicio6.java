package Ejercicio6;

public class main_ejercicio6 {

	public static void main(String[] args) {
		
		//Creamos las clases
		Empleado empleado1 = new Empleado("Curro", 18, 8000);
		Persona persona1 = new Persona("Ruso", 48);
		
		//llamamos a sus metodos
		System.out.println(empleado1.Responsavilidades());
		System.out.println(empleado1.mostrarSueldo());
		System.out.println(persona1.Responsavilidades());
		
	}

}
