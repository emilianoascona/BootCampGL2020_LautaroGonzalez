package com.glovallogic.app;

public class EjerIf {
	public static void main(String[] args) {
		int compra=400;
		if(compra==300) {
			int var=(compra*20)/100;
			System.out.println("el descuento es de: "+var);
		}else
			if(compra>=350){
				int var2=(compra*25)/100;
				System.out.println("el descuento es de: "+var2);		
			}else
				System.out.println("la compra es menor a 300");
	}
}
