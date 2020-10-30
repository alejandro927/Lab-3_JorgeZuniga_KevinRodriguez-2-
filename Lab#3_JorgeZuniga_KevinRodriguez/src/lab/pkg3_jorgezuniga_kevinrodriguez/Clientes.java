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
public class Clientes extends Personas {
    protected double dinero;
    protected ArrayList <Productos>producto=new ArrayList();

    public Clientes() {
        super();
    }

    public Clientes(double dinero, String nombre, String contra, String UserName, String correo, Long ID) {
        super(nombre, contra, UserName, correo, ID);
        this.dinero = dinero;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Clientes{" + "dinero=" + dinero + ", producto=" + producto + '}';
    }
    
    
    
}
