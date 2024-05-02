package com.programación2.prácticas.práctica6.clases.dolmen;

public class Segunda
{

public void balsas()
{
Primera p = new Primera();
 
//p.goliar(); --> error, el método goliar() es privado
 
p.salustio(); // correcto, esta en el mismo paquete
}

}