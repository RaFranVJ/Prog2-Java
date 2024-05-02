package com.programación2.prácticas.práctica3;

import java.util.Scanner;

import com.programación2.Ejercicio;

/** Ejercicio impropio #14 (6.14 del libro) */

public class PotenciaUnoAMil extends Ejercicio {

/** Crea una nueva instancia de 'PotenciaUnoAMil' */
	
public PotenciaUnoAMil()
{
id = 14;
nombre = "Potencias de dos enteros entre 1 y 1000";

esPropio = false;
}

@Override
	
public void ejecutar(Scanner lector)
{
int pot = 1;

do
{
System.out.println(pot);
pot *= 2;
} 

while(pot < 1000);
}

}