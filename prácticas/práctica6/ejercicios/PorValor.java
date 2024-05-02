package com.programación2.prácticas.práctica6.ejercicios;

import java.util.*;

import com.programación2.Ejercicio;

// Ejercicio impropio #4 (Ejemplo 9.4 del libro)

public class PorValor extends Ejercicio
{

public PorValor()
{
id = 4;
nombre = "Paso de parámetros por valor a un método";

esPropio = false;
}

static void demoLocal(int valor)
{
System.out.println("Dentro de demoLocal, valor = " + valor);

valor = 999;

System.out.println("Dentro de demoLocal, valor = " + valor);
}

@Override

public void ejecutar(Scanner lector)
{
int n = 10;

System.out.println("Antes de llamar a demoLocal, n = " + n);

demoLocal(n);

System.out.println("Después de la llamada, n = " + n); 
}

}