import java.util.Scanner;

public class DibujaTriangulo {
    public static void main(String[] args) {

        // Solicitar al usuario el numero de filas para el triangulo
        var consola = new Scanner(System.in);
        System.out.print("Ingresa el numero de filas para del triangulo: ");

        // Guardamos el numero de filas para el triangulo
        var numeroFilas = consola.nextInt();

        //Iteramos sobre cada fila del triangulo
        for(var fila = 1; fila <= numeroFilas; fila++) {

            // Calculamos el numero de espacios en blanco y asteriscos para cada fila
            var espaciosBlanco = " ".repeat(numeroFilas - fila);
            var asteriscos = "*".repeat(2 * fila - 1);

            // Imprimimos la fila del triangulo con los espacios en blanco y asteriscos 
            System.out.println(espaciosBlanco + asteriscos);
        }
    }
}