package com.programación2.prácticas.práctica3.ejs_bucle_for;

import com.fran_utils.ConsolaGenerica.*;

import com.programación2.Ejercicio;

import java.util.Scanner;

public class ContarHasta extends Ejercicio
{
// Constructor por default

public ContarHasta()
{
id = 1;
nombre = "Conteo hasta un límite";

esPropio = true;
}
/** Cuenta desde el 1 hasta un determinado número. */
		
@Override

public void ejecutar(Scanner lector)
{
int contarHasta = EntradaDatos.leerNumEnRango(3, 100, "Ingresa un número hasta donde contar", lector);

// Iterar las veces definidas por el usuario e imprimir los números

for(int i = 1; i <= contarHasta; i++) 
System.out.print(i + " "); // Imprimir el número actual (i)
	        
System.out.println();
}

}