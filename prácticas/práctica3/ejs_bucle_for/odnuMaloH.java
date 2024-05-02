package com.programación2.prácticas.práctica3.ejs_bucle_for;

import java.util.Scanner;

import com.programación2.Ejercicio;

/** Ejercicio propio #5 usando el bucle for. */

public class odnuMaloH extends Ejercicio {

/** ctor default */
	
public odnuMaloH()
{
id = 5;
nombre = "Imprimir cadena de texto en reversa";
		        
esPropio = true;
}

@Override

/** Imprime una cadena de reversa usando el bucle for. */
	
public void ejecutar(Scanner lector)
{
String cadena = "Hola, Mundo. Esto se lee de atrás pa' alante";


for(int i = cadena.length() - 1; i >= 0; i--)
System.out.print(cadena.charAt(i) );

}

}