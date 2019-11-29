package Ejercicio3;

public class main_Cuenta {

	public static void main(String[] args) {
		
			Cuenta cuenta1 = new Cuenta(02653551, 200, 15);
			
			cuenta1.actualizarSaldo();
			System.out.println("El saldo actual es "+cuenta1.getSaldo());
			System.out.println("Tu numero de Cuenta es "+cuenta1.getNumcuenta());
			System.out.println("Has retirado "+cuenta1.retirar(100)+" Euros");
			System.out.println("Tienes "+cuenta1.actualizarSaldo()+" Euros");
		}


	}



