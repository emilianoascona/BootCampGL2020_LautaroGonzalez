package ejer5_3;

public class Gato {
	private String nombre;

	private int patas;

	public String getNombre(){ return nombre;}

	public int getPatas(){ return patas;}

	public void setNombre(String nuevoNombre){ nombre = nuevoNombre;}

	public void setPatas(int numeroPatas){ patas = numeroPatas;}
	
	public static void main(String[] args) {
		Gato gato= new Gato();
		gato.setNombre("gato1");
		gato.setPatas(2);
		System.out.print("el gato se llama: "+gato.getNombre()+" y pobre tiene "+gato.getPatas()+" patas nada mas");
	}
}
