package ejer5;

public class Televisor extends Electrodomestico {
	private double pulgadas;
	private String resolucion;
	
	public void cambiarDeCanal() {
		System.out.println("se cambio de canal");
	}
	public Televisor() {	
	}
	
	public void Encender() {
		System.out.println("se encencio el televisor");
	}
}
