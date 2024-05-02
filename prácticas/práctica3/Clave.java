package com.programación2.prácticas.práctica3;

import com.fran_utils.ConsolaGenerica.*;

import com.programación2.Ejercicio;

import java.util.Scanner;

/** Ejercicio impropio #4 (6.4 del libro) */

public class Clave extends Ejercicio
{
/** Crea una nueva instancia de 'ClaveSecreta' */

public Clave()
{
id = 4;
nombre = "Hallar clave usando bucle while";

esPropio = false;
}

@Override

public void ejecutar(Scanner lector)
{
int clave = -9;
boolean activo = true;

while(activo)
{
int dato = EntradaDatos.leerValor(lector, "Digita el número clave", int.class);

if(dato != clave)
System.out.println("La clave es incorrecta. Inténtalo de nuevo.\n");
		 
else
{
System.out.println("¡Acceso concedido!\n");
activo = false;
}

}

}

}