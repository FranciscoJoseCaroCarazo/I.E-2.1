package Ejercicio7;

public class Asignatura {
	
	/**
	 * Inicizamos los Atributos
	 */
	public int nota;
	public String asignatura;
	
	/**
	 * Creamos un constructor vacio
	 */
	public Asignatura(){
		
	}
	
	/**
	 * Creamos un constructor sobrecargado
	 * @param asignatura
	 * @param nota
	 */
	public Asignatura(String asignatura, int nota){
		this.asignatura = asignatura;
		this.nota = nota;
	}

	//Accedentes y mutadores
	
	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	
	/**
	 * Este metodo nos dice si la nota es mayor de 5 es aprobado,
	 * y si no estara suspendido
	 * @return
	 */
	public String verNota() {
		if (nota >= 5) {
			return ("Esta Aprobado con un "+nota);
		}else{
			return ("Esta Suspendido con un "+nota);
		}
	}
	
	/**
	 * Metodo para consultar la asigantura
	 * @return
	 */
	public String getAsignatura() {
		return asignatura;
	}
	
}
