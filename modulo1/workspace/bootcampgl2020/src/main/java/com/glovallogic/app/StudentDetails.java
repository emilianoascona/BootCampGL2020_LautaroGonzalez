package com.glovallogic.app;
import java.util.Scanner;

public class StudentDetails {
	public static void main(String[] args) {
		StudentDetails estudiante=new StudentDetails();
		Scanner entrada = new Scanner(System.in);
		int edad=estudiante.studentAge();
		System.out.println("ingrese valor para sumar a edad del estudiante");
		int edad2 =edad+ estudiante.studentAge2(entrada.nextInt());
		System.out.print("la edad del alumno es: "+edad+" edad sumada: "+edad2);
	}
public static  int studentAge() {
	return 5;
}
public static  int studentAge2(int var) {
	return var+5;
}
StudentDetails(){
	
}
}
