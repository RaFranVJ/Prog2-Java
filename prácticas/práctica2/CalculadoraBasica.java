package com.programación2.prácticas.práctica2;

import com.fran_utils.ConsolaGenerica.*;

import com.programación2.Ejercicio;

import java.util.Scanner;

// Ejercicio propio #3

public class CalculadoraBasica extends Ejercicio
{
// Constructor por default
	
public CalculadoraBasica()
{
id = 3;
nombre = "Calculadora básica";

esPropio = true;
}

/// Suma dos números introducidos por el usuario
	
private void suma(Scanner lector)
{
int a = EntradaDatos.leerValor(lector, "Ingresa un número", int.class);

int b = EntradaDatos.leerValor(lector, "Ingresa otro número", int.class);

int c = a + b;
System.out.printf("%d + %d = %d%n%n", a, b, c);
}

// Resta dos números introducidos por el usuario

private void resta(Scanner lector)
{
int a = EntradaDatos.leerValor(lector, "Ingresa un valor para el minuendo", int.class);

int b = EntradaDatos.leerValor(lector, "Ingresa un valor para el sustraendo", int.class);

int c = a - b;
System.out.printf("%d - %d = %d%n%n", a, b, c);
}

// Multiplica dos números introducidos por el usuario.

private void multiplicacion(Scanner lector)
{
int a = EntradaDatos.leerValor(lector, "Ingresa un valor para el multiplicando", int.class);

int b = EntradaDatos.leerValor(lector, "Ingresa un valor para el multiplicador", int.class);

int c = a * b;
System.out.printf("%d × %d = %d%n%n", a, b, c);
}

// Divide dos números introducidos por el usuario

private void division(Scanner lector)
{
int a = EntradaDatos.leerValor(lector, "Ingresa un valor para el dividendo", int.class);

int b = EntradaDatos.leerValor(lector, "Ingresa un valor para el divisor", int.class);
	
// Si el divisor es diferente de 0, hacer la división

if(b != 0)
{
int c = a / b;
System.out.printf("%d ÷ %d = %d%n%n", a, b, c);
} 

// De lo contrario, mostrar un mensaje de advertencia al usuario

else 
System.out.println("\n\u221E Imposible dividir entre cero.");
     
}

// Eleva la base por el exponente seleccionado por el usuario

private void potencia(Scanner lector)
{
int a = EntradaDatos.leerValor(lector, "Ingresa un valor para la base", int.class);

int b = EntradaDatos.leerValor(lector, "Ingresa un valor para el exponente", int.class);

double c = Math.pow(a, b);
System.out.printf("%d ^ %d = %.2f%n%n", a, b, c);
}

// Obtiene la raiz del número seleccionado por el usuario

private void raiz(Scanner lector)
{
int a = EntradaDatos.leerValor(lector, "Ingresa un valor para el índice", int.class);

int b = EntradaDatos.leerValor(lector, "Ingresa un valor para el radicando", int.class);

double c = Math.pow(b, 1/a);
System.out.printf("%d√%d = %.2f%n%n", a, b, c);
}

// Hace una de las 6 operaciones básicas

private void hacerOperacion(int operacion, Scanner lector)
{

switch(operacion)
{
case 1:
suma(lector);
break;
                
case 2:
resta(lector);
break;

case 3:
multiplicacion(lector);
break;

case 4:
division(lector);
break;

case 5:
potencia(lector);
break;

case 6:
raiz(lector);
break;
                
default:
System.out.println("Operación no válida");
break;
}

}

@Override

// Calculadora con las 6 operaciones básicas

public void ejecutar(Scanner lector)
{
System.out.println("=========== Calculadora FRANSHIO ============\n");
        
System.out.println("1) Suma");
System.out.println("2) Resta");
System.out.println("3) Multiplicación");
System.out.println("4) División");
System.out.println("5) Potencia");
System.out.println("6) Raíz\n");

int operacion = EntradaDatos.leerValor(lector, "Selecciona una operación", int.class);

System.out.println();
hacerOperacion(operacion, lector);
}

}