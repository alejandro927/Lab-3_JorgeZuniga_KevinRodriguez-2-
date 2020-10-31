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
public class Locales {
    protected String nombreLoc;
    //protected ArrayList <Empleados> empleados=new ArrayList();
    protected ArrayList <Productos>producto=new ArrayList();
    protected String gerente;
    protected String empleado;
    

    public Locales(String nombreLocal) {
        this.nombreLoc = nombreLocal;
    }

    public Locales(String nombreLoc,String empleado, ArrayList <Productos>producto,  String gerente) {
        this.nombreLoc = nombreLoc;
        this.empleado=empleado;
        this.producto=producto;
        this.gerente = gerente;
    }
    
    public String getNombre() {
        return nombreLoc;
    }

    public void setNombre(String nombreLocal) {
        this.nombreLoc = nombreLocal;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado=empleado;
    }


    public ArrayList getProductos() {
        return producto;
    }

    public void setProductos(ArrayList producto) {
        this.producto = producto;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "Locales{" + "nombreLocal=" + nombreLoc + ", empleados=" + empleado + ", producto=" + producto + ", gerente=" + gerente + '}';
    }

    

}
