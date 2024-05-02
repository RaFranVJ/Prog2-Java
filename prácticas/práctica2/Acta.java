package com.programación2.prácticas.práctica2;

import com.fran_utils.ConsolaGenerica.EntradaDatos;
import com.programación2.Ejercicio;

import java.util.Scanner;

// Ejercicio propio #2

public class Acta extends Ejercicio
{
// Constructor por default
	
public Acta()
{
id = 2;
nombre = "Acta de nacimiento";

esPropio = true;
}

/** Obtiene los datos de una persona para simular un acta de nacimiento. */

@Override

public void ejecutar(Scanner lector) 
{
System.out.println("<------------- INFORMACIÓN DEL CIUDADANO ------------->\n");

String cedula = EntradaDatos.leerValor(lector, "Ingrese su cédula", String.class);

String nombre = EntradaDatos.leerValor(lector, "Ingrese su nombre", String.class);

String apellido = EntradaDatos.leerValor(lector, "Ingrese su apellido", String.class);

int edad = EntradaDatos.leerValor(lector, "Ingrese su edad", int.class);

// Verificar si la persona es mayor o menor de edad

String condicionLegal = obtenerCondLegal(edad);

// Una vez se recibe la información del ciudadano, se muestran los datos correspondientes:

System.out.println("\n<------------- SU ACTA DE NACIMIENTO ------------->\n");

System.out.println("Cédula: " + cedula);
System.out.println("Nombre completo: " + nombre + " " + apellido);
System.out.println("Edad: " + edad + " años");
System.out.println("Condición legal: " + condicionLegal);
}

/** Obtiene la condición legal de una persona basándose en su edad. */

private static String obtenerCondLegal(int edad)
{

if (edad >= 18)
return "Mayor de edad";

else
return "Menor de edad";
}

}