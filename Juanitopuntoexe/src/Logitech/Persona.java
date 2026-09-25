package Logitech;

public class Persona {
	//_______________________________________atributos y constructor__________________________________
	private int capacidadestomago = 100;
	private int cantidadingerida;

	public Persona(int capacidadestomago, int cantidadingerida) {
		super();
		this.capacidadestomago = capacidadestomago;
		this.cantidadingerida = cantidadingerida;
	}
	
	
	//_______________________________________metodos_________________________________________________
	public void comer ()
	{
		if (estalleno())
		{
			cantidadingerida += 1000;
			if (cantidadingerida > capacidadestomago)
			{
				cantidadingerida = capacidadestomago;
			}
		}
	}
	public boolean estalleno()
	{
		if (cantidadingerida >= capacidadestomago * 0.9)
		{
			return true;
		}
		else
			return false;
		
	}
	public void crecer()
	{
		capacidadestomago +=10;
	}
	public void aprende()
	{
		if (estalleno())
		{
			System.out.println("aprendió!");
		}
		else {
			System.out.println("No aprendió...");
		}
	}
	public void digiere()
	{
		cantidadingerida = 0;
	}
	/*
	public static void main(String[] args) {
		int capacidadestomago = 100;
		int cantidadingerida = 0;
		
		comer(cantidadingerida, capacidadestomago);
		crecer(capacidadestomago);
		estalleno(cantidadingerida, capacidadestomago);
		aprende(capacidadestomago, cantidadingerida);
		digiere(cantidadingerida);
		}
	*/	
	

	//_____________________________get y set______________________________________________________________
	public int getCapacidadestomago() {
		return capacidadestomago;
	}


	public void setCapacidadestomago(int capacidadestomago) {
		this.capacidadestomago = capacidadestomago;
	}


	public int getCantidadingerida() {
		return cantidadingerida;
	}


	public void setCantidadingerida(int cantidadingerida) {
		this.cantidadingerida = cantidadingerida;
	}
	
}

