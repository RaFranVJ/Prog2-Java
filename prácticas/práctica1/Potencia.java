package com.programación2.prácticas.práctica1;

import com.fran_utils.ConsolaGenerica.*;

import com.programación2.Ejercicio;

import java.util.Scanner;

// Ejercicio impropio #1

public class Potencia extends Ejercicio 
{
// Constructor por default
	
public Potencia()
{
id = 1;
nombre = "Calcular potencia";

esPropio = false;
}

@Override

// Calcula la potencia cuando el usuario ingresa la base y el exponente

public void ejecutar(Scanner lector)
{
// Capturar la base introducida por el usuario

double base = EntradaDatos.leerValor(lector, "Ingresa el valor de la base", double.class);

// Capturar el exponente introducido por el usuario

double exp = EntradaDatos.leerValor(lector, "Ingresa el valor del exponente", double.class);

double potencia = Math.pow(base, exp);
System.out.println(base + " ^ " + exp + " = " + potencia);
}

}