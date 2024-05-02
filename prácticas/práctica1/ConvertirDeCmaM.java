package com.programación2.prácticas.práctica1;

import java.util.Scanner;

import com.fran_utils.ConsolaGenerica.EntradaDatos;

public class ConvertirDeCmaM extends ConvertirDeMaCm
{
// Constructor por default

public ConvertirDeCmaM()
{
id = 4;
nombre = "Convertir de centímetros a metros";

esPropio = true;
}

// Convierte la cantidad ingresada de cm a m

@Override

public void ejecutar(Scanner lector)
{
float cantidadCm = EntradaDatos.leerValor(lector, "Introduce la cantidad de centímetros", float.class);

// Calcular la cantidad en metros (dividir cm entre 100)
float cantidadMts = cantidadCm / metrosEnCm;

// Mostrar la fórmula de conversión
System.out.println("Fórmula: m = cm ÷ " + metrosEnCm);

// Mostrar el resultado
System.out.printf("m = %.2f ÷ %d = %.2f\n", cantidadCm, metrosEnCm, cantidadMts);
}
    
}