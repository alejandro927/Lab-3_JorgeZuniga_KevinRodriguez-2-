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
public class Ropa extends Productos{
    protected ArrayList Ropa=new ArrayList();
        protected int talla;
    public Ropa() {
    }

    public Ropa(String descrip, String Nombre, double precio,ArrayList Ropa,int talla) {
        super(descrip, Nombre, precio);
        this.Ropa=Ropa;
       this.talla=talla;
    }
    public void Agregar(){
        Ropa.add(descrip);
        Ropa.add(Nombre);
        Ropa.add(precio);
    } 


    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    
    public ArrayList getRopa() {
        return Ropa;
    }

    public void setRopa(ArrayList Ropa) {
        this.Ropa = Ropa;
    }

    @Override
    public String toString() {
        return "Ropa{" + "Ropa=" + Ropa + ", talla=" + talla + '}';
    }
    
    
   
   }
