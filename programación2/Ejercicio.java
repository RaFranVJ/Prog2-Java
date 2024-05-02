package com.programación2;

import java.util.Scanner;

import com.fran_utils.ClaseOrdenable;

/** Clase base usada para crear Ejercicios en Java. */

public abstract class Ejercicio extends ClaseOrdenable
{
/** Obtiene o asigna un booleano que determina si el ejercicio es propio o impropio. 
@returns Un booleano usado para filtrar los ejercicios por propiedad. */

public boolean esPropio;

/** Crea una nueva instancia de la clase 'Ejercicio' */

public Ejercicio()
{
id = 0;
nombre = "<MiEjercicio>";

esPropio = false;
}

/** Método base para ejecutar la lógica del ejercicio (debe sobreescribirse en las clases heredadas). 
 * @throws InterruptedException */

public abstract void ejecutar(Scanner lector) throws InterruptedException;
}