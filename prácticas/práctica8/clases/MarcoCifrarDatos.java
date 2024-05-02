package com.programación2.prácticas.práctica8.clases;

import com.fran_utils.*;
import com.fran_utils.InterfazGrafica.*;
import com.fran_utils.InterfazGrafica.Ventanas.*;
import com.fran_utils.ManejoDeArchivos.*;

import java.awt.*;
import java.io.*;
import java.security.*;
import java.util.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import javax.swing.*;

// Ejercicio propio (práctica final)

public class MarcoCifrarDatos extends VentanaSimple
{
private static final long serialVersionUID = -2255465256076489770L;

// Campos para el panel superior

private JButton boton_Importar;
private JButton boton_Exportar;
private JComboBox<Object> listaDesplegable_TipoCifrado;
private JComboBox<Object> listaDesplegable_TipoClave;
private JButton boton_GenerarClave;
private JTextField campoTexto_Clave;

// Campos para el panel central

private JTextArea areaTexto_EntradaDatos;
private JTextArea areaTexto_FirmaEntrada;
private JTextArea areaTexto_SalidaDatos;
private JTextArea areaTexto_FirmaSalida;

// Campos para el panel inferior

private JCheckBox checkBox_CalcularHash;
private JComboBox<Object> listaDesplegable_TipoHash;
private JButton boton_Encriptar;
private JButton boton_Desencriptar;

// Selector de archivos usando GUI

private SelectorDeArchivos selectorDeArchivos = new SelectorDeArchivos();

// Ventana emergente 

private VentanaEmergente avisos = new VentanaEmergente();

public MarcoCifrarDatos()
{
super("Cifrado de datos por Fran");

setSize(600, 750);

iniciarComponentes();
}

/** Agrega el panel superior de la ventana.

<br>En este se ubican los siguientes elementos: selección de archivos, modo de cifrado, clave

@param base Panel base donde van los elementos */

protected void agregarPanelSup(JPanel base)
{
// Crear el panel superior para luego agregarle los elementos

JPanel panelSuperior = new JPanel( new FlowLayout(FlowLayout.LEFT) );

// Botón para importar los datos de entrada desde un archivo

boton_Importar = new JButton("Importar");
panelSuperior.add(boton_Importar);
panelSuperior.add( Box.createVerticalStrut(24) );

// Botón para exportar los datos de salida a un archivo

boton_Exportar = new JButton("Exportar");
panelSuperior.add(boton_Exportar);
panelSuperior.add( Box.createVerticalStrut(24) );

// Lista desplegable para seleccionar el tipo de cifrado

panelSuperior.add( new JLabel("Tipo de cifrado") );
Object[] opcionesCifrado = SeguridadDatos.obtenerAlgoritmos("Cipher").toArray();
listaDesplegable_TipoCifrado = new JComboBox<>(opcionesCifrado);
panelSuperior.add(listaDesplegable_TipoCifrado);
panelSuperior.add( Box.createVerticalStrut(24) );

//Lista desplegable para seleccionar el tipo de clave

panelSuperior.add( new JLabel("Tipo de clave") );
Object[] opcionesClave = SeguridadDatos.obtenerAlgoritmos("KeyGenerator").toArray();
listaDesplegable_TipoClave = new JComboBox<>(opcionesClave);
panelSuperior.add(listaDesplegable_TipoClave);
panelSuperior.add( Box.createVerticalStrut(24) );

//Botón para generar una nueva clave de cifrado

boton_GenerarClave = new JButton("Generar clave");
panelSuperior.add(boton_GenerarClave);
panelSuperior.add( Box.createVerticalStrut(24) );

// Etiqueta donde se escribirá la clave de cifrado

panelSuperior.add( new JLabel("Clave") );
campoTexto_Clave = new JTextField(16); // El tamaño del área depende del algorimo elegido
panelSuperior.add(campoTexto_Clave);

// Finalmente, agregar el panel superior

base.add(panelSuperior, BorderLayout.NORTH);
}

/** Agrega el panel inferior de la ventana.

<br><br>En este se ubican los siguientes elementos: checkbox para generar firmas, 
botones encriptar o desencriptar el archivo y un botón para exportar los datos.

@param base Panel base donde van los elementos */

protected void agregarPanelInf(JPanel base)
{
JPanel panelInferior = new JPanel( new FlowLayout(FlowLayout.LEFT) );

// Checkbox usado para determinar si generar hashes o no

checkBox_CalcularHash = new JCheckBox("Calcular firmas");
panelInferior.add(checkBox_CalcularHash);
panelInferior.add( Box.createVerticalStrut(24) );

// Lista desplegable usada para seleccionar el tipo de hash

Object[] opcionesDigest = SeguridadDatos.obtenerAlgoritmos("MessageDigest").toArray();
listaDesplegable_TipoHash = new JComboBox<>(opcionesDigest);
panelInferior.add(listaDesplegable_TipoHash);
panelInferior.add( Box.createVerticalStrut(24) );

// Añadir botón para encriptar el archivo

boton_Encriptar = new JButton("Encriptar");
panelInferior.add(boton_Encriptar);
panelInferior.add( Box.createVerticalStrut(24) );

// Añadir botón para desencriptar el archivo

boton_Desencriptar = new JButton("Desencriptar");
panelInferior.add(boton_Desencriptar);
panelInferior.add( Box.createVerticalStrut(24) );

base.add(panelInferior, BorderLayout.SOUTH);
}

// Añadir texto al panel principal donde mostrar los datos del archivo (plain y cifrado)

protected void agregarPanelCentral(JPanel base)
{
JPanel panelCentral = new JPanel( new FlowLayout(FlowLayout.LEFT) );

// Almacena los datos de entrada
JPanel panelEntrada = new JPanel(new BorderLayout()); 

// Añadir área de texto para mostrar los datos de entrada

panelEntrada.add( new JLabel("Entrada"), BorderLayout.NORTH);
areaTexto_EntradaDatos = new JTextArea(16, 32);
panelEntrada.add( new JScrollPane(areaTexto_EntradaDatos), BorderLayout.CENTER);

// Añadir área de texto para mostrar la firma del archivo abierto

areaTexto_FirmaEntrada = new JTextArea(2, 32);
areaTexto_FirmaEntrada.setEditable(false);
panelEntrada.add( new JLabel("Firma"), BorderLayout.SOUTH);
panelEntrada.add( new JScrollPane(areaTexto_FirmaEntrada), BorderLayout.SOUTH);

// Añadir el panel de entrada al panel central

panelCentral.add(panelEntrada);
panelCentral.add(Box.createVerticalStrut(24) );

// Almacena los datos de salida
JPanel panelSalida = new JPanel( new BorderLayout() );

// Añadir área de texto para mostrar los datos de salida

panelSalida.add( new JLabel("Salida"), BorderLayout.NORTH);
areaTexto_SalidaDatos = new JTextArea(16, 32);
panelSalida.add( new JScrollPane(areaTexto_SalidaDatos), BorderLayout.CENTER);

// Añadir área de texto para mostrar la firma del archivo guardado

areaTexto_FirmaSalida = new JTextArea(2, 32);
areaTexto_FirmaSalida.setEditable(false);
panelSalida.add( new JLabel("Firma"), BorderLayout.SOUTH);
panelSalida.add( new JScrollPane(areaTexto_FirmaSalida), BorderLayout.SOUTH);

//Añadir el panel de salida al panel central
panelCentral.add(panelSalida);

base.add(panelCentral, BorderLayout.CENTER);
}

// Inicia todos los componentes de este marco

private void iniciarComponentes()
{
// Crear el panel principal donde se añadirán los demás paneles con sus elementos

JPanel panelBase = new JPanel( new BorderLayout() );

// Agregar componentes al panel

agregarPanelSup(panelBase);
agregarPanelInf(panelBase);
agregarPanelCentral(panelBase);

// Configurar los eventos para cada botón al ser presionado

boton_Importar.addActionListener(evt -> importarDatos() );
boton_Exportar.addActionListener(evt -> exportarDatos() );
boton_GenerarClave.addActionListener(evt -> generarClave() );
boton_Encriptar.addActionListener(evt -> procesarTexto(Cipher.ENCRYPT_MODE) );
boton_Desencriptar.addActionListener(evt -> procesarTexto(Cipher.DECRYPT_MODE) );

// Finalmente, agregar el panel principal al marco

add(panelBase);
}

/** Importar los datos de entrada desde un archivo */

private void importarDatos()
{
File archivo = selectorDeArchivos.abrirArchivo();

byte[] datos = AdminDeArchivos.leerArchivo(archivo);

areaTexto_EntradaDatos.setText( Base64.getEncoder().encodeToString(datos) ); // Codificar datos usando Base64
}

/** Exportar los datos de un archivo usando una interfaz gráfica */

private void exportarDatos()
{
File archivo = selectorDeArchivos.guardarArchivo();

String texto = areaTexto_SalidaDatos.getText();

AdminDeArchivos.escribirDatos(archivo, Base64.getDecoder().decode(texto) ); // Decodificar datos usando Base64
}

/** Generar una clave de cifrado al azar en un formato determinado */

private void generarClave()
{
String tipoClave = (String) listaDesplegable_TipoClave.getSelectedItem();

try
{
KeyGenerator generadorClaves = KeyGenerator.getInstance(tipoClave);
SecureRandom azar = new SecureRandom();

generadorClaves.init(azar);
SecretKey clave = generadorClaves.generateKey();

// Convertir la clave a formato hexadecimal

String claveHex = SeguridadDatos.obtenerStrHex(clave.getEncoded() );

String msg = String.format("Se generó una nueva clave de %d caracteres usando el algoritmo %s.\n\n"
+ "Tu nueva clave: %s", claveHex.length(), tipoClave, claveHex);

VentanaEmergente.showMessageDialog(this, msg, "Generador de claves", JOptionPane.INFORMATION_MESSAGE);
campoTexto_Clave.setText(claveHex);
}

catch(Exception e)
{
avisos.mostrarError(this, e);
}

}

/** Procesa el texto ingresado en el área de entrada de datos y los convierte en bytes.
 
<br>Los datos son leídos desde el archivo y pueden ser modificados por el usuario.

@param modoCifrado Modo de cifrado (Encriptar o Desencriptar datos) */

private void procesarTexto(int modoCifrado)
{
// Parámetros pasados por el usuario

String clave = campoTexto_Clave.getText();
byte[] datosEntrada = Base64.getDecoder().decode(areaTexto_EntradaDatos.getText() );
String tipoCifrado = (String) listaDesplegable_TipoCifrado.getSelectedItem();

byte[] datosSalida = cifrarDatos(datosEntrada, clave, tipoCifrado, modoCifrado);

// Generar hash si está marcada la opción

if(checkBox_CalcularHash.isSelected() )
{
String tipoHash = (String) listaDesplegable_TipoHash.getSelectedItem();

String hashEntrada = SeguridadDatos.obtenerHash(tipoHash, datosEntrada);
areaTexto_FirmaEntrada.setText(hashEntrada);

String hashSalida = SeguridadDatos.obtenerHash(tipoHash, datosSalida);
areaTexto_FirmaSalida.setText(hashSalida);
}

areaTexto_SalidaDatos.setText(Base64.getEncoder().encodeToString(datosSalida) );
}

// Cifrar los datos usando una clave específica y un tipo de cifrado

private byte[] cifrarDatos(byte[] datos, String clave, String tipoCifrado, int modoCifrado)
{
byte[] datosCifrados = new byte[0];

try
{
SecretKeySpec claveDerivada = new SecretKeySpec(clave.getBytes(), tipoCifrado);

Cipher cifrador = Cipher.getInstance(tipoCifrado);
cifrador.init(modoCifrado, claveDerivada);

datosCifrados = cifrador.doFinal(datos);
}

catch(Exception error)
{
avisos.mostrarError(this, error);
}

return datosCifrados;
}

}