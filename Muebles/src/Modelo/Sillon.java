package Modelo;

public class Sillon extends Mueblededescanso{

	public Sillon(float posicionX, float posicionY, float posicionZ, Nombre nombre, float vida, float temperatura,
			Estado estado, float suciedad) {
		super(posicionX, posicionY, posicionZ, nombre, vida, temperatura, estado, suciedad);
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean esunSillon() {
		if(getNombre() == Nombre.SILLON) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int comodidaddelSillon() {
		setComodidad(70);
		return getComodidad();
	}
	
	public int protedelSillon() {
		setProtecontraelFrio(50);
		return getProtecontraelFrio();
	}
	
	public int capacidaddelSillon() {
		setCargaMaxima(4);
		return getCargaMaxima();
	}
}
