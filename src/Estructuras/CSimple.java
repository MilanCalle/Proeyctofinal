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
public abstract class CSimple implements Serializable {
    protected int ini,fin,max;
	protected Object v[]=new Object[100];
	public CSimple (int ca)
	{
		ini=0;fin=0;max=ca;
		
	}
	abstract boolean esVacia();
	abstract boolean esLlena();
	abstract void adicionar(Object ele);
	abstract Object eliminar();
	abstract void mostrar();
	abstract int nElem();
    
}
