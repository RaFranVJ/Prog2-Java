package com.programación2.prácticas.práctica3.ejs_bucle_do_while;

import java.util.*;

import com.programación2.Ejercicio;

/** Ejercicio propio #5 usando el bucle do-while */

public class TiempoDeEspera extends Ejercicio
{
/** ctor base */

public TiempoDeEspera()
{
id = 5;
nombre = "Tiempo de espera";
					        
esPropio = true;
}

@Override

public void ejecutar(Scanner lector) throws InterruptedException
{
int tiempo = 5;

do
{
System.out.printf("Tiempo restante: %d segundo (s).\r", tiempo);
Thread.sleep(1000); // Delay de 1 segundo

tiempo--;
}

while(tiempo > 0);

System.out.println("\nSe ha agotado el tiempo de espera.");
}

}