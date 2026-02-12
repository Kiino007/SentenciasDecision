import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println(" *** Sistema Autenticacion *** ");

        // Se definen contanstes para usuario y contrasena
        final var USUARIO = "usuario";
        final var CONTRASENA = "12345";

        // Solicitar al usuario ingresar su nombre de usuario y contrasena
        var consola = new Scanner(System.in);
        System.out.print("Ingrese su nombre de usuario: ");
        var nombreUsuario = consola.nextLine().strip().toLowerCase();

        System.out.print("Ingrese su contrasena: ");
        var contrasena1 = consola.nextLine().strip();

        // Validacion de usuario y contrasena con sentencias if-else
        if (USUARIO.equals(nombreUsuario) && CONTRASENA.equals(contrasena1)) {
            System.out.println("Bienenido al sistema");
        }
        else if (USUARIO.equals(nombreUsuario) && !CONTRASENA.equals(contrasena1)) {
            System.out.println("Contrasena incorrecta");
        }
        else if (!USUARIO.equals(nombreUsuario) && CONTRASENA.equals(contrasena1)) {
            System.out.println("Usuario incorrect0");
        }
        else System.out.println("Usuario y contrasena incorrectos");

        // Cada caso de validacion de usuario y password con el metodo switch mejorado
        //var mensajeAutenticacion = switch (usuario){
            //case USUARIO_VALIDO -> {
                //if(PASSWORD_VALIDO.equals(password))
                    //yield "Bienvenido al Sistema!";
                //else
                   // yield "Password incorrecto, favor de corregirlo!";
            //}
           // default -> {
                //if(PASSWORD_VALIDO.equals(password))
                    //yield "Usuario incorrecto, favor de corregirlo!";
                //else
                    //yield "Usuario y password incorrectos, favor de corregirlos!";
            //}
        //};
        // Imprimir el mensaje
        //System.out.println(mensajeAutenticacion);
    }
}