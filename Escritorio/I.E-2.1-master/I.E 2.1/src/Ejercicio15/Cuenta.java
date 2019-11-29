package Ejercicio15;

public class Cuenta {
		/**
		 * INiciamos los atributos
		 */
	
		private double saldo;
		
		/**
		 * constructor vacio
		 */
		
		Cuenta(){
			
		}
		
		/**
		 * Constructor sobrecargado
		 * @param saldo
		 */
		
		Cuenta(double saldo){
			
			this.saldo = saldo;
			
		}
		
		//Accedentes y mutadores

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		/**
		 * con este metodo se incrementa el saldo
		 * @param i
		 */
		public void ingresar(float i) {
			saldo+=i;
			
		}
		
		/**
		 * Con este metodo se reduce el saldo
		 * @param e
		 */
		public void extraer(float e) {
			saldo-=e;
		}
			
	}


