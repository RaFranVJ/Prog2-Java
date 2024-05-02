package com.programación2.prácticas.práctica6.ejercicios;

import java.util.*;
import com.fran_utils.ConsolaGenerica.*;

import com.programación2.Ejercicio;

// Ejercicio propio #2

public class MCD extends Ejercicio
{

public MCD()
{
id = 2;
nombre = "Cálcular máximo común divisor en un Array";

esPropio = true;
}

public int mcd(int a, int b)
{

if(b == 0) 
return a;

else 
return mcd(b, a % b);
  
}

@Override

public void ejecutar(Scanner lector)
{
Integer[] numeros = { 20, 30, 60, 75, 120, 130 };

int resultado = numeros[0];

for (int i = 1; i < numeros.length; i++) 
resultado = mcd(resultado, numeros[i]);

SalidaDatos.imprimirArr(numeros, false);

System.out.printf("El MCD de los elementos es %d\n", resultado);
}

}