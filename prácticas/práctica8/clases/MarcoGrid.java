package com.programación2.prácticas.práctica8.clases;

import javax.swing.*;

import com.fran_utils.InterfazGrafica.AdminDeComponentesGUI;
import com.fran_utils.InterfazGrafica.Ventanas.*;
import java.awt.*;

//Clase impropia #5

public class MarcoGrid extends VentanaSimple
{ 
private static final long serialVersionUID = 2876740952919392071L;

public MarcoGrid()
{
super("Mi marco");
 
setLayout( new GridLayout(3, 2, 15, 15) );

AdminDeComponentesGUI.agregarComponentes(this, new JLabel("Primera"), new JLabel("Segunda"),
new JLabel("Tercera"), new JLabel("Cuarta"), new JLabel("Quinta"), new JLabel("Sexta") ); 

setSize(175, 100);
setVisible(true);
}

}