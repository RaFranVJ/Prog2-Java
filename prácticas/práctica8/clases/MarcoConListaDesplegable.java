package com.programación2.prácticas.práctica8.clases;

import javax.swing.*;

import com.fran_utils.InterfazGrafica.Ventanas.*;

import java.awt.*;

//Clase impropia #9

public class MarcoConListaDesplegable extends VentanaSimple
{
private static final long serialVersionUID = 1568393025988687721L;

public MarcoConListaDesplegable()
{
JPanel pa1 = new JPanelCombo();

setLayout( new BorderLayout() );

add(pa1, BorderLayout.CENTER);

setSize(600, 450);
setVisible(true);
}

}