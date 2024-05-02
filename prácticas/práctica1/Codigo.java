package com.programación2.prácticas.práctica1;

import java.util.Scanner;

import com.programación2.Ejercicio;

// Ejercicio impropio #6

public class Codigo extends Ejercicio
{
// Constructor por default

public Codigo()
{
id = 6;
nombre = "Códigos de escape";

esPropio = false;
}

@Override

// Muestra los diferentes códigos de escape que se utilizan en strings

public void ejecutar(Scanner lector)
{
char nuevaLinea = '\n';
 System.out.println("Salto de línea: " + nuevaLinea + "¡Nueva línea!");
 
 char tab = '\t';
 System.out.println("Tabulación" + tab + "de" + tab + "cadenas");
 
 char comillaSimple = '\'';
 System.out.println(comillaSimple + "Comilla simple" + comillaSimple);
 
 char comillaDoble = '\"';
 System.out.println(comillaDoble + "Comilla doble" + comillaDoble);
 
char barraInv = '\\';
System.out.println("Barra invertida: " + barraInv);
}

}