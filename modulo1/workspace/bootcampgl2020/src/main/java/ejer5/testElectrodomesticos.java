package ejer5;

import java.util.ArrayList;
import java.util.List;

public class testElectrodomesticos {
	public static void main(String[] args) {
		Heladera heladera= new Heladera();
		Televisor televisor= new Televisor();
		Cafetera cafetera= new Cafetera();
		List <Electrodomestico> listaElectro= new ArrayList<Electrodomestico>();
		listaElectro.add(heladera);
		listaElectro.add(televisor);
		listaElectro.add(cafetera);
		Electrodomestico[] vecElectro= new Electrodomestico[] {heladera,televisor,cafetera};
		System.out.println("-------polimorfismo en un array--------------");
		for(int i=0;i<vecElectro.length;i++) {
			vecElectro[i].Encender();
		}
		System.out.println("-------polimorfismo en un arrayList--------------");
		for(Electrodomestico var:listaElectro) {
			var.Encender();
		}
	}
}
