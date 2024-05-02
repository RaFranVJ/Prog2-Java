package com.programación2.prácticas.práctica3;

import java.util.Scanner;

import com.programación2.Ejercicio;

/** Ejercicio impropio #16 (6.16 del libro). */

public class TablasMul extends Ejercicio
{
// Constructor por default

public TablasMul()
{
id = 16;
nombre = "Tablas de multiplicar usando bucle for anidado";

esPropio = false;
}
	
/** Muestra todos los múltiplos de varios factores. */

@Override

public void ejecutar(Scanner lector)
{
final int xultimo = 2;
final int yultimo = 5;

for(int x = 1; x <= xultimo; x++)
{
	
for(int y = 1; y <= yultimo; y++)
{
int producto = x * y;
System.out.printf("| %d x %d = %d |\n", x, y, producto);
}

}

}

}
