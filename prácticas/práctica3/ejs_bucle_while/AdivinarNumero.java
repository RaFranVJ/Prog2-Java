package com.programación2.prácticas.práctica3.ejs_bucle_while;

import java.util.Random;
import java.util.Scanner;

import com.programación2.Ejercicio;

/** Ejercicio propio #4 usando el bucle while */

public class AdivinarNumero extends Ejercicio
{
/** ctor base */

public AdivinarNumero()
{
id = 4;
nombre = "Juego: adivina un número";
				        
esPropio = true;
}

@Override
	
public void ejecutar(Scanner lector)
{
Random azar = new Random();

// Generar un número aleatorio entre 1 y 100
int numAleatorio = azar.nextInt(100) + 1;

int numIntentos = 1;
int numUsuario;

System.out.print("Adivina el número oculto entre 1 y 100: ");

// El bucle while se repite hasta que el usuario adivine el número

while( (numUsuario = lector.nextInt() ) != numAleatorio)
{

if(numUsuario < numAleatorio)
System.out.print("Demasiado bajo. Intenta de nuevo: ");

else
System.out.print("Demasiado alto. Prueba otra vez: ");

System.out.println();
numIntentos++;
}

System.out.printf("¡Has acertado! Eso te tomó %d intento (s).\n", numIntentos);
}

}