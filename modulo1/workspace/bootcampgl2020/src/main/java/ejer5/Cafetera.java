package ejer5;

public class Cafetera extends Electrodomestico{
	private double litros;
	
	public void elegirSabor() {
		System.out.println("se eligio sabor");
	}
	
	public Cafetera() {	
	}
	
	public void Encender() {
		System.out.println("se encencio la cafetera");
	}
}
