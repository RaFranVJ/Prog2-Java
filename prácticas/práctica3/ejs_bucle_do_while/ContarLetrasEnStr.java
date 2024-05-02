package com.programación2.prácticas.práctica3.ejs_bucle_do_while;

import java.util.Scanner;

import com.programación2.Ejercicio;

/** Ejercicio propio #2 usando el bucle do-while */

public class ContarLetrasEnStr extends Ejercicio
{
/** ctor base */

public ContarLetrasEnStr()
{
id = 2;
nombre = "Contar letras en un string";
						        
esPropio = true;
}

@Override
	
public void ejecutar(Scanner lector)
{
String cadena;

int contador = 0;

do
{
System.out.print("Ingresa una cadena de texto: ");
cadena = lector.nextLine();

contador = cadena.length();
}

while (contador == 0);

System.out.printf("Hay %d caracteres en \"%s\".\n", contador, cadena);
}

}