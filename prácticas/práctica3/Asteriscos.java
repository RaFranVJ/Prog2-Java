package com.programación2.prácticas.práctica3;

import java.util.Scanner;

import com.programación2.Ejercicio;

/** Ejercicio impropio #10 (6.10 del libro) */

public class Asteriscos extends Ejercicio
{
/** Crea una nueva instancia de 'Asteriscos' */

public Asteriscos()
{
id = 10;
nombre = "Mostrar filas de asteríscos";

esPropio = false;
}

@Override
	
public void ejecutar(Scanner lector)
{
final int COLUMNA = 17;
final int FILA = 17;

siguiente:

for(int f = 1; f <= FILA; f++)
{
System.out.println();

for(int c = 1; c <= COLUMNA; c++)
{

if (c > f)
continue siguiente;
	 
System.out.print('*');
}
	 
}

}

}