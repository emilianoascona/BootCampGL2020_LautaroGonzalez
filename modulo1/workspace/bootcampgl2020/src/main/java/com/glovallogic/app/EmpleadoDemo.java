package com.glovallogic.app;
import java.util.Scanner;

public class EmpleadoDemo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		Empleado empleado=new Empleado();
		empleado.setSalario(1000);
		empleado.imprimir();
		int var1=3;
		int var2=1;
		int var3=var1+var2;
		if(var3<10) {
			System.out.println("la suma de los numeros es: "+var3);
		}else {
			System.out.println("la suma de los numeros es mayor a 10");
		}
		System.out.print("Ingrese un caracter: ");
		char caracter1=entrada.nextLine().charAt(0);
		comparar(caracter1);
		System.out.print("Ingrese un caracter segundo caracter: ");
		char caracter2=entrada.nextLine().charAt(0);
		comparar(caracter2);
	}
	
public static void comparar(char caracter1) {
	if(Character.isUpperCase(caracter1)) {
		System.out.print("es mayuscula");
	}else
		System.out.print("es minuscula");
}
}
