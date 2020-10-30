/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_jorgezuniga_kevinrodriguez;

import java.util.ArrayList;

/**
 *
 * @author Kevin
 */
public class Comida extends Productos{
     protected ArrayList comida=new ArrayList();
     protected String fecha;

    public Comida(String fecha, String descrip, String Nombre, double precio) {
        super(descrip, Nombre, precio);
        this.fecha = fecha;
    }
    public void Agregar(){
        comida.add(descrip);
        comida.add(Nombre);
        comida.add(precio);
    } 

    public ArrayList getComida() {
        return comida;
    }

    public void setComida(ArrayList comida) {
        this.comida = comida;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Comida{" + "comida=" + comida + ", fecha=" + fecha + '}';
    }
}
