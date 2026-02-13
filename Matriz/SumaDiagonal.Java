import java.util.Scanner;

public class SumaDiagonal {
    public static void main(String[] args) {

        // Definimos las constantes para el numero de renglones y columnas de la matriz
        final var RENGLONES = 3;
        final var COLUMNAS = 3;

        // Creamos una matriz de enteros 
        var matriz = new int[RENGLONES][COLUMNAS];

        // Solicitamos al usuario ingresar los valores para cada elemento de la matriz
        var consola = new Scanner(System.in);
        for( var ren = 0 ; ren < RENGLONES ; ren++ ){
            for( var col = 0 ; col < COLUMNAS ; col++ ) {
                System.out.print("Valor [" + ren + "] [" + col + "]: ");

                // Guardamos el valor ingresado por el usuario en la matriz
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }
        // Calculamos la suma de los elementos de la diagonal principal de la matriz
        var suma = 0;
        for( var ren = 0 ; ren < RENGLONES ; ren++ ){
            for( var col = 0 ; col < COLUMNAS ; col++ ){

                // Si el numero de renglon es igual al numero de columna, entonces el elemento pertenece a la diagonal principal
                if (ren == col){
                    suma = suma + matriz[ren][col];
                }
            }
        }
        // Mostramos la suma de los elementos de la diagonal principal de la matriz
        System.out.println("Suma diagonal: " + suma);
    }
}
