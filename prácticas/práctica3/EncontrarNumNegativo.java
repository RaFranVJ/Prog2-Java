/**
 * 
 */
package com.programación2.prácticas.práctica3;

import java.util.Scanner;

import com.fran_utils.ConsolaGenerica.EntradaDatos;
import com.programación2.Ejercicio;

/** Ejercicio impropio #22 (6.22 del libro) */

public class EncontrarNumNegativo extends Ejercicio {

/** ctor base */
public EncontrarNumNegativo()
{
id = 22;
nombre = "Suma hasta encontrar un número negativo";

esPropio = false;
}

@Override
	
public void ejecutar(Scanner lector)
{
boolean esNegativo = false;
int suma = 0;

while(!esNegativo)
{
int num = EntradaDatos.leerValor(lector, "Ingresa un número cualquiera", int.class);

System.out.println();

if(num < 0) // valor negativo se termina el bucle
{
System.out.println("Número negativo encontrado");
esNegativo = true;
}

else
{
int suma_anterior = suma;
suma += num;

System.out.printf("La suma de %d + %d es: %d\n", num, suma_anterior, suma);
}

}

}

}