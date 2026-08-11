package Modelo;

public abstract class Muebledecocina extends Mueble {
	
	private float calenturaMaxima;
	private float calenturaMinima;
	
	
	public Muebledecocina(float posicionX, float posicionY, float posicionZ, Nombre nombre, float vida, int cantidadPersonas, float temperatura, Estado estado, float suciedad) {
		super(posicionX, posicionY, posicionZ, nombre, vida, temperatura, estado, suciedad);
	}
	
	public float calenturaMaxima() {
		return calenturaMaxima;
	}
	
	public float calenturaMinima() {
		return calenturaMinima;
	}
	
	public boolean estaHot() {
		if(calenturaMaxima < getTemperatura()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean estaCold() {
		if(calenturaMinima > getTemperatura()) {
			return true;
		}
		return false;
	}
	
	public boolean destruccionporCalentura() {
		if(estaHot()) {
			
			return true;
		}
		else {
			return false;
		}
	}
	
	public float getCalenturaMinima() {
		return calenturaMinima;
	}


	public void setCalenturaMinima(float calenturaMinima) {
		this.calenturaMinima = calenturaMinima;
	}


	public float getCalenturaMaxima() {
		return calenturaMaxima;
	}


	public void setCalenturaMaxima(float calenturaMaxima) {
		this.calenturaMaxima = calenturaMaxima;
	}

}