package com.programación2.prácticas.práctica3.ejs_bucle_while;

import java.util.Scanner;

import com.fran_utils.ConsolaGenerica.EntradaDatos;
import com.programación2.Ejercicio;

/** Ejercicio propio #3 usando el bucle while */

public class SucesionFibonacci extends Ejercicio
{
/** ctor base */

public SucesionFibonacci()
{
id = 3;
nombre = "Mostrar sucesión de Fibonacci";
			        
esPropio = true;
}

@Override

public void ejecutar(Scanner lector)
{
int longitudSerie = EntradaDatos.leerNumEnRango(3, 15, "Ingresa una longitud para la sucesión", lector);

int a = 0, b = 1;

System.out.print(a + ", " + b);

// Ejecutar el bucle while hasta que se alcance el límite de términos establecido

int terminosGenerados = 2;

while(terminosGenerados < longitudSerie)
{
int siguiente = a + b;
System.out.print(", " + siguiente);

a = b;
b = siguiente;

terminosGenerados++;
}

System.out.println();
}

}