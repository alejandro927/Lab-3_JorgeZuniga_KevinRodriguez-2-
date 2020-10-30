package lab.pkg3_jorgezuniga_kevinrodriguez;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_JorgeZuniga_KevinRodriguez {
    //metodo de lectura
    static Scanner sc = new Scanner(System.in);
    static ArrayList contraseña =  new ArrayList();
    static ArrayList cliente =  new ArrayList();
    public static void main(String[] args) {
        char resp='s';
        while (resp == 's') {            
            int opcion;
            System.out.println("MENU\n"
                    + "1)Log In Administrador\n"
                    + "2)Log In Cliente\n"
                    + "3)Sing In Cliente\n"
                    + "Elija su opcion:");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:{
                    String contra = "SUDO";
                    String contraIngresada= "";
                    System.out.println("Ingrese la contraseña:");
                    contraIngresada = sc.nextLine();
                    if (contra.equals(contraIngresada)) {
                        int op;
                        System.out.println("SubMENU\n"
                                + "1)Locales\n"
                                + "2)Personas\n"
                                + "3)Productos\n"
                                + "Elija su opcion:");
                        op = sc.nextInt();
                        while (op<1 || op >3) {                            
                            System.out.println("El numero ingresado no es correcto ingrese uno nuevo:");
                            op = sc.nextInt();
                        }
                        switch(op){
                            case 1:{
                                
                            }
                        }
                    }
                }break;
                case 2:{
                    
                }break;
                case 3:{
                    String nombre;
                    String contra;
                    System.out.println("Ingrese su nombre:");
                    nombre = sc.nextLine();
                    cliente.add(nombre);
                    System.out.println("Ingrese su contraseña:");
                    contra = sc.nextLine();
                    contraseña.add(contra);
                    
                }break;
            }
            
            
            
            
        }
    }
    
}
