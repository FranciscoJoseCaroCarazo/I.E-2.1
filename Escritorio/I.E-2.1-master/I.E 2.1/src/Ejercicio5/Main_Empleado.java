package Ejercicio5;

public class Main_Empleado {

	public static void main(String[] args) {
		
		//creo los objetos
		Empleado empleado1 = new Empleado();
		Empleado empleado2 = new Empleado();
		
		//Doy valores a los atributos
		empleado1.setNif("12345678A");
		empleado1.setIrpf(15);
        empleado1.setPagohoraextra(10);
        empleado1.setHoraextra(40);
        empleado1.setEstadocivil(true);
        empleado1.setNumhijos(3);
        empleado1.setSueldo(1300);
		
        empleado2.setNif("12345678B");
		empleado2.setIrpf(16);
        empleado2.setPagohoraextra(10);
        empleado2.setHoraextra(39);
        empleado2.setEstadocivil(false);
        empleado2.setNumhijos(2);
        empleado2.setSueldo(1200);
        
        //Llamo a los metodos
		System.out.println(empleado1.printDatos());
		System.out.println(empleado2.printDatos());
		

	}

}
