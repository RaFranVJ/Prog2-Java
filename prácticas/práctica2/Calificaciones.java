package com.programación2.prácticas.práctica2;

import com.fran_utils.ConsolaGenerica.*;

import com.programación2.Ejercicio;

import java.util.Scanner;

// Ejercicio impropio #11 (Ejemplo 5.11 del libro)

public class Calificaciones extends Ejercicio
{
// Constructor por default

public Calificaciones()
{
id = 11;
nombre = "Prueba compuesta II: evaluar calificación (Ejemplo 5.11)";

esPropio = false;
}

@Override

// Evaluar que tan satisfactoria es la calificación de un estudiante

public void ejecutar(Scanner lector)
{
int nota = EntradaDatos.leerValor(lector, "Introduzca calificación (1 - 10), pulse Intro", int.class);

switch(nota)
{
case 10:
case 9: 

System.out.println("Excelente.");
break;

case 8:
case 7:
	
System.out.println("Notable.");
break;
 
case 6:
case 5:
	
System.out.println("Aprobado.");
break;

case 4:
case 3: 
case 2:
case 1: 
case 0: 
	
System.out.println("Suspendido.");
break;

default:
System.out.println("no es posible esta nota.");
break;
}

}

}