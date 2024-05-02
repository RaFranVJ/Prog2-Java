package com.programación2.prácticas.práctica5.clases;

// Clase propia #1

public class Carro
{
private String marca;

public String color;

private int año;

public Carro(String marca,  String color, int año)
{
this.marca = marca;
this.color = color;
this.año = año;
}

public void mostrarInfo()
{
System.out.println("====== Datos del vehículo ======\n"); 

System.out.printf("Marca: %s\n", marca); 
System.out.printf("Color: %s\n", color); 
System.out.printf("Año: %d\n", año); 
}

public String obtenerMarca() {
	return marca;
}

public void asignarMarca(String marca) {
	this.marca = marca;
}

public int obtenerAño() {
	return año;
}

public void asignarAño(int año) {
	this.año = año;
}



}

