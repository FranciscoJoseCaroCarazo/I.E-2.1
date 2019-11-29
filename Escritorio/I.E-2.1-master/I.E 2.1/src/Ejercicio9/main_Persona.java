package Ejercicio9;

public class main_Persona {

	public static void main(String[] args) {
		
		//Creo los los objetos
		Docente docente1 = new Docente();
		Estudiante estudiante1 = new Estudiante();
		
		//utilizo metodos para añadirle valores a los atrivutos
		estudiante1.setPagoPension(800);
		estudiante1.setRango(20);
		
		//uso los metodos que me pidan
		System.out.println("El rango es "+estudiante1.getRango());
		System.out.println(estudiante1.descuentoParcial());
		
		//Le asigno a los docentes unos estudios postgrado, lo imprimo
		
		docente1.setEstudiospost("Grado en medicina");
		System.out.println("Los Estudios de postgrado que ha hecho son "+docente1.getEstudiospost());
		
		//Le doy el pago parcial
		
		docente1.pagoParcial(6, 13);
		System.out.println("El pago parcial del es "+docente1.pago());
		
		
		
		
		
			
		
	}

}
