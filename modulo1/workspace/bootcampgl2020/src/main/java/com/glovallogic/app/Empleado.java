package com.glovallogic.app;

public class Empleado {
static private double salario;
static private String nombre="alex";

public static double getSalario() {
	return salario;
}
public static void setSalario(double salario) {
	Empleado.salario = salario;
}
public static String getNombre() {
	return nombre;
}
public static void setNombre(String nombre) {
	Empleado.nombre = nombre;
}
public  void imprimir() {
	System.out.println("nombre del empleado: "+this.getNombre()+" su salario: "+this.getSalario());
}
}
