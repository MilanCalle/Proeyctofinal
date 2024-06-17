
package Estructuras;

import java.io.Serializable;


public class Pila implements Serializable{
public int tope,max;
	Object v[]=new Object [100];
	public Pila(int ca)
	{max=ca;tope=0;}
	public boolean esLlena()
	{
		if(tope==max) return true;
		else return false;
		
	}
	public boolean esVacia()
	{
		if(tope==0) return true;
		else return false;
		
	}
	public void adicionar(Object item)
	{
		if(!esLlena())
		{
			tope=tope+1;
			v[tope]=item;
		}
		else System.out.println("pila llena");	
		}
	public Object eliminar()
	{
		Object item=null;
		if(!esVacia()) {item=v[tope];tope--;}
		else System.out.println("pila vacia");
		return item;
	}
	public void mostrar()
	{
		Object item;
		Pila aux=new Pila(max);
		while(!esVacia())
			aux.adicionar(eliminar());
		while(!aux.esVacia())
		{
			item=aux.eliminar();
			System.out.println(item);
			adicionar(item);
		}
	}
	public void vaciar(Pila B)
	{
		while(!B.esVacia())
			adicionar(B.eliminar());
	}
		public int nElem()
		{
			return tope;
		}
		int getMax()
		{
			return max;
		}
         public void llenarT()
         { 
            adicionar(new Transporte("Transfers Uyuni","Flota","1TA",1,20,150));
            adicionar(new Transporte("Cruz Norte","Flota","1TB",1,30,140));
            adicionar(new Transporte("Bolivar","Vagoneta","1TC",1,7,200));
            
            adicionar(new Transporte("Amazonas","Aereo","2TA",2,50,500));
            adicionar(new Transporte("Flota Totai","Flota","2TF",2,30,200));
            
            adicionar(new Transporte("Caranavi Tropical","Flota","3TC",3,30,200));
            adicionar(new Transporte("Minibuses Yungeña","Minibus","3TM",3,15,80));
            
         }
         public void llenarH()
         {
             System.out.println();
             adicionar(new Hotel("Casa de Sal", "Calle Ayacucho #61", "1A", 1, 10,700));
             adicionar(new Hotel("Hotel de Cristales de Sal", "Colon esq Novena", "1B", 1, 20,500));
             
             adicionar(new Hotel("Jatatal Hotel", "Av Costanera San Buena Aventura", "2HA", 2, 10,750));
             adicionar(new Hotel("Mashaquipe Ecolodge", "Costanera Esq, C. 18 de Noviembre", "2HB", 2, 15,550));
             
             adicionar(new Hotel("Hotel Gloria", "Av Keneddy Final", "3HA", 3, 50,150));
             adicionar(new Hotel("Orquideas de Elena", "Yanacachi Sud Yungas", "3HB", 3, 20,100));
         }
}
