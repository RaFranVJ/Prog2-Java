package com.programación2.prácticas.práctica2;

import com.fran_utils.ConsolaGenerica.*;

import com.programación2.Ejercicio;

import java.util.Scanner;

public class Meses extends Ejercicio
{
// Constructor por default
		
public Meses()
{
id = 4;
nombre = "Meses del año";

esPropio = true;
}

// Según el caso, asignarle un valor a nombreMes
	    
private String nombrarMes(int numeroMes)
{
String nombreMes;

switch(numeroMes)
{
case 1:
nombreMes = "Enero";
break;

case 2:
nombreMes = "Febrero";
break;

case 3:
nombreMes = "Marzo";
break;

case 4:
nombreMes = "Abril";
break;

case 5:
nombreMes = "Mayo";
break;

case 6:
nombreMes = "Junio";
break;

case 7:
nombreMes = "Julio";
break;

case 8:
nombreMes = "Agosto";
break;

case 9:
nombreMes = "Septiembre";
break;

case 10:
nombreMes = "Octubre";
break;

case 11:
nombreMes = "Noviembre";
break;

case 12:
nombreMes = "Diciembre";
break;
	            
default:
nombreMes = "Número no válido";
break;
}

return nombreMes;
}

@Override

// Usa la sentencia switch-case para, según el caso, mostrar un mes del año

public void ejecutar(Scanner lector)
{
int numero = EntradaDatos.leerNumEnRango(1, 12, "Escoge un mes", lector);
String nombreMes = nombrarMes(numero);

System.out.println("Seleccionaste: " + nombreMes);
}

}