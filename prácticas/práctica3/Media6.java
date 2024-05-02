/**
 * 
 */
package com.programación2.prácticas.práctica3;

import java.util.Scanner;

import com.fran_utils.ConsolaGenerica.EntradaDatos;
import com.programación2.Ejercicio;

/** Ejercicio impropio #5 (6.5 del libro) */

public class Media6 extends Ejercicio
{
/** Crea una nueva instancia de 'Media6' */

public Media6()
{
id = 5;
nombre = "Media de 6 números";

esPropio = false;
}

@Override

/** Calcula la media de 6 números ingresados por el usuario. */
	
public void ejecutar(Scanner lector)
{
final int TotalNum = 6;

int contadorNum = 0;
double sumaNum = 0.0;

System.out.println("\n ======== Introduzca %d números =======" + TotalNum);

while(contadorNum < TotalNum)
{
String msg = String.format("Ingresa un número (%d restantes)", TotalNum - contadorNum);

double numero = EntradaDatos.leerValor(lector, msg, double.class);
sumaNum += numero; // añadir valor a Acumulador

++contadorNum; // incrementar números leídos
}

double media = sumaNum/contadorNum;
System.out.println("Media: \n" + media);
}

}