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
public class Juguetes extends Productos{
   protected ArrayList Juguetes=new ArrayList();
     public Juguetes() {
    }

    public Juguetes(String descrip, String Nombre, double precio,ArrayList Juguetes) {
        super(descrip, Nombre, precio);
        this.Juguetes=Juguetes;
       
    }

    public ArrayList getRopa() {
        return Juguetes;
    }

    public void setRopa(ArrayList Ropa) {
        this.Juguetes = Juguetes;
    }
    
    public void Agregar(){
        Juguetes.add(descrip);
        Juguetes.add(Nombre);
        Juguetes.add(precio);
    }  
}
