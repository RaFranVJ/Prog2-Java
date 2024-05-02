package com.programación2.prácticas.práctica1;

import java.util.Scanner;

import com.programación2.Ejercicio;

// Ejercicio impropio #7

public class LaLuna extends Ejercicio
{
// Distancia de la tierra a la luna en millas

protected static final int DistanciaEnMillas = 238857;

// Constructor por default

public LaLuna()
{
id = 7;
nombre = "La luna";

esPropio = false;
}

@Override

// Calcula la distancia a la luna de millas a kilómetros

public void ejecutar(Scanner lector)
{
System.out.println("---> Distancia de la Tierra a la Luna <----");

System.out.print("\nEn millas: " + DistanciaEnMillas + '\u002E');

double distanciaEnKm = DistanciaEnMillas * 1.609; // Una milla = 1.609 kilómetros
System.out.print("En kilómetros: " + distanciaEnKm + "km");
}

}