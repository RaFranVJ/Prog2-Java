package com.programación2.prácticas.práctica3.ejs_bucle_do_while;

import com.fran_utils.ConsolaGenerica.EntradaDatos;
import com.programación2.Ejercicio;

import java.util.*;

/** Ejercicio propio #3 usando el bucle do-while */

public class SecuenciaAleatoria extends Ejercicio
{
/** ctor base */

public SecuenciaAleatoria()
{
id = 3;
nombre = "Generar secuencia aleatoria de caracteres";
						        
esPropio = true;
}

@Override

public void ejecutar(Scanner lector)
{
Random azar = new Random();
StringBuilder secuencia = new StringBuilder();

int longitudMax = EntradaDatos.leerNumEnRango(2, 64, "Ingresa una longitud para la cadena", lector);
int longitud = 0;

do
{
char caracter = (char) (azar.nextInt(26) + 'a');
secuencia.append(caracter);

longitud++;
} 
    
while(longitud < longitudMax);

System.out.println("Secuencia generada: " + secuencia.toString() );
}

}