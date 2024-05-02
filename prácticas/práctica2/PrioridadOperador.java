package com.programación2.prácticas.práctica2;

import java.util.Scanner;

import com.programación2.Ejercicio;

// Ejercicio impropio #1 (Ejemplo 4.2 del libro)

public class PrioridadOperador extends Ejercicio
{
// Constructor por default

public PrioridadOperador()
{
id = 1;
nombre = "Prioridad de operaciones (Ejemplo 4.2)";

esPropio = false;
}

@Override

// Obtiene un resultado usando la prioridad de diferentes operadores
	
public void ejecutar(Scanner lector) 
{
// Calcular el resultado de la expresión
int resultado = 7 * 10 - 5 % 3 * 4 + 9;

// Imprimir la expresión y su resultado

System.out.println("Evaluando la expresión: \'7 * 10 - 5 % 3 * 4 + 9\' ");
System.out.println("Su resultado es: " + resultado);
}

}