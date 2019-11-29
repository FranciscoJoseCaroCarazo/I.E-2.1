package Ejercicio9;

public class Estudiante extends Persona{
	
	/**
	 * iniciamos los atributos
	 */
	
	private int codigo, pagoPension, rango;
	private String categoria, colegioanteri;
	
	/**
	 * constructor vacio
	 */
	
	Estudiante(){
		
	}

	/**
	 * constructor sobrecargado
	 * @param codigo
	 * @param pagopension
	 * @param rango
	 * @param categoria
	 * @param colegioanteri
	 */
	
	Estudiante(int codigo, int pagopension, int rango, String categoria, String colegioanteri){
		this.codigo = codigo;
		this.pagoPension = pagopension;
		this.categoria = categoria;
		this.colegioanteri = colegioanteri;
		this.rango = rango;
	}

	//accedentes y mutadores
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getPagoPension() {
		return pagoPension;
	}

	public void setPagoPension(int pagoPension) {
		this.pagoPension = pagoPension;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getColegioanteri() {
		return colegioanteri;
	}

	public void setColegioanteri(String colegioanteri) {
		this.colegioanteri = colegioanteri;
	}
	
	public int getRango() {
		return rango;
	}

	public void setRango(int rango) {
		this.rango = rango;
	}

	/**
	 * con este metodo aplico el tanto por ciento dependiendo del rango
	 * @return
	 */
	public String descuentoParcial() {
		if (rango < 13) {
			return "Tiene un 0% de Descuento lo que corresponde a "+pagoPension;
		}else if (rango >= 13 && rango <=16) {
			return "Tiene un 8% de Descuento lo que corresponde a "+(pagoPension*0.92);
		}else {
			return "Tiene un 15% de descuento lo que corresponde a "+(pagoPension*0.85);
		}
	}
	
	
	
	
	
}
