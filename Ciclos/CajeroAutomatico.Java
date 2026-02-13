import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {

        // Se define el objeto Scanner para leer la entrada del usuario, una variable booleana para controlar el ciclo y una variable para el saldo inicial
        var consola = new Scanner(System.in);
        var salir = false;
        var saldo = 1000.0;

        // Ciclo para mostrar el menu del cajero automatico hasta que el usuario decida salir
        while (!salir) {
            System.out.print("""
                    *** Cajero Automatico ***
                    
                    1. Consultar saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Escoge una opcion:\s""");

            // Leer la opcion del usuario y ejecutar la accion correspondiente con un switch
            var opcion = consola.nextInt();
            switch (opcion) {
                case 1 -> System.out.println("Su saldo es de: " + saldo);
                case 2 -> {
                    System.out.print("Ingrese el monto a retirar: ");
                    var retiro = consola.nextDouble();
                    saldo = saldo - retiro;

                    // Validar si el saldo es negativo despues del retiro, si es asi mostrar un mensaje de saldo insuficiente, de lo contrario mostrar el monto retirado y el saldo restante
                    if (saldo < 0) {
                        System.out.println("Saldo insuficiente!");
                    } else
                        System.out.println("Su retiro por el monto de: " + retiro + ", fue exitoso, le queda un saldo de: " + saldo);
                }

                // En el caso de deposito, solicitar al usuario ingresar el monto a depositar, sumar el monto al saldo y mostrar un mensaje con el monto depositado y el saldo actualizado
                case 3 -> {
                    System.out.print("Ingrese el monto a depositar: ");
                    var deposito = consola.nextDouble();
                    saldo = saldo + deposito;
                    System.out.println("Su deposito por el monto de: " + deposito + ", fue exitoso, le queda un saldo de: " + saldo);
                }

                // En el caso de salir, mostrar un mensaje de despedida y cambiar la variable salir a true para terminar el ciclo, en el caso de una opcion invalida, mostrar un mensaje de error
                case 4 -> {
                    System.out.println("Muchas gracias por usar este cajero automatico. Hasta pronto!");
                    salir = true;
                }
                default -> System.out.println("Opcion invalida...");
            }
        }

    }
}