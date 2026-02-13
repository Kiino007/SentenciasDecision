import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        System.out.print("Cuantas calificaciones desea agregar?: ");
        var numeroCalificaciones = Integer.parseInt(consola.nextLine());

        var calificaciones = new int[numeroCalificaciones];
        for (var i = 0; i < numeroCalificaciones; i++) {
            System.out.print("Ingrese la calificacion numero: " + (i + 1) + " = ");
            calificaciones[i] = Integer.parseInt(consola.nextLine());
        }
        var suma = 0;
        for (var i = 0; i < numeroCalificaciones; i++) {
            suma = suma + calificaciones[i];
        }
        int resultado = suma / numeroCalificaciones;
        System.out.println("El promedio de las calificaciones: " + resultado);
    }
}