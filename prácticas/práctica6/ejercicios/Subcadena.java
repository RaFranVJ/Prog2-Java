package com.programación2.prácticas.práctica6.ejercicios;

import java.util.*;
import com.fran_utils.ConsolaGenerica.*;

import com.programación2.Ejercicio;

// Ejercicio propio #2

public class Subcadena extends Ejercicio
{

public Subcadena()
{
id = 1;
nombre = "Obtener una sub-cadena de texto";

esPropio = true;
}

private String obtenerSub(String cadena, int posIni, int longitud)
{
int longitudCadena = cadena.length();
int posFin = posIni + longitud;

if(posFin > longitudCadena)
posFin %= longitudCadena;

return cadena.substring(posIni, posFin);	  
}

@Override

public void ejecutar(Scanner lector)
{
String cadena = EntradaDatos.leerValor(lector, "Ingresa una cadena de texto", String.class);
int longitudCadena = cadena.length();

int posMax = longitudCadena - 1;
int posSub = EntradaDatos.leerNumEnRango(0, posMax, "Posición de dónde copiar los caracteres", lector);

int longitudSub = EntradaDatos.leerNumEnRango(1, posSub + 1, "Cantidad de caracteres", lector);
String sub = obtenerSub(cadena, posSub, longitudSub);

System.out.printf("Cadena original: \"%s\" (%d caracteres)\n", cadena, longitudCadena);
System.out.printf("Límites de sub-cadena: [%d, %d] \n", posSub, posMax);
System.out.printf("Cadena resultante: \"%s\" (%d caracteres)\n\n", sub, longitudSub);
}

}