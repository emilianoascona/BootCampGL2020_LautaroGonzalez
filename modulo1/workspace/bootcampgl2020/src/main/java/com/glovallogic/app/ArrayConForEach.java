package com.glovallogic.app;

public class ArrayConForEach {
	public static void main(String[] args) {
		String nombre="Bootcamp2020";
		char[] letras= nombre.toCharArray();
		for(char le:letras) {
			System.out.println("valor del vector: "+le);
		}
	}
}
