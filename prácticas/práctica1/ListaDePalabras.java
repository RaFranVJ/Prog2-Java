package com.programación2.prácticas.práctica1;

import com.fran_utils.ConsolaGenerica.*;

import com.programación2.Ejercicio;

import java.util.*;

// Ejercicio propio #3

public class ListaDePalabras extends Ejercicio
{
// Constructor por default

public ListaDePalabras()
{
id = 3;
nombre = "Ordenar lista de palabras";

esPropio = false;
}
	
// Obtiene una lista de palabras escritas por el teclado

private String[] obtenerPalabras(Scanner lector)
{
String[] palabras = EntradaDatos.leerArreglo("Determina la cantidad de palabras", "Ingresa la palabra", lector, String.class);
return palabras;
}

// Ordena un Array de Strings en orden alfabético

private void alfabetizar(String[] palabras)
{
Arrays.sort(palabras);
}

// Visualiza los elementos de un Array tipo String

private void verPalabras(String[] arrPalabras)
{
System.out.println("====== Palabras =======");

// Imprimir los elementos del Array (palabras) uno por uno

for(String palabra : arrPalabras)
System.out.println(palabra);

}

@Override

// Obtiene una lista de palabras ingresadas por el usuario y luego las ordena

public void ejecutar(Scanner lector) 
{
String[] palabras = obtenerPalabras(lector);
alfabetizar(palabras);

verPalabras(palabras);
}

}
