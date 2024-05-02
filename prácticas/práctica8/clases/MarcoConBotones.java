package com.programación2.prácticas.práctica8.clases;

import javax.swing.*;

import com.fran_utils.InterfazGrafica.Ventanas.*;

import java.awt.*;

//Clase impropia #9

public class MarcoConBotones extends VentanaSimple
{
private static final long serialVersionUID = 5747863593178264015L;

public MarcoConBotones()
{
JPanel pa1 = new JPanelRadio();

setLayout( new BorderLayout(20, 30) );

add(pa1, BorderLayout.WEST);

setSize(600, 450);
setVisible(true);
}

}