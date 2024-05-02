package com.programación2.prácticas.práctica3;

import java.util.Scanner;

import com.programación2.Ejercicio;

/** Ejercicio impropio #9 (6.9 del libro) */

public class Multiplos extends Ejercicio
{
/** Crea una nueva instancia de 'Multiplos' */

public Multiplos()
{
id = 9;
nombre = "Omitir múltiplos de 3";

esPropio = false;
}

@Override

public void ejecutar(Scanner lector)
{
final int CLAVE = 3;
final int RANGO = 999;

int n = (int)Math.random() * RANGO + 1;

for(int i = 0; i < n; i++)
{
int numero = (int)Math.random() * RANGO + 1;

if(numero % CLAVE == 0)
{
System.out.println();
continue;
}
	 
System.out.print(" " + numero);
}

}

}