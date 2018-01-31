/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

/**
 *
 * @author HP
 */
public class ListaEnlazada {
     Nodo cab;
     int size;
	public ListaEnlazada() {
		cab = null;
                size=0;
                
	}
       
	public boolean estaVacio(){
            return(cab==null)?true:false;
            
        } 
}
