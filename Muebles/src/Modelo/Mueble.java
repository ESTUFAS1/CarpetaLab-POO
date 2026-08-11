
package Modelo;

public abstract class  Mueble {
	private float posicionX;
	private float posicionY;
	private float posicionZ;
	private float vida;
	private Nombre nombre;
	private float temperatura;
	private Estado estado;
	public float suciedad;
	



	public Mueble(float posicionX, float posicionY, float posicionZ, Nombre nombre, float vida, float temperatura, Estado estado, float suciedad) {
		this.nombre = nombre;
		this.setVida(vida);
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.posicionZ = posicionZ;
		this.setTemperatura(temperatura);
		this.estado = estado;
		this.suciedad = suciedad;
	} 
	
	
	
	
	
	
	public void usarMueble() {
		System.out.println("Usando...");
	}
	
	public void moverMueble() {
		System.out.println("Moviendo...");
	}
	public void ensuciarMueble() {
		System.out.println("Ensuciando...");
	}

	
	public float getPosicionX() {
		return posicionX;
	}
	public void setPosicionX(float posicionX) {
		this.posicionX = posicionX;
	}
	public float getPosicionY() {
		return posicionY;
	}
	public void setPosicionY(float posicionY) {
		this.posicionY = posicionY;
	}
	public float getPosicionZ() {
		return posicionZ;
	}
	public void setPosicionZ(float posicionZ) {
		this.posicionZ = posicionZ;
	}
	public Nombre getNombre() {
		return nombre;
	}
	public void setNombre(Nombre nombre) {
		this.nombre = nombre;
	}

	public float getVida() {
		return vida;
	}

	public void setVida(float vida) {
		this.vida = vida;
	}


	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public float getSuciedad() {
		return suciedad;
	}

	public void setSuciedad(float suciedad) {
		this.suciedad = suciedad;
	}
	
	
}
