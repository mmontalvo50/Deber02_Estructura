/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

import ec.edu.ister.modelo.ListaEnlazada;
import javax.swing.JOptionPane;

public class Aplicacion {
    public static void main(String[] args) {
         ListaEnlazada lista= new ListaEnlazada();
    JOptionPane.showMessageDialog(null,"¿LA LISTA ESTA VACIA?  \n  "+lista.estaVacio());
    }
}
