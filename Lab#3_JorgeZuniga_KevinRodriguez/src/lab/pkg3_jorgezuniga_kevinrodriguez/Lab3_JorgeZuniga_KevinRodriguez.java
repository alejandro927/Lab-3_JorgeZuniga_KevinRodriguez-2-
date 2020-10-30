package lab.pkg3_jorgezuniga_kevinrodriguez;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_JorgeZuniga_KevinRodriguez {

    //metodo de lectura
    static Scanner sc = new Scanner(System.in);
    static ArrayList contraseña = new ArrayList();
    static ArrayList username = new ArrayList();
    static ArrayList id = new ArrayList();
    static ArrayList cliente = new ArrayList();
    static ArrayList empleado = new ArrayList();

    public static void main(String[] args) {
        char resp = 's';
        while (resp == 's') {
            int opcion;
            System.out.println("MENU\n"
                    + "1)Log In Administrador\n"
                    + "2)Log In Cliente/empleado(a)\n"
                    + "3)Sing In Cliente/empleado(a)\n"
                    + "4)Salida\n"
                    + "Elija su opcion:");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1: {
                    String contra = "SUDO";
                    String contraIngresada = "";
                    System.out.println("Ingrese la contraseña de administrador:");
                    contraIngresada = sc.nextLine();
                    contraIngresada = sc.nextLine();
                    if (contra.equals(contraIngresada)) {
                        int op;
                        System.out.println("SubMENU\n"
                                + "1)Locales\n"
                                + "2)Personas\n"
                                + "3)Productos\n"
                                + "Elija su opcion:");
                        op = sc.nextInt();
                        while (op < 1 || op > 3) {
                            System.out.println("El numero ingresado no es correcto ingrese uno nuevo:");
                            op = sc.nextInt();
                        }
                        switch (op) {
                            case 1: {
                                
                            }
                        }
                    }
                }
                break;
                case 2: {
                    
                }
                break;
                case 3: {
                    int op;
                    System.out.println("SubMENU\n"
                            + "1)Cliente\n"
                            + "2)Empleado\n"
                            + "Elija la opcion que sera:");
                    op = sc.nextInt();
                    switch (op) {
                        case 1: {
                            String nombre, contra, UserName, correo;
                            Long ID;
                            System.out.println("Ingrese su nombre completo:");
                            nombre = sc.nextLine();
                            nombre = sc.nextLine();
                            System.out.println("Ingrese su nombre de usuario:");
                            UserName = sc.nextLine();
                            while (username.contains(UserName)) {
                                System.out.println("Nombre de usuario en uso\n"
                                        + "Ingrese un nuevo nombre de usuario: ");
                                UserName = sc.nextLine();
                            }
                            username.add(UserName);
                            System.out.println("Ingrese su contraseña:");
                            contra = sc.nextLine();
                            System.out.println("Ingrese su ID:");
                            ID = sc.nextLong();
                            while(id.contains(ID)){
                                System.out.println("La ID ya existe ingrese nuevamente:");
                                ID = sc.nextLong();
                            }
                            id.add(ID);
                            System.out.println("Ingrese su correo electronico:");
                            correo = sc.nextLine();
                            correo = sc.nextLine();
                            contraseña.add(contra);
                            cliente.add(new Personas(nombre, contra, UserName, correo, ID));
                            String salida = "";
                            System.out.println("Su lista es:");
                            for (Object t : cliente) {
                                salida += "" + cliente.indexOf(t) + "=> " + t + "\n";
                            }
                            System.out.println(salida);

                        }
                        break;
                        case 2: {
                            String nombre, contra, UserName, correo;
                            Long ID;
                            System.out.println("Ingrese su nombre completo:");
                            nombre = sc.nextLine();
                            nombre = sc.nextLine();
                            System.out.println("Ingrese su nombre de usuario:");
                            UserName = sc.nextLine();
                            while (username.contains(UserName)) {
                                System.out.println("Ingrese un nuevo nombre de usuario: ");
                                UserName = sc.nextLine();
                            }
                            username.add(UserName);
                            System.out.println("Ingrese su contraseña:");
                            contra = sc.nextLine();
                            System.out.println("Ingrese su ID:");
                            ID = sc.nextLong();
                            while(id.contains(ID)){
                                System.out.println("La ID ya existe ingrese nuevamente:");
                                ID = sc.nextLong();
                            }
                            id.add(ID);
                            System.out.println("Ingrese su correo electronico:");
                            correo = sc.nextLine();
                            correo = sc.nextLine();
                            contraseña.add(contra);
                            empleado.add(new Personas(nombre, contra, UserName, correo, ID));
                            String salida = "";
                            for (Object t : empleado) {
                                salida += "" + empleado.indexOf(t) + "=> " + t + "\n";
                            }
                            System.out.println(salida);

                        }
                    }

                }
                break;
                case 4: {
                    System.out.println("Gracias por comprar con nosotros!! <3");
                    resp = 'n';
                    break;
                }
            }

        }
    }

}
