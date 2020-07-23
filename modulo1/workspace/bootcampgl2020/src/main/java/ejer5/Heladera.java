package ejer5;

public class Heladera extends Electrodomestico {
	private double capacidad;
	private boolean tieneFreezer;
	private double capacidadDelFreezer;
	
	public void GuardarElemento() {
		System.out.print("elemento Guardado");
	}
	
	public void ExtraerElemento() {
		System.out.print("Extraer Elemento");
	}
	
	public Heladera(){	
	}
	
	public void Encender() {
		System.out.println("se encencio la heladera");
	}
}
