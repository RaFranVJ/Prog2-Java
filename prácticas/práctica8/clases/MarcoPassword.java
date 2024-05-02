package com.programación2.prácticas.práctica8.clases;

import javax.swing.*;
import com.fran_utils.InterfazGrafica.Ventanas.VentanaSimple;
import java.awt.*;
import java.awt.event.*;

//Clase impropia #11

public class MarcoPassword extends VentanaSimple
{
private static final long serialVersionUID = 4025762871712255195L;

private JPasswordField clave = null;

private JLabel et1 = null; 

private JLabel res = null; 
 
public MarcoPassword(String c) 
{
super(c); 

setSize(300, 150);

crearComponentes();
pack();
}

private void crearComponentes() 
{
clave = new JPasswordField(20);
et1= new JLabel();

// oyente para proceso de la acción del usuario

clave.addActionListener( new ActionListener()
{

public void actionPerformed(ActionEvent evt) 
{
procesoAccionUser(evt);
}

}

);

// pone el campo de texto con la clave
add(clave, BorderLayout.CENTER);
 
// crea y pone la etiqueta en el marco
 
et1.setFont( new Font("Times New Roman", 3, 12) );
et1.setHorizontalAlignment(SwingConstants.CENTER);
et1.setText("PASSWORD");
et1.setToolTipText("Ejemplo");
 
add(et1, BorderLayout.NORTH);
} 

// método que se ejecuta al actuar el usuario sobre el campo

private void procesoAccionUser(ActionEvent evt) 
{ 
char pas[] = clave.getPassword();
 
res = new JLabel(" ");
 
res.setFont( new Font("Book Antiqua", 3, 14) );
 
if(pas.length == 0)
{
System.out.println("Teclear PassWord ");
et1.setText("PASSWORD (teclear) ");
}
 
else 
{ 
clave.setEditable(false);
res.setText("Se valida la clave");
}

add(res, BorderLayout.SOUTH);
 
validate();
pack();
} 

}