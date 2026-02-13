import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {

        // Se definene variables para el costo de envio
        final var COSTO_NACIONAL = 10;
        final var COSTO_INTERNACIONAL = 20;

        // Solicitar al usuario ingresar el destino y peso del paquete
        var consola = new Scanner(System.in);
        System.out.print("Ingrese el destino (nacional/nnternacional): ");
        var destino = consola.nextLine().strip().toLowerCase();

        System.out.print("Ingrese el peso (Kilogramos) del paquete: ");
        var peso = Double.parseDouble(consola.nextLine());

        // Calculo del envío del paquete con sentencias 
        var costo = (destino.equals("nacional")) ? peso * COSTO_NACIONAL : (destino.equals("internacional")) ? peso * COSTO_INTERNACIONAL : "Ingresaste un destino incorrecto";
        System.out.println("\nEl destino ingresado del paquete fue: " + destino + "\nEl peso ingresado del paquete fue: " + peso + "\nEl costo para el paquete es de: " + costo);

        // Calculo del envío del paquete Mejorado
        //Double costoEnvio = switch (destino){
            //case "nacional" -> peso * TARIFA_NACIONAL;
            //case "internacional" -> peso * TARIFA_INTERNACIONAL;
            //default -> {
                //System.out.println("Destino inválido. Ingresa nacional/internacional");
               // yield null;
           // }
        //};
        // Mostramos el costo de envío
        //if(costoEnvio != null)
            //System.out.printf("El costo de envío de paquete es: $%.2f", costoEnvio);

    }
}