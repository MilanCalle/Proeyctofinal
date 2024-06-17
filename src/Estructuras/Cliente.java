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
public class Cliente implements Serializable {
    String nom,correo,telefono,IDcliente;
       public Cliente(String a,String b,String c,String d)
        {
            nom=a;
            correo=b;
            telefono=c;
            IDcliente=d;
        }
	void leer()
	{
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese nombre del cliente;");
		nom=lee.next();
		System.out.println("Ingrese correo del cliente");
		correo=lee.next();
                System.out.println("Ingrese telefono del cliente");
		telefono=lee.next();
		System.out.println("Ingrese su CI;");
		IDcliente=lee.next();
	}

    @Override
    public String toString() {
        return "Cliente{" + "nom=" + nom + ", correo=" + correo + ", telefono=" + telefono + ", IDcliente=" + IDcliente + '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIDcliente() {
        return IDcliente;
    }

    public void setIDcliente(String IDcliente) {
        this.IDcliente = IDcliente;
    }
        
}
