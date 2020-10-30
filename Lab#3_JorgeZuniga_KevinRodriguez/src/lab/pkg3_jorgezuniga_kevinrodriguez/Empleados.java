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
public class Empleados extends Personas {
    private String Horario;
    private int horast;

    public Empleados() {
    }

    public Empleados(String nombre, String contra, String UserName, String correo, Long ID,String Horario,int horast) {
        super(nombre, contra, UserName, correo, ID);
        this.Horario=Horario;
        this.horast=horast;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public int getHorast() {
        return horast;
    }

    public void setHorast(int horast) {
        this.horast = horast;
    }

    @Override
    public String toString() {
        return "Empleados{" + "Horario=" + Horario + ", horast=" + horast + '}';
    }
    
    
}
