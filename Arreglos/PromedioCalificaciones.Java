import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {

        // Solicitar al usuario cuantas calificaciones desea agregar
        var consola = new Scanner(System.in);
        System.out.print("Cuantas calificaciones desea agregar?: ");
        var numeroCalificaciones = Integer.parseInt(consola.nextLine());

        // Guardamos las calificaciones en un arreglo
        var calificaciones = new int[numeroCalificaciones];

        // Solicitamos al usuario ingresar las calificaciones y las guardamos en el arreglo
        for (var i = 0; i < numeroCalificaciones; i++) {
            System.out.print("Ingrese la calificacion numero: " + (i + 1) + " = ");
            calificaciones[i] = Integer.parseInt(consola.nextLine());
        }
        // Calculamos el promedio de las calificaciones sumando todas las calificaciones
        var suma = 0;
        for (var i = 0; i < numeroCalificaciones; i++) {
            suma = suma + calificaciones[i];
        }
        // Calculamos el promedio dividiendo la suma de las calificaciones entre el numero de calificaciones
        int resultado = suma / numeroCalificaciones;
        System.out.println("El promedio de las calificaciones: " + resultado);
    }
}