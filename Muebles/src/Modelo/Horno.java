package Modelo;

public class Horno extends Muebledecocina{

	public Horno(float posicionX, float posicionY, float posicionZ, Nombre nombre, float vida, int cantidadPersonas,
			float temperatura, Estado estado, float suciedad) {
		super(posicionX, posicionY, posicionZ, nombre, vida, cantidadPersonas, temperatura, estado, suciedad);
	}
	
	public boolean esunHorno() {
		if(getNombre() == Nombre.HORNO) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
