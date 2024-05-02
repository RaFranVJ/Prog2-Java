package com.programación2.prácticas.práctica2;

import com.fran_utils.ConsolaGenerica.EntradaDatos;
import com.programación2.Ejercicio;

import java.util.Scanner;

// Ejercicio impropio #6 (Ejemplo 5.4 del libro)

public class Divisible extends Ejercicio
{
// Constructor por default
	
public Divisible()
{
id = 6;
nombre = "Verificar si un número es divisible (Ejemplo 5.4)";

esPropio = false;
}

@Override

// Verifica que n sea divisible entre d

public void ejecutar(Scanner lector)
{
int n = EntradaDatos.leerValor(lector, "Introduzca primer valor", int.class);

int d = EntradaDatos.leerValor(lector, "Introduzca segundo valor", int.class);

if(n % d == 0)
System.out.println(n + " es divisible entre " + d);
	 
else
System.out.println(n + " no es divisible entre " + d);

}

}