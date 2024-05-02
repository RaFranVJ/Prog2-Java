package com.programación2.prácticas.práctica5.clases;

// Clase impropia #8 del libro (8.8)

public class EquipoSonido
{
private int potencia;
 
private int voltios;
 
private int numCd;
 
private String marca;
 
// constructor por defecto
 
public EquipoSonido()
{
asignarMarca("Sin marca");
 
System.out.println("Constructor por defecto");
}
 
public EquipoSonido(String mt)
{
marca = mt;

System.out.println("Constructor con argumento cadena ");
}
 
public EquipoSonido(String mt, int p, int v)
{
marca = mt;
potencia = p;
voltios = v;
numCd = 20;

System.out.println("Constructor con tres argumentos ");
}

public double factura()
{
return numCd * 1000;
}

// Mostrar información sobre el equipo de sonido

public void mostrarInfo()
{
System.out.printf("====== Equipo %s ======\n", marca); 

System.out.printf("Potencia: %d\n", potencia); 
System.out.printf("Voltaje: %d\n", voltios); 
System.out.printf("Capacidad de almacenamiento: %d CDs\n", numCd); 
}

public int leerPotencia() {
	return potencia;
}

public void asignarPotencia(int potencia) {
	this.potencia = potencia;
}

public int leerVoltios() {
	return voltios;
}

public void asignarVoltios(int voltios) {
	this.voltios = voltios;
}

public String leerMarca() {
	return marca;
}

public void asignarMarca(String marca) {
	this.marca = marca;
}
 
}