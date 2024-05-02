package com.programación2.prácticas.práctica3;

import java.util.Scanner;

import com.programación2.Ejercicio;

/** Ejercicio impropio #19 (6.19 del libro). */

public class Factorial2 extends Ejercicio
{
// ctor
    
public Factorial2()
{
id = 19;
nombre = "Factorial de un número usando bucle anidado";

esPropio = false;
}

/** Calcula el factorial de un número dado usando un bucle anidado. */

@Override
    
public void ejecutar(Scanner lector)
{
final int N = 10;

for(int n = 1; n <= N; n++)
{
long fact = 1;
int m;

for(m = n ; m > 1; m--)
fact *= m;

System.out.println(n + "! = " + fact);
}

}

}