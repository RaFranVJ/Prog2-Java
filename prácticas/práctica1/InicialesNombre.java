package com.programación2.prácticas.práctica1;

import java.util.*;
import com.fran_utils.ConsolaGenerica.*;

import com.programación2.Ejercicio;

// Ejercicio impropio #10 (Ejemplo 3.4 del libro)

public class InicialesNombre extends Ejercicio
{
// Constructor por default
	
public InicialesNombre()
{
id = 10;
nombre = "Iniciales de un nombre (Ejemplo 3.4)";

esPropio = false;
}

@Override

// Muestra las primeras y últimas iniciales de un nombre

public void ejecutar(Scanner lector)
{
char primerInicial = EntradaDatos.leerValor(lector, "Ingresa tu primer inicial", char.class);

char ultimaInicial = EntradaDatos.leerValor(lector, "Ingresa tu última inicial", char.class);

System.out.printf("Hola, %s.%s!\n", primerInicial, ultimaInicial);
}

}