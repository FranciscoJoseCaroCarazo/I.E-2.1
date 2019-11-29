package Ejercicio7;

public class main_asignatura {

	public static void main(String[] args) {
		
		//Creo las clases
		Asignatura asigantura1 = new Asignatura("Lengua",3);
		Asignatura asignatura2 = new Asignatura("Matematicas",7);
		
		//llamo a los metodos
		System.out.println(asigantura1.verNota());
		System.out.println(asignatura2.verNota());
		
		
	}

}
