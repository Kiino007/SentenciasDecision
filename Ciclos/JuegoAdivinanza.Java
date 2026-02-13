import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {

        // Se define una constante para el numero maximo de intentos, un objeto Scanner para leer la entrada del usuario y un objeto Random para generar un numero aleatorio
        final var NUMEROMAXIMOINTENTOS = 10;
        var consola = new Scanner(System.in);
        var random = new Random();

        // Se define una variable contador para contar el numero de intentos, una variable numeroRandom para almacenar el numero aleatorio generado, una variable numero para almacenar el numero ingresado por el usuario y una variable booleana salir para controlar el ciclo
        var contador = 0;
        var numeroRandom = random.nextInt(50) + 1; 
        System.out.print("Ingrese un numero del 1 al 50: ");
        var numero = consola.nextInt();
        var salir = false;

        // Ciclo para que el usuario adivine el numero generado aleatoriamente, el ciclo se repetira hasta que el usuario adivine el numero o supere el numero maximo de intentos
        while(!salir){

            // Incrementamos el contador de intentos cada vez que el usuario ingresa un numero
            contador++;

            // Validamos si el numero ingresado por el usuario es igual al numero aleatorio generado, si es asi mostramos un mensaje de felicitaciones y el numero de intentos, y cambiamos la variable salir a true para terminar el ciclo
            if(numero == numeroRandom){
                System.out.println("\nFelicitaciones, ganaste la adivinanza: " + numeroRandom + " INGRESASTE: " + numero + " en " + contador + " intentos");
                salir = true;
            }

            // Validamos si el numero de intentos es igual al numero maximo de intentos, si es asi mostramos un mensaje de que se supero el numero de intentos permitidos y cambiamos la variable salir a true para terminar el ciclo
            else if (contador == NUMEROMAXIMOINTENTOS) {
                System.out.println("\nSuperaste el numero de intentos permitidos: " + NUMEROMAXIMOINTENTOS);
                salir = true;
            }

            // Validamos si el numero ingresado por el usuario es mayor a 50, si es asi mostramos un mensaje de error y solicitamos al usuario ingresar un numero del 1 al 50
            else if (numero > 50) {
                System.out.println("\nIngresaste un numero mayor al 50, numero de intentos: " + contador + " de " + NUMEROMAXIMOINTENTOS);
                System.out.print("\nIntentalo de nuevo, ingrese numero del 1 al 50: ");
                numero = consola.nextInt();
            }

            // Validamos si el numero ingresado por el usuario es menor a 1, si es asi mostramos un mensaje de error y solicitamos al usuario ingresar un numero del 1 al 50
            else if (numero < 1) {
                System.out.println("\nIngresaste un numero menor al 1, numero de intentos: " + contador + " de " + NUMEROMAXIMOINTENTOS);
                System.out.print("\nIntentalo de nuevo, ingrese numero del 1 al 50: ");
                numero = consola.nextInt();
            }

            // Validamos si el numero ingresado por el usuario es mayor al numero aleatorio generado, si es asi mostramos un mensaje de que el numero ingresado es mayor al numero a adivinar y solicitamos al usuario ingresar un nuevo numero del 1 al 50
            else if (numero > numeroRandom ){
                System.out.println("\nEl valor ingresado: " + numero + " es mayor al numero, numero de intentos: " + contador + " de " + NUMEROMAXIMOINTENTOS);
                System.out.print("\nIntentalo de nuevo, ingrese numero del 1 al 50: ");
                numero = consola.nextInt();
            }

            // Validamos si el numero ingresado por el usuario es menor al numero aleatorio generado, si es asi mostramos un mensaje de que el numero ingresado es menor al numero a adivinar y solicitamos al usuario ingresar un nuevo numero del 1 al 50
            else if (numero < numeroRandom) {
                System.out.println("\nEl valor ingresado: " + numero + " es menor al numero, numero de intentos: " + contador + " de " + NUMEROMAXIMOINTENTOS);
                System.out.print("\nIntentalo de nuevo, ingrese numero del 1 al 50: ");
                numero = consola.nextInt();
            }
        }
    }
}