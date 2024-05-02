package com.programación2.prácticas.práctica1;

import java.util.Scanner;

import com.programación2.Ejercicio;

// Ejercicio impropio #4 (Ejemplo 3.1 del libro)

public class EvaluacionDeFunc extends Ejercicio
{
// Constructor por default
	
public EvaluacionDeFunc()
{
id = 4;
nombre = "Evaluar función (Ejemplo 3.1)";

esPropio = false;
}

// Calcular la función de X

private double derivar(double x)
{
return x * Math.sin(x) + 0.5;
}

@Override

// Evalua una función trigonométrica

public void ejecutar(Scanner lector)
{
double x = 3.14159/4.0;
double fDeX = derivar(x);

System.out.println("Valor de la función: " + fDeX);
}

}