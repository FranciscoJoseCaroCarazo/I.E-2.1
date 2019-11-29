package Ejercicio15;

import java.util.Scanner;

public class main_Cuenta {

	public static void main(String[] args) {
	
			
			Scanner scanner = new Scanner (System.in);
			int cuenta;
			Cuenta cuenta1=null;
			
			//El switch case se repetira cuando hagamos algo que sea diferente a 6
			//por lo tanto cada vez que haga algo volvera al principio.
			
			do {
				System.out.println("1. Crear cuenta vacia");
				System.out.println("2. Crear cuenta con saldo inicial");
				System.out.println("3. Ingresar Dinero");
				System.out.println("4. Sacar Dinero");
				System.out.println("5. Ver Saldo");
				System.out.println("6. Salir");
				cuenta = scanner.nextInt();
			switch (cuenta) {
			
			//Se inician los casos
			
			case 1 :
				 
				cuenta1 = new Cuenta();
				System.out.println("Se ha creado una cuenta vacia.");
				break;
					
			case 2 :
				 
				System.out.println("¿Con cuanto dinero quiere crear la cuenta?");
				double saldo= scanner.nextDouble();
				cuenta1= new Cuenta(saldo);
				System.out.println("Se ha creado una cuenta con "+saldo+" Euros");
				break;
				
			case 3 :
				
				System.out.println("¿Cuanto dinero desea Ingresar");
				float i = scanner.nextFloat();
				cuenta1.ingresar(i);
				System.out.println("Se ha ingresado "+i+" euros");
				break;
				
			case 4 :
				
				System.out.println("¿Cuanto dinero desea Retirar");
				float e = scanner.nextFloat();
				cuenta1.extraer(e);
				System.out.println("Se ha retirado "+e+" euros");
				break;
				
			case 5 :
				
				cuenta1.getSaldo();
				System.out.println("El saldo de la cuenta es "+cuenta1.getSaldo());
				break;
				
			case 6 :
				
				System.out.println("Saliendo del programa");
				break;
				
				//Saldra este mensaje si no se pulsa un numero entre 1 y 6
					
			default:
				System.out.println("Por favor introduzca un numero entre 1 y 6");
				
			}
			
			//El ciclo se repetira hasta que no se pulse el numero 6
			
			} while (cuenta != 6);
			
		
			
			

		}
		

	}


