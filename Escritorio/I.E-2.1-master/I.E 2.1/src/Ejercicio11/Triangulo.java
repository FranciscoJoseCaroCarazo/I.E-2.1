package Ejercicio11;

public class Triangulo {
	
	/**
	 * Iniciamos los atributos
	 */
	
	private double l1, l2, l3;
	
	/**
	 * Constructor vacio
	 */
	
	Triangulo(){
		
	}
	
	/**
	 * Constructor con atributos
	 * @param l1
	 * @param l2
	 * @param l3
	 */
	
	Triangulo(double l1, double l2, double l3){
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	
	}
	
	/**
	 * Método que nos dice si los triangulos son iguales
	 * @param a
	 * @param b
	 * @return
	 */
	
	public boolean compareTo_Triangulos(Triangulo a, Triangulo b) {
        boolean resultado;
        if (a.l1==b.l1 && a.l2==b.l2 && a.l3 == b.l3) {
            resultado = true;
        } else { 
            resultado = false;
        }
        return resultado;
    }
	
	/**
	 * Método que nos dice con un numero los lados comunes de los triangulos
	 * y su respectivo nombre.
	 */
	  
	
	public int tipo_Triangulo() {
		
		if (l1==l2 && l1==l3) {
			return 1;
		}else if (l1!=l2 && l1!=l3 ) {
			return 3;
		}else {
			return 2;
		}
	}

}