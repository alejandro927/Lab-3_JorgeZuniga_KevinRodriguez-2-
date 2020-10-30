/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_jorgezuniga_kevinrodriguez;

/**
 *
 * @author Kevin
 */
public class Productos {
    protected String descrip;
    protected String Nombre;
    protected double precio;

    public Productos() {
    }

    public Productos(String descrip, String Nombre, double precio) {
        this.descrip = descrip;
        this.Nombre = Nombre;
        this.precio = precio;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos{" + "descrip=" + descrip + ", Nombre=" + Nombre + ", precio=" + precio + '}';
    }
}
