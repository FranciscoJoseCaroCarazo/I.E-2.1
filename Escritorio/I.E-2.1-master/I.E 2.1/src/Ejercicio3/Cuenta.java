package Ejercicio3;

public class Cuenta {

	
	/**
	 * contador cuenta es estatico por que si no cada vez que cree un cuenta
	 * me daria el valor de la ultima creada que empieza por 100000
	 */
	private static long contadorcuenta = 100000;
	private long dni, numcuenta;
	private double saldo, interes;
	
	
	/**
	 * ponemos la variable contadorcuenta en los dos constructores para que al crear un objeto se sume uno al contador
	 * y ese numero se le asigne a esa cuenta
	 */
	Cuenta (){
		contadorcuenta++;
		numcuenta = contadorcuenta;
	}
	
	/**
	 * Hacemos el constructor sobrecargado
	 * @param dni
	 * @param saldo
	 * @param interes
	 */
	Cuenta (long dni, double saldo, double interes){
		contadorcuenta++;
		numcuenta = contadorcuenta;
		this.saldo=saldo;
		this.interes=interes;
		this.dni=dni;
		this.numcuenta=numcuenta;
	}
	
	//Accedentes y mutadores

	public long getNumcuenta() {
		return numcuenta;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}
	
	public double actualizarSaldo() {
		saldo -=(interes/365);
		return saldo;
	}
	
	public void ingresar(double d) {
		saldo += d;
	}
	
	
	/**
	 * En este metodo podemos retirar dinero de la cuenta pero
	 * si queremos quitar mas nos dara un aviso
	 * @param r
	 * @return
	 */
	public String retirar(double r ) {
		
		if (r > saldo){
			return " La operacion no puede realizarse ";
		}else {saldo -= r;
			return " has retirado "+r;
		}
		
	}
	
	/**
	 * Con este Métodos mostramos toda la informacion de la cuenta
	 * @return
	 */
	public String MostrarDatos() {
		return (" El DNI del Cliente es "+dni+" con numero de cuenta"+numcuenta+" tiene "+saldo+" euros con un interes de "+interes+" %");
	}
}
