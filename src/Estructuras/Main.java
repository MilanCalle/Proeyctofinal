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
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
           /* Pila t=new Pila(100);
            Pila auxt=new Pila(100);
            Pila auxh=new Pila(100);
            Pila h=new Pila(100);
            Destino da;Transporte tra;
            Hotel ho;int sw=0;String resh="";
            LSNormal r = new LSNormal();
            LSNormal d =new LSNormal();
            Reserva re = new Reserva();
            CSCircular clientes = new CSCircular(50);
            t.llenarT();
            //a.mostrar();
            h.llenarH();
            //b.mostrar();
            d.llenarD();
            int n = d.nElem();
            int nt = t.nElem();
            int nh= h.nElem();
            int nre= r.nElem();
           // d.mostrar();
            //Reserva
            
            
            System.out.println("seleccione IDdestino");
            Scanner lee=new Scanner(System.in);
            int res = lee.nextInt();
            String trans;
            for(int i=1;i<=n;i++)
            {
                da =(Destino)d.eliPrimero();
                if(da.getIDdestino()==res)
                {
                   System.out.println(da.getNombred());
                }
                d.adiFin(da);
            }
            for(int i=1;i<=nt;i++)
            {
               tra=(Transporte)t.eliminar();
               auxt.adicionar(tra);
               if(tra.getIDdestino()==res)
               {
                   System.out.println(tra.getNom());
                   System.out.println(tra.getCostot());
                   System.out.println(tra.getNroa());
                   System.out.println(tra.getIDtransporte());
                   System.out.println();
               }
            }
            t.vaciar(auxt);
            for(int i=1;i<=nh;i++)
            {
               ho=(Hotel)h.eliminar();
               if(ho.getIDdestino()==res)
               {
                   System.out.println(ho.getNom());
                   System.out.println(ho.getCostoh());
                   System.out.println(ho.getNroh());
                   System.out.println(ho.getIDhotel());
                   System.out.println();
               }
               auxh.adicionar(ho);
            }
            h.vaciar(auxh);
            System.out.println("Elija Id transporte");
            String rest=lee.next();
     
            for(int i=1;i<=nt;i++)
            {
               tra=(Transporte)t.eliminar();
               if(tra.getIDtransporte().equals(rest))
               {
                   if(tra.getNroa()==0)
                   {System.out.println("ya no quedan asientos");
                   sw=1;}
                   else  
                   {tra.setNroa(tra.getNroa()-1);
                   }
               }
               auxt.adicionar(tra);
               
            }
            t.vaciar(auxt);
            if(sw==0)
            {
            System.out.println("Elija hotel");
            resh=lee.next();
            for(int i=1;i<=nh;i++)
            {
               ho=(Hotel)h.eliminar();
               if(ho.getIDhotel().equals(resh))
               {
                   if(ho.getNroh()==0)
                   {System.out.println("ya no quedan habitaciones");
                   sw=1;}
                   else  
                   {ho.setNroh(ho.getNroh()-1);
                   }
               }
               auxh.adicionar(ho);
            }
            h.vaciar(auxh);
            if(sw==1)
                System.out.println("ingrese de nuevo todo");
            }
            else
                System.out.println("ingrese de nuevo todo");
            if(sw==0)
            {
                
                Cliente cli=new Cliente();
                cli.leer();
                clientes.adicionar(cli);
                re.setEstado("reservado");
                re.setFechareserva("16/06/24");
                re.setIDcliente(cli.getIDcliente());
                re.setIDdestino(res);
                re.setIDtransporte(rest);
                re.setIDhotel(resh);
                r.adiFin(re);
                r.mostrar();
            } 
            
            
            //Cancelar
            System.out.println("desea cancelar su reserva? (si=1)");
            String nhotr="",ntrr="";
            int q=lee.nextInt();
            if(q==1) {
            	System.out.println("Ingrese su carnet");
            	String ci=lee.next();int sr=0; nre=r.nElem();
            	for (int i=1;i<=nre;i++) {
                	re=(Reserva)r.eliPrimero();
                	System.out.println("carnet del cliente reserva"+re.getIDcliente());
                	if(re.getIDcliente().equals(ci)) {
                		sr=1;
                		System.out.println("ingreso");
                		nhotr=re.getIDhotel();
                		ntrr=re.getIDtransporte();
                		re.setEstado("Cancelado");
                	}	
                	r.adiFin(re);
                }
            	if(sr==1) {
            		for(int i=1;i<=nt;i++){
                        tra=(Transporte)t.eliminar();
                        if(tra.getIDtransporte().equals(ntrr))
                        {
                            tra.setNroa(tra.getNroa()+1);
                            
                        }
                        auxt.adicionar(tra); 
                     }
                     t.vaciar(auxt);
                     for(int i=1;i<=nh;i++)
                     {
                        ho=(Hotel)h.eliminar();
                        if(ho.getIDhotel().equals(nhotr))
                        {
                            ho.setNroh(ho.getNroh()+1);    
                        }
                        auxh.adicionar(ho);
                     }
                     h.vaciar(auxh);
            	}
            	else System.out.println("No ingrese reserva");
            	
            }
            r.mostrar();
            h.mostrar();
            t.mostrar();
            
        */    
    }
    
}
