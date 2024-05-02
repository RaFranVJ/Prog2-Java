package com.programación2.prácticas.práctica6.ejercicios;

import java.util.*;
import com.fran_utils.ConsolaGenerica.*;

import com.programación2.Ejercicio;

// Ejercicio propio #5

public class CalculadoraLogica extends Ejercicio
{
// ctor

public CalculadoraLogica()
{
id = 5;
nombre = "Calculadora de operaciones lógicas";

esPropio = true;
}

private boolean dialogDesplazarBits(Scanner lector)
{
String encabezado = "Dirección del desplazamiento de bits";

String cuerpo = "Ingresa %d para desplazar los bits a la izquierda.\n"
+ "De lo contrario, ingresa %d para mover los bits a la derecha.";

String msgSelec = "Elige la dirección para el desplazamiento de los bits";

return EntradaDatos.selecBooleana(encabezado, cuerpo, msgSelec, lector);
}

// Mostrar resultados en decimal y binario

private void mostrarResultados(int a, int b, int c, String operador)
{
System.out.println("======== Resultado ========\n\n");

String aBin = Integer.toBinaryString(a);
String bBin = Integer.toBinaryString(b);
String cBin = Integer.toBinaryString(c);

System.out.printf("Decimal: %d %s %d = %d \n", a, operador, b, c);
System.out.printf("Binario: %s %s %s = %s \n\n", aBin, operador, bBin, cBin);
}

/// Operador AND a nivel de bits

protected void and(Scanner lector)
{
int a = EntradaDatos.leerValor(lector, "Ingresa un número", int.class);
int b = EntradaDatos.leerValor(lector, "Ingresa otro número", int.class);

int c = a & b;

mostrarResultados(a, b, c, "&");
}

/// Operador OR a nivel de bits

protected void or(Scanner lector)
{
int a = EntradaDatos.leerValor(lector, "Ingresa un número", int.class);
int b = EntradaDatos.leerValor(lector, "Ingresa otro número", int.class);

int c = a | b;

mostrarResultados(a, b, c, "|");
}

/// Operador XOR a nivel de bits

protected void xor(Scanner lector)
{
int a = EntradaDatos.leerValor(lector, "Ingresa un número", int.class);
int b = EntradaDatos.leerValor(lector, "Ingresa otro número", int.class);

int c = a ^ b;

mostrarResultados(a, b, c, "^");
}

/// Complemento a nivel de bits

protected void complemento(Scanner lector)
{
int a = EntradaDatos.leerValor(lector, "Ingresa un número", int.class);
int b = ~(a);

String operador = "~";

System.out.println("======== Resultado ========\n\n");

String aBin = Integer.toBinaryString(a);
String bBin = Integer.toBinaryString(b);

System.out.printf("Decimal: %s(%d) = %d \n", operador, a, b);
System.out.printf("Binario: %s(%s) = %s \n\n", operador, aBin, bBin);
}
/// Desplazar los bits de un número

protected void desplazarBits(Scanner lector)
{
int a = EntradaDatos.leerValor(lector, "Ingresa un número", int.class);
int b = EntradaDatos.leerValor(lector, "Cantidad de bits a desplazar", int.class);

boolean desplazarDer = dialogDesplazarBits(lector);

int c;
String operador;

if(desplazarDer)
{
c = a >> b;
operador = ">>";
}

else
{
c = a << b;
operador = "<<";
}

mostrarResultados(a, b, c, operador);
}

// Realiza una operacion lógica segun el caso 

private void hacerOperacion(int operacion, Scanner lector)
{

switch(operacion)
{
case 1:
and(lector);
break;
             
case 2:
or(lector);
break;

case 3:
xor(lector);
break;

case 4:
complemento(lector);
break;

case 5:
desplazarBits(lector);
break;
          
default:
System.out.println("Operación no válida");
break;
}

}

@Override

public void ejecutar(Scanner lector)
{
System.out.println("=========== Calculadora lógica ============\n");
    
System.out.println("1) AND bit a bit");
System.out.println("2) OR bit a bit");
System.out.println("3) XOR bit a bit");
System.out.println("4) Complemento bit a bit");
System.out.println("5) Desplazamiento de bits\n");

int operacion = EntradaDatos.leerValor(lector, "Selecciona una operación", int.class);

System.out.println();

hacerOperacion(operacion, lector);
}

}