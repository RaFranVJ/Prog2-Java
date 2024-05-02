
package com.programación2.prácticas.práctica5.ejercicios;

import java.util.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica5.clases.*;

/** Ejercicio propio #4. */

public class EjConClaseDispositivo extends Ejercicio
{
/** ctor Base */

public EjConClaseDispositivo()
{
id = 4;
nombre = "Sobrecargas de ctors en la clase \"Dispositivo\" ";
		        
esPropio = true;
}

@Override

public void ejecutar(Scanner lector)
{
Dispositivo def = new Dispositivo();
def.mostrarInfo();

Dispositivo pc = new Dispositivo("Computadora");
pc.mostrarInfo();

Dispositivo tablet = new Dispositivo("Tablet", "Amazon");
tablet.mostrarInfo();

Dispositivo tel = new Dispositivo("Teléfono", "Xiaomi", "Redmi 9");
tel.mostrarInfo();
}

}