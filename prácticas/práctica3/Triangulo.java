/**
 * 
 */
package com.programación2.prácticas.práctica3;

import java.util.Scanner;

import com.programación2.Ejercicio;

/** Ejercicio impropio #18 (6.18 del libro). */

public class Triangulo extends Ejercicio
{
/** Ctor base */
	
public Triangulo()
{
id = 18;
nombre = "Dibujar triángulo isósceles";

esPropio = false;
}

@Override
	
public void ejecutar(Scanner lector)
{
final int NUMLINEAS = 5;
final char BLANCO = ' ';
final char ASTERISCO = '*';

System.out.println(" ");

// bucle externo: dibuja cada línea

for(int fila = 1; fila <= NUMLINEAS; fila++)
{
System.out.print("\t");

 //primer bucle interno: escribe espacios

for(int blancos = NUMLINEAS - fila; blancos > 0;  blancos--)
System.out.print(BLANCO);

for (int cuenta_as = 1; cuenta_as < 2 * fila; cuenta_as++)
System.out.print(ASTERISCO);

System.out.println(" ");
} // fin del bucle externo

}

}
