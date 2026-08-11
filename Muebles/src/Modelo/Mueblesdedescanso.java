package Modelo;

public class Mueblesdedescanso extends Mueble{
	private int comodidad;
	private int cargaMaxima;
	private int protecontraelFrio;
	
	
	public Mueblesdedescanso(float posicionX, float posicionY, float posicionZ, Nombre nombre, float vida, int cantidadPersonas, float temperatura, Estado estado, float suciedad) {
		super(posicionX, posicionY, posicionZ, nombre, vida, cantidadPersonas, temperatura, estado, suciedad);
}

	
	public boolean seRompe() {
		if(cargaMaxima < getCantidadPersonas()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	
	
	public int getComodidad() {
		return comodidad;
	}

	public void setComodidad(int comodidad) {
		this.comodidad = comodidad;
	}
	
	public int getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	public int getProtecontraelFrio() {
		return protecontraelFrio;
	}

	public void setProtecontraelFrio(int protecontraelFrio) {
		this.protecontraelFrio = protecontraelFrio;
	}


}
	