package com.programación2.prácticas.práctica6.ejercicios;

import java.util.*;
import com.fran_utils.ConsolaGenerica.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica5.clases.*;

// Ejercicio propio #3

public class Distancia extends Ejercicio
{

public Distancia()
{
id = 3;
nombre = "Distancia entre dos puntos";

esPropio = true;
}

private Punto leerCoord(String h, Scanner lector)
{
System.out.printf("======= %s =======\n", h);

int uX = EntradaDatos.leerValor(lector, "Ingresa un valor para X", int.class);
int uY = EntradaDatos.leerValor(lector, "Ingresa un valor para Y", int.class);

return new Punto(uX, uY);
}

public double distancia(Punto p1, Punto p2)
{
int x1 = p1.leerX();
int y1 = p1.leerY();

int x2 = p2.leerX();
int y2 = p2.leerY();

return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) );
}

@Override

public void ejecutar(Scanner lector)
{
Punto p1 = leerCoord("Punto #1", lector);
Punto p2 = leerCoord("Punto #2", lector);

double dis = distancia(p1, p2);

System.out.printf("La distancia entre %s y %s es de %.2f", p1, p2, dis);
}

}