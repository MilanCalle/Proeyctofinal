
package Estructuras;

/**
 *
 * @author HP
 */
public class CSCircular extends CSimple {
 public    CSCircular(int cc)
{
	super(cc);
}
public boolean esVacia()
{
if(nElem()==0) return true;
else return false;
}
public boolean esLlena()
{
if(nElem()==max-1) return true;
else return false;
}
public void adicionar(Object ele)
{
if(esLlena())System.out.println("cola llena");
else
{
fin=(fin+1)%max;
v[fin]=ele;
}
}
public Object eliminar()
{Object da=null;
if(esVacia()) System.out.print("cola vacia");
else 
{ini=(ini+1)%max;
da=v[ini];
	}
return da;
	
}
public void mostrar()
{int ne,i;Object dato;
ne=nElem();
for(i=1;i<=ne;i++)
{
	dato=eliminar();
	System.out.println("\t"+dato);
	adicionar(dato);
}
}
public int nElem()
{
return((fin-ini+max)%max);	
}
public void vaciar(CSCircular aux) {
	while(!aux.esVacia()) {
		adicionar(aux.eliminar());

}

}
    
}
