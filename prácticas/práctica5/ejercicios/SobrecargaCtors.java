
package com.programación2.prácticas.práctica5.ejercicios;

import java.util.Scanner;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica5.clases.*;

/** Ejercicio impropio #8 (8.8 del libro). */

public class SobrecargaCtors extends Ejercicio
{
/** ctor Base */

public SobrecargaCtors()
{
id = 8;
nombre = "Sobrecarga de constructores en una clase";
		        
esPropio = false;
}

@Override

public void ejecutar(Scanner lector)
{
EquipoSonido rt, gt, ht; // define tres referencias
	
rt = new EquipoSonido(); // llamada al constructor por defecto
gt = new EquipoSonido("JULAT");
ht = new EquipoSonido("PARTOLA", 35, 220);

rt.mostrarInfo();
gt.mostrarInfo();
ht.mostrarInfo();
}

}