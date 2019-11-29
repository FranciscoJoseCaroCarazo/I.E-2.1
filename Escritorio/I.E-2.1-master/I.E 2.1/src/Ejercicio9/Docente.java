package Ejercicio9;

public class Docente extends Persona {
	
	/**
	 * inicializamos los atributos
	 */
	
	private String estudiospost, categoria;
	private int codigo, horasclase, pagohora;
	private double pago;
	
	
	/**
	 * constructor vacio
	 */
	
	Docente(){
		
	}
	
	/**
	 * contructor sobrecargado
	 * @param estudiospost
	 * @param categoria
	 * @param codigo
	 * @param horasclase
	 * @param pagohora
	 * @param pago
	 */

	Docente(String estudiospost, String categoria, int codigo, int horasclase, int pagohora, double pago){
	this.estudiospost = estudiospost;
	this.categoria = categoria;
	this.codigo = codigo;
	this.horasclase = horasclase;
	this.pagohora = pagohora;
	this.pago = pago;
	}

	//accdentes y mutadores
	
	public String getEstudiospost() {
		return estudiospost;
	}

	public void setEstudiospost(String estudiospost) {
		this.estudiospost = estudiospost;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getHorasclase() {
		return horasclase;
	}

	public void setHorasclase(int horasclase) {
		this.horasclase = horasclase;
	}

	public double getpagoHora() {
		return pagohora;
	}

	public void setPagohora(int pagohora) {
		this.pagohora = pagohora;
	}
	
	public double getPago() {
		return pago;
	}

	public void setPago(double pago) {
		this.pago = pago;
	}
	
	
	/**
	 * Método para saber el pago parcial.
	 * @param pagohora
	 * @param horasclase
	 */
	
	public void pagoParcial(int pagohora, int horasclase) {
		
		this.pagohora = pagohora;
		this.horasclase = horasclase;
		pago=horasclase*pagohora;
	}
	
	/**
	 * metodo que devuelva el resultado del pago parcial
	 * @return
	 */
	public double pago() {
		return pago; 
	}
	
}	
