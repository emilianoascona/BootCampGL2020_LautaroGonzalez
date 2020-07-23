package com.glovallogic.app;

public class DiasDeLaSemana {
	public static void main(String[] args) {
		String[]vec= new String[] {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
		for(int i=0;i<7;i++) {
			System.out.println("el dia de la semana es: "+vec[i]);
		}
		System.out.println("------------------------------------------------");
		int var=1;
		while(var<=50) {
			if(var%2==0) {
				System.out.println("el valor "+var+"es par");
			}else
				System.out.println("el valor "+var+"es impar");
		var++;
		}
	}
}
