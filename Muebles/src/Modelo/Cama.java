package Modelo;

public class Cama extends Mueblededescanso {

	
	public Cama(float posicionX, float posicionY, float posicionZ, Nombre nombre, float vida, float temperatura,
			Estado estado, float suciedad) {
		super(posicionX, posicionY, posicionZ, nombre, vida, temperatura, estado, suciedad);
		
	}
	
	public boolean esunaCama() {
		if(getNombre() == Nombre.CAMA) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int comodidaddelaCama() {
		setComodidad(100);
		return getComodidad();
	}
	
	public int protedelaCama() {
		setProtecontraelFrio(100);
		return getProtecontraelFrio();
	}
	
	public int capacidaddelaCama() {
		setCargaMaxima(3);
		return getCargaMaxima();
	}

}
