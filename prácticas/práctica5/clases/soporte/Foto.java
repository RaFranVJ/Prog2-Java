package com.programación2.prácticas.práctica5.clases.soporte;

// Primera clase del ejercicio impropio #3 (8.3)

class Foto
{
 private int nt;
 
 private char opd; 
 
 String q;

 public Foto(String r) // constructor
 {
 nt = 0;
 opd = 'S';
 
 q = new String(r);
 }
 
public double mtd()
{
return nt / opd;
}

}