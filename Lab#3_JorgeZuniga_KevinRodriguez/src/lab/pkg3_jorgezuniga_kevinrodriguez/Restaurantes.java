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
public class Restaurantes extends Locales {
    private ArrayList <Comida> menu;
    private Comida platodia;
    

   
    public Restaurantes(ArrayList<Comida> menu, Comida platodia, String nombreLoc, String empleado, ArrayList<Productos> productos, String gerente) {
        super(nombreLoc, empleado, productos, gerente);
        this.menu = menu;
        this.platodia = platodia;
    }
    
    //Accesores y mutadores

    public ArrayList<Comida> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Comida> menu) {
        this.menu = menu;
    }

    public Comida getPlatodia() {
        return platodia;
    }

    public void setPlatodia(Comida platodia) {
        this.platodia = platodia;
    }
    
    //Administrativos

    @Override
    public String toString() {
        return "Restaurantes{" + "menu=" + menu + ", platodia=" + platodia + '}';
    }
}
