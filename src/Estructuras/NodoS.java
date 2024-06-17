/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.io.Serializable;

/**
 *
 * @author HP
 */
public class NodoS implements Serializable{
    	Object dato;
	NodoS Sig;
	NodoS()
	{
		Sig=null;
	}
	public Object getDato() {
		return dato;
	}
	public void setDato(Object dato) {
		this.dato = dato;
	}
	public NodoS getSig() {
		return Sig;
	}
	public void setSig(NodoS sig) {
		Sig = sig;
	}
    
}
