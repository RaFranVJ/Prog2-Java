package com.programación2.prácticas.práctica5.clases;

// Clase propia #2

public class Estudiante
{
private String nombre;
 
private String matricula;

private double ind;

private String condAcademica;


public void asignarDatos(String n, String m, double i)
{
nombre = n;
matricula = m;
ind = i;

obtenerCondAcademica();
}

public void obtenerCondAcademica()
{

if(ind >= 4.0) 
condAcademica = "Excelente";

else if (ind >= 3.0)
condAcademica = "Regular";

else
condAcademica = "Deficiente";

}

public void mostrarDatos()
{
System.out.println("====== Datos del estudiante ======\n"); 

System.out.printf("Nombre: %s\n", nombre); 
System.out.printf("Matrícula: %s\n", matricula); 
System.out.printf("Índice académico: %.2f\n", ind); 
System.out.printf("Condición académica: %s\n", condAcademica); 
}

public String obtenerNombre() {
	return nombre;
}


public void asignarNombre(String nombre) {
	this.nombre = nombre;
}


public String obtenerMatricula() {
	return matricula;
}


public void asignarMatricula(String matricula) {
	this.matricula = matricula;
}


public double obtenerInd() {
	return ind;
}


public void asignarInd(double ind) {
	this.ind = ind;
}


public String leerCondAcademica() {
	return condAcademica;
}

}