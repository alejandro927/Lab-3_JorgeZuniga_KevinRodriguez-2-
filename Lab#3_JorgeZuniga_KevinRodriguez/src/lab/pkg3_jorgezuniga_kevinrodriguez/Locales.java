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
    protected ArrayList <Empleados> empleados=new ArrayList();
    protected ArrayList <Productos>producto=new ArrayList();
    protected String gerente;

    public Locales(String nombreLocal) {
        this.nombreLoc = nombreLocal;
    }

    public Locales(String nombreLoc,ArrayList <Empleados> empleados, ArrayList <Productos>producto,  String gerente) {
        this.nombreLoc = nombreLoc;
        this.empleados=empleados;
        this.producto=producto;
        this.gerente = gerente;
    }
    
    public String getNombre() {
        return nombreLoc;
    }

    public void setNombre(String nombreLocal) {
        this.nombreLoc = nombreLoc;
    }

    public ArrayList getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList empleados) {
        this.empleados = empleados;
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
        return "Locales{" + "nombreLocal=" + nombreLoc + ", empleados=" + empleados + ", producto=" + producto + ", gerente=" + gerente + '}';
    }

    

}
