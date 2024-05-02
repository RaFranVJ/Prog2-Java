package com.programación2.prácticas.práctica3;

import com.fran_utils.ConsolaGenerica.EntradaDatos;
import com.programación2.Ejercicio;

import java.util.Scanner;

/** Ejercicio impropio #8 (6.8 del libro) */

public class Clave2 extends Ejercicio
{
/** Crea una nueva instancia de 'Clave2' */

public Clave2()
{
id = 8;
nombre = "Hallar clave usando bucle indefinido";

esPropio = false;
}

@Override

public void ejecutar(Scanner lector)
{
final int CLAVE = -999;

for(;;)
{
String msg = String.format("Introduzca un número (o '%d' para terminar)", CLAVE);
int num = EntradaDatos.leerValor(lector, msg, int.class);

if(num == CLAVE)
break;
 
}

}

}