/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
import Estructuras.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class LA_PAZ extends javax.swing.JFrame {
DESTINOS vu;
public Pila a=new Pila(100); 
public Pila b=new Pila(100);
public LSNormal A=new LSNormal();
public CSCircular rr =new CSCircular(100);
public CSCircular cli =new CSCircular(100);
private LSNormal r=new LSNormal();

private CSCircular c=new CSCircular(100);
    /**
     * Creates new form UYUNI
     */
    public LA_PAZ() {
        initComponents();
        setLocationRelativeTo(null);
    }

    LA_PAZ(DESTINOS aThis) {
       initComponents();
        setLocationRelativeTo(null);
        this.vu=aThis; 
        a = vu.getA();
        b = vu.getB();
        a=(Pila)CargarHoteles("src/Datos/DatosHoteles.dat");
        b=(Pila)CargarTransportes("src/Datos/DatosTransportes.dat");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaTrans = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaHotel1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        COM_Area = new javax.swing.JTextArea();
        COM_jButton1 = new javax.swing.JButton();
        COM_jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        corrCliente = new javax.swing.JTextField();
        idTrans = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        idHot = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ciCliente = new javax.swing.JTextField();
        nomCliente = new javax.swing.JTextField();
        telfCliente = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        idcancelar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("RESERVA DE HOTELES Y TRANSPORTE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 230, -1));

        jButton2.setText("REGRESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 510, -1, -1));

        jScrollPane1.setViewportView(TablaTrans);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 320, 156));

        jLabel4.setText("TRANSPORTE DISPONIBLE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, 25));

        jScrollPane2.setViewportView(TablaHotel1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 320, 160));

        jLabel6.setText("HOTELES DISPONIBLES");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, 25));

        jButton4.setText(" VER DISPONIBLES");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        COM_Area.setColumns(20);
        COM_Area.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        COM_Area.setRows(5);
        jScrollPane3.setViewportView(COM_Area);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 280, 170));

        COM_jButton1.setBackground(new java.awt.Color(0, 204, 255));
        COM_jButton1.setText("GENERAR RECIBO");
        COM_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COM_jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(COM_jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 130, 30));

        COM_jButton3.setBackground(new java.awt.Color(255, 204, 51));
        COM_jButton3.setText("IMPRIMIR RECIBO");
        COM_jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COM_jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(COM_jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 120, 20));

        jLabel7.setText("RESERVA DE HOTELES Y TRANSPORTE");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        corrCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corrClienteActionPerformed(evt);
            }
        });
        getContentPane().add(corrCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 67, -1));

        idTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTransActionPerformed(evt);
            }
        });
        getContentPane().add(idTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 67, -1));

        jLabel2.setText("INGRESE ID DEL TRASPORTE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel3.setText("INGRESE ID DEL HOTEL");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jButton3.setText("RESERVAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));
        getContentPane().add(idHot, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 70, -1));

        jLabel8.setText("CORREO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        jLabel9.setText("INGRESE SU ID");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel10.setText("NOMBRE");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));

        jLabel11.setText("TELEFONO");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));

        ciCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciClienteActionPerformed(evt);
            }
        });
        getContentPane().add(ciCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 67, -1));

        nomCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomClienteActionPerformed(evt);
            }
        });
        getContentPane().add(nomCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 67, -1));

        telfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telfClienteActionPerformed(evt);
            }
        });
        getContentPane().add(telfCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 67, -1));

        jButton5.setText("CANCELAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, -1, -1));

        jLabel12.setText("INGRESE ID DEL CLIENTE A CANCELAR");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));

        idcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idcancelarActionPerformed(evt);
            }
        });
        getContentPane().add(idcancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 67, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setText("GUARDAR CAMBIOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        vu.setA(a);
        vu.setB(b);
        this.vu.setVisible(true);
        this.setVisible(false);
        this.dispose(); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        

        String titulos[]={"nombre","direccion","id hotel ", "nro de habitaciones", "costo/noche "};
        //POR DEFECTO PORQUE NO SABEMOS EL TAMA;O REAL
        DefaultTableModel pantalla =new DefaultTableModel(null,titulos);
        //recorrer para mostra cada objeto de la pila
        Pila aux=new Pila(100);
        while(!a.esVacia()){
            Hotel x=(Hotel)a.eliminar();aux.adicionar(x);
            if(x.getIDdestino()==3){// AUI ESTOY VALIDADNDO CONEL ID DE DESTINO
                String fila[]={x.getNom(),x.getDire(),x.getIDhotel(),Integer.toString(x.getNroh()),Integer.toString(x.getCostoh())};
                pantalla.addRow(fila);
                
            }}
            a.vaciar(aux);
            TablaHotel1.setModel(pantalla);
          //llenar transporte
            
            String titulo2[]={"nombre","tipo :","id Transporte ", "nro de asientos", "costo "};
            DefaultTableModel pantalla2 =new DefaultTableModel(null,titulo2);

            Pila aux2=new Pila(100);

            while(!b.esVacia()){

                Transporte y=(Transporte)b.eliminar(); aux2.adicionar(y);

                if(y.getIDdestino()==3){
                    String fila[]={y.getNom(),y.getTipo(),y.getIDtransporte(),Integer.toString(y.getNroa()),Integer.toString(y.getCostot())};
                    pantalla2.addRow(fila);
                   
                }}
                b.vaciar(aux2);
                TablaTrans.setModel(pantalla2);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void COM_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COM_jButton1ActionPerformed
       

        
        
        
        COM_Area.setText("***************************\n");

        COM_Area.setText(COM_Area.getText()+"*RECIBO DE RESERVA *\n");

        COM_Area.setText(COM_Area.getText()+"*****************************\n");

        Date obj=new Date();
        String datos= obj.toString();
        COM_Area.setText(COM_Area.getText()+"fecha: "+"\n"+datos+"\n\n");

        COM_Area.setText(COM_Area.getText()+"Nombre : "+nomCliente.getText()+"\n\n");
        COM_Area.setText(COM_Area.getText()+"ID  : "+ciCliente.getText()+"\n\n");

        COM_Area.setText(COM_Area.getText()+"CORREO : "+Integer.parseInt(corrCliente.getText())+"\n\n");
        COM_Area.setText(COM_Area.getText()+"ID tras : "+idTrans.getText()+"\n\n");
        COM_Area.setText(COM_Area.getText()+"ID hotel : "+idHot.getText()+"\n\n");

        /*Area.setText(Area.getText()+"\n"+datos);
        Area.setText(Area.getText()+"\n"+datos);
        Area.setText(Area.getText()+"\n"+datos);
        Area.setText(Area.getText()+"\n"+datos);
        */

    }//GEN-LAST:event_COM_jButton1ActionPerformed

    private void COM_jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COM_jButton3ActionPerformed

        try
        {
            COM_Area.print();

        }
        catch(Exception e)
        {

        }

    }//GEN-LAST:event_COM_jButton3ActionPerformed

    private void corrClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corrClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_corrClienteActionPerformed

    private void idTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTransActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTransActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
            r=(LSNormal)CargarReservas("src/Datos/DatosReserva.dat");//para iniciar que no esten
            c=(CSCircular)CargarClientes("src/Datos/DatosClientes.dat");
            try {
            int idd= 3;
            String idt=idTrans.getText();
            String idh=idHot.getText();
            String idc=ciCliente.getText();
            String corrc=corrCliente.getText();
            String telfc=telfCliente.getText();
            String nomc=nomCliente.getText();

            if(!idc.equals("")){

                Reserva re=new Reserva(idc, idh, idt, "17/06/2024", "Reservado", idd);
                Cliente cli=new Cliente(nomc, corrc, telfc, idc);
                r.adiFin(re);
                c.adicionar(cli);
                JOptionPane.showMessageDialog(null, "Reserva Exitosa");
                GuardarReservas(r, "src/Datos/DatosReserva.dat");
                GuardarClientes(c, "src/Datos/DatosClientes.dat"); 

                Pila aux=new Pila(100);
                while(!a.esVacia()){
                    Hotel x=(Hotel)a.eliminar();aux.adicionar(x);
                    if(x.getIDdestino()==3){
                        if(x.getIDhotel().equals(idh))
                        {x.setNroh(x.getNroh()-1);
                        }

                    }}
                    a.vaciar(aux);
                    while(!b.esVacia()){
                        Transporte x=(Transporte)b.eliminar();aux.adicionar(x);
                        if(x.getIDdestino()==3){
                            if(x.getIDtransporte().equals(idt))
                            {x.setNroa(x.getNroa()-1);}

                        }}
                        b.vaciar(aux);
                        JOptionPane.showMessageDialog(null, "Reserva y cliente aceptado existosamente");

                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Insertar datos validos ");
                }
        r=(LSNormal)CargarReservas("src/Datos/DatosReserva.dat");
        c=(CSCircular)CargarClientes("src/Datos/DatosClientes.dat");
        r.mostrar();
        c.mostrar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ciClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciClienteActionPerformed

    private void nomClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomClienteActionPerformed

    private void telfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telfClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telfClienteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        r=(LSNormal)CargarReservas("src/Datos/DatosReserva.dat");
        c=(CSCircular)CargarClientes("src/Datos/DatosClientes.dat");
        int sw=0;
            try {
            String ic=idcancelar.getText();
            if(!r.esVacia()){
                int nr=r.nElem();
                String idhe,idte;
                for(int i=1;i<=nr;i++){
                    Reserva res = (Reserva)r.eliPrimero();
                    if(res.getIDcliente().equals(ic) && res.getIDdestino()==3 && res.getEstado().equals("Reservado")){
                        Pila aux=new Pila(100);sw=1;
                        res.setEstado("Cancelado");
                        r.adiFin(res);
                        idhe=res.getIDhotel();idte=res.getIDtransporte();
                        while(!a.esVacia()){
                            Hotel x=(Hotel)a.eliminar();aux.adicionar(x);
                            if(x.getIDdestino()==3){
                                if(x.getIDhotel().equals(idhe)) x.setNroh(x.getNroh()+1);
                            }
                        }
                        a.vaciar(aux);
                        while(!b.esVacia()){
                            Transporte x=(Transporte)b.eliminar();aux.adicionar(x);
                            if(x.getIDdestino()==3){
                                if(x.getIDtransporte().equals(idte)){x.setNroa(x.getNroa()+1);}
                            }
                        }
                        b.vaciar(aux);
                    }
                    else r.adiFin(res);
                }
                if (sw==1){
                    GuardarReservas(r, "src/Datos/DatosReserva.dat");
                    JOptionPane.showMessageDialog(null,"Reserva cancelada exitosamente");
                }
                else JOptionPane.showMessageDialog(null,"No hay reserva a ese nombre");
            }
            else
                JOptionPane.showMessageDialog(null,"No hay ninguna reserva");
            }catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Insertar datos validos ");
            }
             
        r=(LSNormal)CargarReservas("src/Datos/DatosReserva.dat");
        r.mostrar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void idcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idcancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idcancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GuardarHoteles(a, "src/Datos/DatosHoteles.dat");
        GuardarTransportes(b, "src/Datos/DatosTransportes.dat");
        a=(Pila)CargarHoteles("src/Datos/DatosHoteles.dat");
        b=(Pila)CargarTransportes("src/Datos/DatosTransportes.dat");
        a.mostrar();
        b.mostrar();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LA_PAZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LA_PAZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LA_PAZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LA_PAZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LA_PAZ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea COM_Area;
    private javax.swing.JButton COM_jButton1;
    private javax.swing.JButton COM_jButton3;
    private javax.swing.JTable TablaHotel1;
    private javax.swing.JTable TablaTrans;
    private javax.swing.JTextField ciCliente;
    private javax.swing.JTextField corrCliente;
    private javax.swing.JTextField idHot;
    private javax.swing.JTextField idTrans;
    private javax.swing.JTextField idcancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField nomCliente;
    private javax.swing.JTextField telfCliente;
    // End of variables declaration//GEN-END:variables

    private void GuardarReservas(LSNormal r, String ruta){
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(ruta))){
            salida.writeObject(r);
            System.out.print("Dato guardado");    
        }catch (IOException e) {
            e.printStackTrace();
        }   
    }
    
    private Object CargarReservas(String ruta){
        Object dato=null;
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(ruta))){
            dato= entrada.readObject();
            System.out.print("Datos cargados");    
        }catch (Exception e) {
            System.out.print("No se cargaron"); 
        } 
        return dato;
    }
    private void GuardarClientes(CSCircular cc, String ruta){
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(ruta))){
            salida.writeObject(cc);
            System.out.print("Dato guardado");    
        }catch (IOException e) {
            e.printStackTrace();
        }   
    }
    
    private Object CargarClientes(String ruta){
        Object dato=null;
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(ruta))){
            dato= entrada.readObject();
            System.out.print("Datos cargados");    
        }catch (Exception e) {
            System.out.print("No se cargaron"); 
        } 
        return dato;
    }
     private void GuardarHoteles(Pila hh, String ruta){
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(ruta))){
            salida.writeObject(hh);
            System.out.print("Dato guardado");    
        }catch (IOException e) {
            e.printStackTrace();
        }   
    }
    
    private Object CargarHoteles(String ruta){
        Object dato=null;
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(ruta))){
            dato= entrada.readObject();
            System.out.print("Datos cargados");    
        }catch (Exception e) {
            System.out.print("No se cargaron"); 
        } 
        return dato;
    }
    private void GuardarTransportes(Pila tt, String ruta){
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(ruta))){
            salida.writeObject(tt);
            System.out.print("Dato guardado");    
        }catch (IOException e) {
            e.printStackTrace();
        }   
    }
    
    private Object CargarTransportes(String ruta){
        Object dato=null;
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(ruta))){
            dato= entrada.readObject();
            System.out.print("Datos cargados");    
        }catch (Exception e) {
            System.out.print("No se cargaron"); 
        } 
        return dato;
    }
}
