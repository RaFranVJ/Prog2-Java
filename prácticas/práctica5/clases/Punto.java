package com.programación2.prácticas.práctica5.clases;

// Clase impropia #1 del libro (8.1). También se usa en el ejercicio 7

public class Punto
{
// coordenada x
private int x; 

//coordenada y
private int y;
 
// constructor por defecto
 
public Punto() 
{
x = y = 0;
}
 
// constructor
 
 public Punto(int x_,int y_) 
 {
 x = x_;
 y = y_;
 }
 
// devuelve el valor de x

 public int leerX()
 {
 return x;
 } 
 
 public int leerY() // devuelve el valor de y
 {
 return y;
 }
 
 public void fijarX(int valorX) // establece el valor de x
 {
 x = valorX;
 }
 
 public void fijarY(int valorY) // establece el valor de y
 {
 y = valorY;
 }
 
 @Override
 
 public String toString()
 {
return String.format("(%d, %d)", x, y);
 }

}
