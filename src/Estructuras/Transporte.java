
package Estructuras;

import java.io.Serializable;
import java.util.Scanner;
public class Transporte implements Serializable{
       	String nom,tipo,IDtransporte;
	int nroa,costot,IDdestino;
     public Transporte(String a,String b,String c,int d,int x, int y)
        {
            nom=a;
            tipo=b;
            IDtransporte=c;
            IDdestino=d;
            nroa=x;
            costot=y;
        }
        /*void llenart(String a,String b, String c,String d,int x,int y)
        {
            nom=a;
            tipo=b;
            IDtransporte=c;
            nroa=x;
            costot=y;
        }
	/*void leer()
	{
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese nombre del transporte;");
		nom=lee.next();
		System.out.println("Ingrese tipo del transporte");
		tipo=lee.next();
                System.out.println("Ingrese ID del transporte");
		IDtransporte=lee.next();
		System.out.println("Ingrese nro de asientos;");
		nroa=lee.nextInt();
                System.out.println("Ingrese el costo del transporte;");
		costot=lee.nextInt();
	}*/

    @Override
    public String toString() {
        return "Transporte{" + "nom=" + nom + ", tipo=" + tipo + ", IDtransporte=" + IDtransporte + ", nroa=" + nroa + ", costot=" + costot + '}';
    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIDtransporte() {
        return IDtransporte;
    }

    public void setIDtransporte(String IDtransporte) {
        this.IDtransporte = IDtransporte;
    }

    public int getNroa() {
        return nroa;
    }

    public void setNroa(int nroa) {
        this.nroa = nroa;
    }

    public int getCostot() {
        return costot;
    }

    public void setCostot(int costot) {
        this.costot = costot;
    }

    public int getIDdestino() {
        return IDdestino;
    }

    public void setIDdestino(int IDdestino) {
        this.IDdestino = IDdestino;
    }
    
    
        

    
}
