/**
 * 
 */
package com.programación2.prácticas.práctica3;

import java.util.Scanner;

import com.fran_utils.ConsolaGenerica.EntradaDatos;
import com.programación2.Ejercicio;

/** Ejercicio impropio #12 (6.12 del libro) */

public class Saludos extends Ejercicio
{
/** Crea una nueva instancia de 'Saludos' */

public Saludos()
{
id = 12;
nombre = "Mostrar saludo en pantalla";

esPropio = false;
}

@Override
	
public void ejecutar(Scanner lector)
{
char opcion;

do
{
System.out.println("Hola");

System.out.println("¿Desea otro tipo de saludo?");

opcion = EntradaDatos.leerValor(lector, "Pulse 's' para si o 'n' para no, a continuación pulse Intro", char.class);
}

while(opcion == 's'|| opcion == 'S');

System.out.println("Adiós");
}

}