/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author HP
 */
import java.io.Serializable;
import java.util.Scanner;
public class Destino implements Serializable{
    	String IDhotel,IDtransporte,nombred;
	int preciototal,IDdestino;
       public  Destino(String a,String b,int c,String d,int x)
        {
            IDhotel=a;
            IDtransporte=b;
            IDdestino=c;
            nombred=d;
            preciototal=x;
        }
	void leer()
	{
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese  IDhotel;");
		IDhotel=lee.next();
		System.out.println("Ingrese  IDtransporte;");
		IDtransporte=lee.next();
		System.out.println("Ingrese  IDdestino;");
		IDdestino=lee.nextInt();
		System.out.println("Ingrese nombre del destino;");
		nombred=lee.next();
	}

    @Override
    public String toString() {
        return "Destino{" + "IDhotel=" + IDhotel + ", IDtransporte=" + IDtransporte + ", IDdestino=" + IDdestino + ", nombred=" + nombred + ", preciototal=" + preciototal + '}';
    }         

    public String getIDhotel() {
        return IDhotel;
    }

    public void setIDhotel(String IDhotel) {
        this.IDhotel = IDhotel;
    }

    public String getIDtransporte() {
        return IDtransporte;
    }

    public void setIDtransporte(String IDtransporte) {
        this.IDtransporte = IDtransporte;
    }

    public int getIDdestino() {
        return IDdestino;
    }

    public void setIDdestino(int IDdestino) {
        this.IDdestino = IDdestino;
    }

    public String getNombred() {
        return nombred;
    }

    public void setNombred(String nombred) {
        this.nombred = nombred;
    }

    public int getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(int preciototal) {
        this.preciototal = preciototal;
    }
       
    
}
