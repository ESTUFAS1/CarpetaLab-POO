package Modelo;

public class Mueblesdecocina extends Mueble {
	
	private float calenturaMaxima = 200;
	private float calenturaMinima = 0;
	
	
	public Mueblesdecocina(float posicionX, float posicionY, float posicionZ, Nombre nombre, float vida, int cantidadPersonas, float temperatura, Estado estado, float suciedad) {
		super(posicionX, posicionY, posicionZ, nombre, vida, cantidadPersonas, temperatura, estado, suciedad);
	}
	
	
	
	
	
	public boolean esHorno() {
		if(getNombre() == Nombre.HORNO) {
			
			return true;
		}
		return false;
	}
	
	public boolean esHeladera() {
		if(getNombre() == Nombre.HELADERA) {
			setCalenturaMinima(-15);
			return true;
		}
		return false;
	}
	
	public boolean esMicroondas() {
		if(getNombre() == Nombre.MICROONDAS) {
			
			return true;
		}
		return false;
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