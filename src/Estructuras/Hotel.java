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
public class Hotel implements Serializable{
    	String nom,dire,IDhotel;
	int IDdestino,nroh,costoh;
        public Hotel(String a,String b,String c,int d,int x,int y)
        {
            nom=a;
            dire=b;
            IDhotel=c;
            IDdestino=d;
            nroh=x;
            costoh=y;
        }
	void leer()
	{
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese nombre del hotel;");
		nom=lee.next();
		System.out.println("Ingrese direccion del hotel");
		dire=lee.next();
                System.out.println("Ingrese ID del hotel");
		IDhotel=lee.next();
		System.out.println("Ingrese nro de habitaciones;");
		nroh=lee.nextInt();
                System.out.println("Ingrese coste por noche;");
		costoh=lee.nextInt();
	}

    @Override
    public String toString() {
        return "Hotel{" + "nom=" + nom + ", dire=" + dire + ", IDhotel=" + IDhotel + ", nroh=" + nroh + ", costoh=" + costoh + '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDire() {
        return dire;
    }

    public void setDire(String dire) {
        this.dire = dire;
    }

    public String getIDhotel() {
        return IDhotel;
    }

    public void setIDhotel(String IDhotel) {
        this.IDhotel = IDhotel;
    }

    public int getNroh() {
        return nroh;
    }

    public void setNroh(int nroh) {
        this.nroh = nroh;
    }

    public int getCostoh() {
        return costoh;
    }

    public void setCostoh(int costoh) {
        this.costoh = costoh;
    }

    public int getIDdestino() {
        return IDdestino;
    }

    public void setIDdestino(int IDdestino) {
        this.IDdestino = IDdestino;
    }
    
    
    
}
