package Modelo;

public class Mueblededescanso extends Mueble {
	private int comodidad;
	private int cargaMaxima;
	private int protecontraelFrio;
	private int cantidadPersonas;

	public Mueblededescanso(float posicionX, float posicionY, float posicionZ, Nombre nombre, float vida,
			 float temperatura, Estado estado, float suciedad) {
		super(posicionX, posicionY, posicionZ, nombre, vida, temperatura, estado, suciedad);
	}
	
	public int cargaMaxima() {
		return cargaMaxima;
	}
	public int protecontraelFrio() {
		return protecontraelFrio;
	}
	
	public int cantidadPersonas() {
		return cantidadPersonas;
	}
	
	public int comodidad() {
		return comodidad;
	}
	
	public boolean seRompe() {
		if (cargaMaxima < cantidadPersonas) {
			return true;
		} else {
			return false;
		}
	}
	public int getCantidadPersonas() {
		return cantidadPersonas;
	}

	public void setCantidadPersonas(int cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
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
