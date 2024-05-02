package com.programación2.prácticas.práctica5.clases;

// Primera clase impropia del ejercicio (8.10)

public class Empleado
{
// Nombre del empleado (visibilidad privada)

private String nombre; 

// salario en bruto
 
private double salario;

private Tiempo horaIngreso = new Tiempo();

public Empleado()
{
nombre = "Fulano de tal";
salario = 0;

horaIngreso.obtenerDef();
}

public Empleado(String nombre)
{
this.nombre = nombre;
salario = 15000;

horaIngreso.obtenerDef();
}
 
// leer nombre del empleado
 
public String leerNombre() 
{
return nombre;
}

public double obtenerSalario() {
	return salario;
}

public void asignarSalario(double salario) {
	this.salario = salario;
}

public void mostrarDatos()
{
System.out.println("====== Datos del empleado ======\n"); 

System.out.printf("Nombre: %s\n", nombre); 
System.out.printf("Salario: %.2f RD$\n", salario); 
System.out.printf("Hora de ingreso: %s\n", horaIngreso.toString() ); 
}

}