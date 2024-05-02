package com.programación2.prácticas.práctica2;

import com.fran_utils.ConsolaGenerica.EntradaDatos;
import com.programación2.Ejercicio;

import java.util.Scanner;

// Ejercicio impropio #8 (Ejemplo 5.7 del libro)

public class PruebaCompuesta extends Ejercicio
{
// Constructor por default

public PruebaCompuesta()
{
id = 8;
nombre = "Prueba compuesta: comparar número a 0 (Ejemplo 5.7)";

esPropio = false;
}

@Override

// Compara un número en base a cero (si es menor, igual o mayor que)

public void ejecutar(Scanner lector)
{
int numero = EntradaDatos.leerValor(lector, "Introduzca un número", int.class);

// comparar número a cero
 
if(numero > 0)
{
System.out.println(numero + "es mayor que cero");
System.out.println("Pruebe de nuevo introduciendo un número negativo");
}
 
else if(numero < 0)
{
 System.out.println(numero + "es menor que cero");
 System.out.println("Pruebe de nuevo introduciendo un número positivo");
}
 
else
{
System.out.println(numero + "es igual a cero");
System.out.println("¿Por qué no introduce un número negativo?");
}

}

}