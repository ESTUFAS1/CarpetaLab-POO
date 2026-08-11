package Modelo;

public class Silla extends Mueblededescanso {

	public Silla(float posicionX, float posicionY, float posicionZ, Nombre nombre, float vida, float temperatura,
			Estado estado, float suciedad) {
		super(posicionX, posicionY, posicionZ, nombre, vida, temperatura, estado, suciedad);
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean esunaSilla() {
		if(getNombre() == Nombre.SILLA) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int comodidaddelaSilla() {
		setComodidad(50);
		return getComodidad();
	}
	
	public int protedelaSilla() {
		setProtecontraelFrio(0);
		return getProtecontraelFrio();
	}
	
	public int capacidaddelaSilla() {
		setCargaMaxima(1);
		return getCargaMaxima();
	}
}
