package Ejercicio9;

public class Persona {
	
	/**
	 * inicializamos los atributos
	 */
	
	private String nombre, apellidos, dni ,sexo;
	
	/**
	 * Cremos contructor vacio
	 */
	
	Persona(){
		
	}
	
	/**
	 * creamos constructor sobrecargado
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param sexo
	 */
	Persona(String nombre, String apellidos, String dni, String sexo){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.sexo = sexo;
	}
	
	//accedentes y mutadores

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}	
	
	/**
	 * Este metodo imprime los datos de la persona
	 * @return
	 */
	public String datosPersona() {
		return "La persona se llama "+nombre+" "+apellidos+" su sexo es "+sexo+" y su DNI es "+dni;
	}
}
