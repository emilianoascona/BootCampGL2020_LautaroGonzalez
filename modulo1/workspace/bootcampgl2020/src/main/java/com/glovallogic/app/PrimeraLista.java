package com.glovallogic.app;

import java.util.ArrayList;
import java.util.List;

public class PrimeraLista {
	public static void main(String[] args) {
		List <String> letters=new ArrayList<String>();
		letters.add("A");
		letters.add("B");
		letters.add("C");
		for(String var: letters) {
			System.out.println(var);
		}
		System.out.println("----------------------------------------------------------------");
		letters.add(0, "X");;
		for(String var: letters) {
			System.out.println(var);
		}
	}

}
