package com.programación2.prácticas.práctica5.clases;

import java.time.*;

public class Materia
{
String nombre;

String profesor;

LocalTime horario;

int creditos;

public Materia(String n, String prof, LocalTime hr, int cr)
{
nombre = n;
profesor = prof;
horario = hr;
creditos = cr;
}

public void mostrarInfo()
{
System.out.println("====== Información de la materia ======\n"); 

System.out.printf("Nombre: %s\n", nombre); 
System.out.printf("Profesor que la imparte: %s\n", profesor); 
System.out.printf("Horario: %s\n", horario.toString() ); 
System.out.printf("Número de créditos: %d\n", creditos) ; 
}

}
