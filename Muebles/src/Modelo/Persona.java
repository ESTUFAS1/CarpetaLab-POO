package Modelo;

public class Persona {
	private String nombre;
	private int energia;
	private boolean hambre;
	private float temperatura;
	
	
	public Persona(String nombre, int energia, boolean hambre, float temperatura) {
		super();
		this.nombre = nombre;
		this.energia = energia;
		this.hambre = hambre;
		this.temperatura = temperatura;
	}
	
	
	public Persona() {
	}
	
	
	public void comer() {
		
	}
	
	public void llamar() {
		
	}
	
	public void dormir() {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int isEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	public boolean isHambre() {
		return hambre;
	}
	public void setHambre(boolean hambre) {
		this.hambre = hambre;
	}
	public float getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	
}
