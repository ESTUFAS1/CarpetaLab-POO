package Metodos;

public class Personaje {
	private int vida;
	private int  energia;
	private int dañobase;
	private int probabilidad;
	private int posicion;
	

	//cada vez que necesitemos usar "probabilidad" generaremos un nuevo valor en el atributo para usarlo
	public void generarprobabilidad() {
		probabilidad = (int)(Math.random() * 100) + 1;
	}
	
	
	
	public void movimiente() {
		
		generarprobabilidad();		//ejecutamos posibilidad

		
		energia -=1;		//energia consumida para hacer movimiento

		
		//si probabilidad es 70% o inferior avanza 1mts
		if(probabilidad <= 70) {
			posicion +=1;	
		}
		//si probabilidad es 90% y es mayor al 70% anterir avanza 2mts

		else if(probabilidad <= 90 && probabilidad > 70){
			posicion +=2;
		}
		//si probabilidad es 98% y es mayor al 90% anterir avanza 3mts

		else if(probabilidad <= 98 && probabilidad > 70) {
			posicion +=3;
		}
		//si toca 99 y 100 directamente no sucede nada
	}
	
	
	public void cargarEnergia() {
		
		generarprobabilidad();		//ejecutamos posibilidad


		energia -= 1;		//energia consumida para hacer movimiento

		
		//si probabilidad es 70% o inferior, solo cargara 3 de energia
		if(probabilidad <= 70) {
			energia +=3;	
		}
		//si probabilidad es 90% y es mayor al 70%, solo cargara 5 de energia

		else if(probabilidad <= 90 && probabilidad > 70){
			energia +=5;
		}
		//si probabilidad es 98% y es mayor al 90%, solo cargara 7 de energia

		else if(probabilidad <= 98 && probabilidad > 70) {
			energia +=7;
		}
		
		//si toca 99 y 100 directamente no sucede nada
	}
	
	
	
	
	
	
	//set y get vida
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	//set y get energia
	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}
	//set y get daño base
	public int getDañobase() {
		return dañobase;
	}

	public void setDañobase(int dañobase) {
		this.dañobase = dañobase;
	}
	

}
