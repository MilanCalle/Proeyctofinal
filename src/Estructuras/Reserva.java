
package Estructuras;

import java.io.Serializable;
import java.util.Scanner;
public class Reserva implements Serializable{
       	String IDcliente,fechareserva,estado;
        String IDhotel,IDtransporte;
        int IDdestino;
       public  Reserva(String idcliente,String idhotel, String idtrans,String fecha,String est,int iddestino)
        {
            IDcliente=idcliente;
            IDdestino=iddestino;
            fechareserva=fecha;
            IDhotel=idhotel;
            IDtransporte=idtrans;
            estado=est;
        }
	void leer()
	{
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese  IDcliente;");
		IDcliente=lee.next();
		System.out.println("Ingrese  IDdestino;");
		IDdestino=lee.nextInt();
		System.out.println("Ingrese fecha de reserva;");
		fechareserva=lee.next();
                System.out.println("Ingrese estado de la reserva;");
		estado=lee.next();
	}

    @Override
    public String toString() {
        return "Reserva{" + "IDcliente=" + IDcliente + ", IDdestino=" + IDdestino + ", fechareserva=" + fechareserva + ", estado=" + estado + ", IDhotel=" + IDhotel + ", IDtransporte=" + IDtransporte + '}';
    }

    public String getIDcliente() {
        return IDcliente;
    }

    public void setIDcliente(String IDcliente) {
        this.IDcliente = IDcliente;
    }

    public int getIDdestino() {
        return IDdestino;
    }

    public void setIDdestino(int IDdestino) {
        this.IDdestino = IDdestino;
    }

    public String getFechareserva() {
        return fechareserva;
    }

    public void setFechareserva(String fechareserva) {
        this.fechareserva = fechareserva;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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




    
}
