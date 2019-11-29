package Ejercicio12;

public class main_empleado {
	
	public static void main(String[] args) {
	
		//Creo los objetos con constructores sobrecargados
		Empleado empleado1 = new Empleado("Curro", 30, 41);
		Empleado empleado2 = new Empleado("Curro", 30, 39);
		Empleado empleado3 = new Empleado("Curro", 30, 45);
		
		//Llamo a los metodos
		System.out.println(empleado1.getInfo());
		System.out.println(empleado2.getInfo());
		System.out.println(empleado3.getInfo());

	}
}
	