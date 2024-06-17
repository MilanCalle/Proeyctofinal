/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author CARLA
 */
public class estReservas {
        String iddes;
        int tres,tcan;
        public estReservas(String ides,int tor, int car)
        {
            iddes=ides;
            tres=tor;
            tcan=car;
        }

    @Override
    public String toString() {
        return "estReservas{" + "iddes=" + iddes + ", tres=" + tres + ", tcan=" + tcan + '}';
    }

    

    public String getIddes() {
        return iddes;
    }

    public void setIddes(String iddes) {
        this.iddes = iddes;
    }

    

    public int getTres() {
        return tres;
    }

    public void setTres(int tres) {
        this.tres = tres;
    }

    public int getTcan() {
        return tcan;
    }

    public void setTcan(int tcan) {
        this.tcan = tcan;
    }
    
        
    
}
