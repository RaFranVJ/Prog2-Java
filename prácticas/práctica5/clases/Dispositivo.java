package com.programación2.prácticas.práctica5.clases;

// Clase propia #4

public class Dispositivo
{
private String tipo;

private String marca;

private String modelo;
    

public Dispositivo()
{
tipo = "<Sin especificar>";
marca = "<Ingresar marca de una empresa>";
modelo = "<Desconocido>";
}

public Dispositivo(String tipo)
{
this.tipo = tipo;
marca = "<Ingresar marca de una empresa>";
modelo = "<Desconocido>";
}

public Dispositivo(String tipo, String marca)
{
this.tipo = tipo;
this.marca = marca;
modelo = "<Desconocido>";
}

public Dispositivo(String tipo, String marca, String modelo)
{
this.tipo = tipo;
this.marca = marca;
this.modelo = modelo;
}

public void mostrarInfo()
{
System.out.println("====== Datos del dispositivo ======\n"); 

System.out.printf("Tipo: %s\n", tipo); 
System.out.printf("Marca: %s\n", marca); 
System.out.printf("Modelo: %s\n", modelo); 
}

}
