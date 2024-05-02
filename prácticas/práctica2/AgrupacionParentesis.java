package com.programación2.prácticas.práctica2;

import com.fran_utils.ConsolaGenerica.*;

import com.programación2.Ejercicio;

import java.util.Scanner;

// Ejercicio impropio 5 (Ejemplo de la página 100 del libro)

public class AgrupacionParentesis extends Ejercicio
{
// Constructor por default
	
public AgrupacionParentesis()
{
id = 5;
nombre = "Agrupación de operaciones con paréntesis (Ejemplo de la pág. 100)";

esPropio = false;
}

// Obtiene un resultado usando la prioridad de diferentes operadores

@Override

public void ejecutar(Scanner lector) 
{
int h = EntradaDatos.leerValor(lector, "Ingresa un número", int.class);

int j = EntradaDatos.leerValor(lector, "Ingresa otro número", int.class);
	
float x = (float)2.5; // convierte constante 2.5 de tipo double a float
double y = Math.pow(x, 2); // llamada al método pow

double resultado = (h + j) * (y - 5); // primero se evalúan las expresiones en paréntesis

// Imprimir la expresión y su resultado

System.out.println("Evaluando la expresión: \'(h + j) x (y -5)\' ");
System.out.println("Su resultado es: " + resultado);
}

}