package com.programación2.prácticas.práctica3.ejs_bucle_do_while;

import java.util.*;

import com.programación2.Ejercicio;

/** Ejercicio propio #4 usando el bucle do-while */
public class Dados extends Ejercicio {

/** ctor base */

public Dados()
{
id = 4;
nombre = "Juego de dados";
					        
esPropio = true;
}

@Override

public void ejecutar(Scanner lector)
{
Random azar = new Random();

int dado1, dado2;

do
{
dado1 = azar.nextInt(6) + 1;
dado2 = azar.nextInt(6) + 1;

System.out.printf("[ %d ] [ %d ]", dado1, dado2);

System.out.println("Presiona una tecla para lanzar los dados nuevamente.");
lector.nextLine(); // Esperar hasta que el usuario presione una tecla

}

while (dado1 != dado2);

System.out.println("¡Obtuviste un doble! Fin del juego.");
}

}