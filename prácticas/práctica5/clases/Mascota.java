package com.programación2.prácticas.práctica5.clases;

// Clase propia #3

public class Mascota
{
String tipo;

String nombre;
    
String raza;
    
int edad;

public Mascota(String tipo, String nombre, String raza, int edad)
{
this.tipo = tipo;
this.nombre = nombre;

this.raza = raza;
this.edad = edad;
}

public void mostrarInfo()
{
System.out.println("====== Datos de la mascota ======\n"); 

System.out.printf("Tipo: %s\n", tipo); 
System.out.printf("Nombre: %s\n", nombre); 
System.out.printf("Raza: %s\n", raza); 
System.out.printf("Edad: %d años\n", edad); 
}

}