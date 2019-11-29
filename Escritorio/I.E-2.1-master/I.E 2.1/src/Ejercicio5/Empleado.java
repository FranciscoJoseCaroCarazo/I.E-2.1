package Ejercicio5;

public class Empleado {
	
	private String nif;
	private int horaextra, numhijos;
	private double pagohoraextra, irpf, sueldobase;
	private boolean estadocivil;
	
	//constructor vacio
	
	Empleado(){
		
		
	}
	
	//constructor solo dni
	
	Empleado(String nif) {
		this.nif = nif;
	}
	
	

	Empleado(String nif, int sueldo, int horaextra, double pagohoraextra, int numhijos, double irpf, boolean estadocivil) {
		this.nif = nif;
		this.sueldobase = sueldobase;
		this.horaextra = horaextra;
		this.pagohoraextra = pagohoraextra;
		this.numhijos = numhijos;
		this.irpf = irpf;
		this.estadocivil = estadocivil;
	}

	//Accedentes y mutadores

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public double getSueldo() {
		return sueldobase;
	}

	public void setSueldo(int sueldobase) {
		this.sueldobase = sueldobase;
	}

	public int getHoraextra() {
		return horaextra;
	}

	public void setHoraextra(int horaextra) {
		this.horaextra = horaextra;
	}

	public double getPagohoraextra() {
		return pagohoraextra;
	}

	public void setPagohoraextra(int pagohoraextra) {
		this.pagohoraextra = pagohoraextra;
	}

	public int getNumhijos() {
		return numhijos;
	}

	public void setNumhijos(int numhijos) {
		this.numhijos = numhijos;
	}

	public double getIrpf() {
		return irpf;
	}

	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}

	public boolean isEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(boolean estadocivil) {
		this.estadocivil = estadocivil;
	}
	
	/**
	 * Calculo de la devoluci�n de horas extra.
	 * @return
	 */
	
	public double devolucionHoras() {
		return (horaextra*pagohoraextra);
	}
	
	
	/**
	 * Calculo sueldo bruto
	 * @return
	 */
	
	public double sueldoBruto() {
		return (sueldobase+devolucionHoras());
	}
	
	
	/*
	 * Aui vemos que si el trabajador esta casado se le restann dos puntos
	 * en el iirpf y si ademas tiene hijos se le resta un punto por cada hijo.
	 */
	public double devolucionIrpf() {
		
		if (estadocivil == true) {
	            
				irpf-=2;
	            irpf-=numhijos;
	            return ((sueldoBruto()*irpf)/100);

	        } else {
	            irpf-=numhijos;
	            return ((sueldoBruto()*irpf)/100);
	        }
		}
	
	
	
	/**
	 * Metodo que muestra poca informacion del empleado
	 * @return
	 */
	public String println() {
	
		return ("El empleado tiene como dni "+getNif()+ " y tiene "+numhijos+" hijos");
		
	}
	
	/**
	 * Metodo que nos devuelve toda la información
	 * @return
	 */
	public String printDatos() {
		
		return println()+" tiene un sueldo base de "+sueldobase+"\n su complemento de horas extras es "+devolucionHoras()+"\ny tiene"
                + "un sueldo bruto de "+sueldoBruto()+",\nteniendo un sueldo neto de "+(sueldoBruto()-devolucionIrpf())+"\n y un siendo su retencion de IRPF de "+(devolucionIrpf())+"  �";
	}
	

}
