package Ejercicio1;

public class DVDCine {
	
	
	/**
	 * Creo las variables de la clase DVDCine
	 */
	private String titulo, director, actores, resumen, genero;
	private int duracion;
	
	
	/**
	 * Cremaos el constructor vacio
	 */
	public DVDCine() {
		
	}
	
	/**
	 * Creamos el construcror sobrecargado
	 * @param titulo
	 * @param director
	 * @param actores
	 * @param genero
	 * @param resumen
	 * @param duracion
	 */
	public DVDCine (String titulo, String director, String actores, 
	String genero, String resumen, int duracion){
		this.titulo=titulo;
		this.director=director;
		this.actores=actores;
		this.genero=genero;
		this.resumen=resumen;
		this.duracion=duracion;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActores() {
		return actores;
	}
	public void setActores(String actores) {
		this.actores = actores;
	}
	public String getResumen() {
		return resumen;
	}
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	/**
	 * Este metodo nos devuelve todos los datos sobre el objeto que vayamos a crear
	 * @return
	 */
	public String muestraDVDCine(){
		return (titulo+" de "+director+"\n"+"con "+actores+"\n"+genero+"-"+duracion+" minutos\n"+"Resumen: "+resumen);
	}
	
	/**
	 * En este metodo podemos ver si la pel�cula es de un genero utilizando equal que sirve para comparar String 
	 * ya que en el scanner del main podemos introducir mediante texto que genero es. Asi que si no pones thriller
	 * o THRILLER te pondra otra genero.
	 * @return
	 */
	public String esThriller() {
		if (genero.equals ("thriller") || genero.equals("THRILLER")){
			return "Si es un thriller ";
		}else{
			return "No es un thriller ";
		}
	}
	
	/**
	 * Este m�todo nos dice si la pelicula tiene resumen.
	 * @return
	 */
	public String tieneResumen(){
		if (resumen.isEmpty()) {
			return "La pelicula no tiene resumen";
		}else{
			return "La pelicula tiene resumen";
		}
	}
	
	/**
	 * Este metodo nos devuelve la duracion de la pel�cula
	 * @return
	 */
	public String muestraDuracion(){
		return ("Duracion: "+duracion);	
	}
	
	
	
}