/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Estructuras.CSCircular;
import Estructuras.*;
import Estructuras.LSNormal;
import Estructuras.Pila;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CARLA
 */
public class Reservas_Clientes extends javax.swing.JFrame {
    Admin1 adm;
    private LSNormal r=new LSNormal();
    private CSCircular c=new CSCircular(100);

    /**
     * Creates new form Reservas_Clientes
     */
    public Reservas_Clientes() {
        initComponents();
    }

    public Reservas_Clientes(Admin1 aThis) {
         initComponents();
         this.adm=aThis;
         r=(LSNormal)CargarReservas("src/Datos/DatosReserva.dat");
         c=(CSCircular)CargarClientes("src/Datos/DatosClientes.dat");
         
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pantalla_interfaz = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        pantalla_interfaz1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        pantalla_interfaz2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("ESTADISTICAS RESERVAS");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setText("CLIENTES");

        jScrollPane1.setViewportView(pantalla_interfaz);

        jScrollPane2.setViewportView(pantalla_interfaz1);

        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("VER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("VER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(pantalla_interfaz2);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setText("RESERVAS");

        jButton4.setText("Mostrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(175, 175, 175))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(183, 183, 183))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(230, 230, 230)
                        .addComponent(jButton1)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel1)))))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(135, 135, 135)
                    .addComponent(jLabel3)
                    .addContainerGap(527, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addGap(18, 18, 18))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(jLabel3)
                    .addContainerGap(523, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.adm.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String titulos[]={"ID CLIENTE", "ID HOTEL","ID TRANSPORTE","FECHA DE RESERVA","ESTADO", "ID DESTINO"};
        //POR DEFECTO PORQUE NO SABEMOS EL TAMA;O REAL
        DefaultTableModel pantalla =new DefaultTableModel(null,titulos);
        //recorrer para mostra cada objeto de la pila
        int nr= r.nElem();
        for (int i=1; i<=nr;i++){
            Reserva x= (Reserva)r.eliPrimero();r.adiFin(x);
            String fila[]={x.getIDcliente(),x.getIDhotel(),x.getIDtransporte(),x.getFechareserva(),x.getEstado(),Integer.toString(x.getIDdestino())};
            pantalla.addRow(fila);
        }
       
        pantalla_interfaz.setModel(pantalla);
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String titulos[]={"CARNET","NOMBRE","CORREO","TELEFONO"};
        
        //POR DEFECTO PORQUE NO SABEMOS EL TAMA;O REAL
        DefaultTableModel pantalla =new DefaultTableModel(null,titulos);
        //recorrer para mostra cada objeto de la pila 
        int nr= c.nElem();
        for (int i=1; i<=nr;i++){
            Cliente x= (Cliente)c.eliminar();c.adicionar(x);
            String fila[]={x.getIDcliente(),x.getNom(),x.getCorreo(),x.getTelefono()};
            pantalla.addRow(fila);
        }
        
        pantalla_interfaz1.setModel(pantalla);
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        estReservas t;
        CSCircular er=new CSCircular (100);
        int nr=r.nElem(); int nm=0,nl=0,nu=0, cm=0,cl=0,cu=0;;
        for (int i=1; i<=nr;i++){
            Reserva re = (Reserva)r.eliPrimero();r.adiFin(re);
            if (re.getIDdestino()==1) {
                if (re.getEstado().equals("Reservado")) nu=nu+1;
                else cu=cu+1;
            }
            else if (re.getIDdestino()==2) {
                if (re.getEstado().equals("Reservado")) nm=nm+1;
                else cm=cm+1;
            }
            else {
                if (re.getEstado().equals("Reservado")) nl=nl+1;
                else cl=cl+1;
            }
        }
        t=new estReservas("UYUNI", nu, cu);er.adicionar(t);
        t=new estReservas("MADIDI", nm, cm);er.adicionar(t);
        t=new estReservas("LA PAZ", nl, cl);er.adicionar(t);
        String titulos[]={"DESTINO","TOTAL RESERVAS","TOTAL CANCELACIONES"};
        
        //POR DEFECTO PORQUE NO SABEMOS EL TAMA;O REAL
        DefaultTableModel pantalla =new DefaultTableModel(null,titulos);
        //recorrer para mostra cada objeto de la pila 
        nr= er.nElem();
        for (int i=1; i<=nr;i++){
            estReservas x= (estReservas)er.eliminar();er.adicionar(x);
            String fila[]={x.getIddes(),Integer.toString(x.getTres()),Integer.toString(x.getTcan())};
            
            pantalla.addRow(fila);
        }
        
        pantalla_interfaz2.setModel(pantalla);
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Reservas_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservas_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservas_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservas_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservas_Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable pantalla_interfaz;
    private javax.swing.JTable pantalla_interfaz1;
    private javax.swing.JTable pantalla_interfaz2;
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

    private estReservas estReservas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
