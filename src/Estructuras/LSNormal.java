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
public class LSNormal implements Serializable {
    	NodoS p;
	public LSNormal()
	{
		NodoS p=null;
	}
	public boolean esVacia()
	{
		if(p==null)return true;
		else return false;
	}
	public void adiFin(Object ele)
	{
		NodoS w,u;
		w=new NodoS();w.setDato(ele);
		if(esVacia()) p=w;
		else 
		{
			u=p;
			while(u.getSig()!=null)
			{
				u=u.getSig();
			}
			u.setSig(w);
		}
	}
	public void adiPrimero(Object ele)
	{
		NodoS w;
		w=new NodoS();w.setDato(ele);
		w.setSig(p);
		p=w;
	}
	public Object eliPrimero()
	{Object dato =null;
		if(esVacia()) System.out.println("Lista vacia");
		else
		{
			dato=p.getDato();
			p=p.getSig();
		}
	return dato;
	}
	public Object eliFin()
	{	NodoS u,au=null;Object dato=null;
		if(esVacia())System.out.println("Lista vacia");
		else 
		{
			u=p;
			while(u.getSig()!=null)
			{	au=u;
				u=u.getSig();}
				dato=u.getDato();
				if(p==u) p=null;
				else au.setSig(null);

		}
		return dato;
	}
	public void mostrar()
	{NodoS x;	
	if(esVacia()) System.out.println("Lista vacia");
	else 
	{x=p;
	while(x!=null)
	{
                System.out.println();
		System.out.print("\t"+x.getDato());
		x=x.getSig();}
	}
	}
	public int nElem()
	{int c =0;NodoS x;
		if(!esVacia())
		{
			x=p;c=1;
			while(x.getSig()!=null)
			{
				x=x.getSig();
				c++;
			}
		}
		return c;
	}
	NodoS getCabecera()
	{return p;}
	public void setCabecera(NodoS q)
	{
		p=q;
	}
        public void llenarD()
        {
            adiFin(new Destino("1", "1", 1,"uyuni", 0));
            adiFin(new Destino("2", "2", 2, "Santa Cruz",0));
            adiFin(new Destino("3", "3", 3, "Cochabamba", 0));
        }
}
