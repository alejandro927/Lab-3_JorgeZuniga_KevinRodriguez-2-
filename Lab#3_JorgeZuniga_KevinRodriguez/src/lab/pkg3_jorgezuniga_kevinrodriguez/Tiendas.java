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
public class Tiendas extends Locales{
    ArrayList <Ropa> ropa;
    ArrayList <Juguetes> Juguetes;
    
    public Tiendas(ArrayList<Ropa> ropa, ArrayList<Juguetes> Juguetes, String nombreLoc, ArrayList<Empleados> empleados, ArrayList<Productos> producto, String gerente) {
        super(nombreLoc, empleados, producto, gerente);
        this.ropa = ropa;
        this.Juguetes = Juguetes;
    }
    
    public ArrayList<Ropa> getRopa() {
        return ropa;
    }

    public void setRopa(ArrayList<Ropa> ropa) {
        this.ropa = ropa;
    }

    public ArrayList<Juguetes> getJuguetes() {
        return Juguetes;
    }

    public void setJuguetes(ArrayList<Juguetes> Juguetes) {
        this.Juguetes = Juguetes;
    }

    @Override
    public String toString() {
        return "Tiendas{" + "ropa=" + ropa + ", Juguetes=" + Juguetes + '}';
    }
}
