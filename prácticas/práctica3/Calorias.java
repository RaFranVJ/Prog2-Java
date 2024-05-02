package com.programación2.prácticas.práctica3;

import com.fran_utils.ConsolaGenerica.*;

import com.programación2.Ejercicio;

import java.util.Scanner;

/** Ejercicio impropio #1 (6.1 del libro) */

public class Calorias extends Ejercicio
{
// Constructor por default
		
public Calorias()
{
id = 1;
nombre = "Cálculo de calorías";

esPropio = false;
}

/** Calcula la cantidad total de calorías. */

@Override
	
public void ejecutar(Scanner lector)
{
int num_de_elementos = EntradaDatos.leerValor(lector, "¿Cuántos alimentos ha comido hoy? Introduzca el valor", int.class);

int calorias_por_alimento;

System.out.printf("======= Introducir el número de calorías de cada uno de los %d alimentos tomados ========", num_de_elementos);

int calorias_total = 0;

int cuenta = 1;

while (cuenta++ <= num_de_elementos)
{
String msg = String.format("Ingresa cantidad de calorias en el alimento #%d", cuenta);

calorias_por_alimento = EntradaDatos.leerValor(lector, msg, int.class);

calorias_total += calorias_por_alimento;
}

System.out.println("Las calorías totales consumidas hoy son = " + calorias_total);
}

}