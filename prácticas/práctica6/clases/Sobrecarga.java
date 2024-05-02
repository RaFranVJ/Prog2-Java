package com.programación2.prácticas.práctica6.clases;

public class Sobrecarga
{

public void prueba()
{
System.out.println(" Método sin argumentos.");
}
 
// Sobrecarga de prueba() con 1 parámetro tipo int

public void prueba(int x)
{
System.out.print(" Método con 1 argumento. ");

System.out.println(" x = " + x );
}

// Sobrecarga de prueba() con 2 parámetro tipo int

public void prueba(int x, int y)
{
System.out.print(" Método con 2 argumentos. ");
 
System.out.println(" x = " + x + "; y = " + y);
}

// Sobrecarga de prueba() con 3 parámetros

public void prueba(double x, double y, double z)
{
System.out.print(" Método con 3 argumentos. ");

System.out.println(" x = " + x + "; y = " + y + "; z = " + z);
}
 
}