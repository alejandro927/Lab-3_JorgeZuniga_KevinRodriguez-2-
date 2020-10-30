package lab.pkg3_jorgezuniga_kevinrodriguez;

public class Personas {

    private String nombre, contra, UserName, correo;
    private Long ID;

    public Personas() {
    }

    public Personas(String nombre, String contra, String UserName, String correo, Long ID) {
        this.nombre = nombre;
        this.contra = contra;
        this.UserName = UserName;
        this.correo = correo;
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", contra=" + contra + ", UserName=" + UserName + ", correo=" + correo + ", ID=" + ID;
    }

}
