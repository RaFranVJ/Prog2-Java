package com.programación2.prácticas.práctica3.ejs_bucle_while;

import java.util.Scanner;

import com.programación2.Ejercicio;

/** Ejercicio propio usando el bucle while */

public class PromedioSuma extends Ejercicio
{
/** ctor Base*/

public PromedioSuma()
{
id = 5;
nombre = "Promedio de una suma";
						        
esPropio = true;
}

@Override
	
public void ejecutar(Scanner lector)
{
int suma = 0;
int contador = 0;

System.out.println("Ingresa una serie de números o un número negativo para finalizar: ");

int numero = lector.nextInt();

while(numero >= 0) 
{
suma += numero;
contador++;

numero = lector.nextInt();
}

double promedio = suma / contador;

System.out.println("El promedio es de : " + promedio);
}

}