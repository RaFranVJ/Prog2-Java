package com.programación2.prácticas.práctica8.clases;

import javax.swing.*;

import com.fran_utils.InterfazGrafica.Ventanas.*;

import java.awt.*;

//Clase impropia #3

public class MarcoBorder extends VentanaSimple
{ 
private static final long serialVersionUID = -1892875683157862968L;

public MarcoBorder()
{
super("Mi marco");
 
add( new JLabel("Norte", SwingConstants.CENTER), BorderLayout.NORTH);
add( new JLabel("Sur", SwingConstants.CENTER), BorderLayout.SOUTH);
add( new JLabel("Centro", SwingConstants.CENTER), BorderLayout.CENTER);
add( new JLabel("Oeste", SwingConstants.CENTER), BorderLayout.WEST);
add( new JLabel("Este", SwingConstants.CENTER), BorderLayout.EAST);
 
setSize(175, 100);
setVisible(true); 
} 

}