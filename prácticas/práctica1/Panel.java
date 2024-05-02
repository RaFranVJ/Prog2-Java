package com.programación2.prácticas.práctica1;

import java.util.Scanner;

import com.programación2.Ejercicio;

// Ejercicio impropio #8

public class Panel extends Ejercicio
{
// Campos globales de la clase

protected int a, b, c;

// Constructor por default

public Panel()
{
id = 8;
nombre = "Panel";

esPropio = false;
}

// Inicializa la variable 'a' 
 
private double betas()
{
double x;
a = 21;
 
x = a;
return x;
}
 
// Otro campo de la clase (es una sumatoria de a y b)
 
protected int valor;

// Inicializa la variable 'b' y 'valor'
 
private double alfas()
{
float x;
b = 19;

valor = a + b;
x = valor;

return x;
}

@Override
 
 // Inicializa el valor de C
 
public void ejecutar(Scanner lector)
{
double beta = betas();
double alfa = alfas();

c = (int)(beta * alfa);

System.out.println("-----------> Panel <-------------");

System.out.print("\nA = " + a);
System.out.print("B = " + b);
System.out.print("C = " + c);
}

}