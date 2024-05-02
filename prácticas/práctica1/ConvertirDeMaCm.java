package com.programación2.prácticas.práctica1;

import com.fran_utils.ConsolaGenerica.EntradaDatos;
import com.programación2.Ejercicio;

import java.util.Scanner;

public class ConvertirDeMaCm extends Ejercicio
{
/** Constante usada para convertir de m a cm y viceversa. */

protected static final int metrosEnCm = 100;

// Constructor por default

public ConvertirDeMaCm()
{
id = 3;
nombre = "Convertir de metros a centímetros";

esPropio = true;
}

// Convierte la cantidad ingresada de m a cm

@Override

public void ejecutar(Scanner lector)
{
float cantidadMts = EntradaDatos.leerValor(lector, "Introduce la cantidad de metros", float.class);

// Calcular la cantidad en metros (cm por 100)
float cantidadCm = cantidadMts * metrosEnCm;

// Mostrar la fórmula de conversión
System.out.println("Fórmula: cm = m x " + cantidadMts);

// Mostrar el resultado
System.out.printf("cm = %.2f x %d = %.2f\n", cantidadMts, metrosEnCm, cantidadCm);
}
    
}