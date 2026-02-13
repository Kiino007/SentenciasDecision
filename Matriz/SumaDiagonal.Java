import java.util.Scanner;

public class SumaDiagonal {
    public static void main(String[] args) {

        final var RENGLONES = 3;
        final var COLUMNAS = 3;

        var matriz = new int[RENGLONES][COLUMNAS];
        var consola = new Scanner(System.in);

        for( var ren = 0 ; ren < RENGLONES ; ren++ ){
            for( var col = 0 ; col < COLUMNAS ; col++ ) {
                System.out.print("Valor [" + ren + "] [" + col + "]: ");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }
        var suma = 0;
        for( var ren = 0 ; ren < RENGLONES ; ren++ ){
            for( var col = 0 ; col < COLUMNAS ; col++ ){
                if (ren == col){
                    suma = suma + matriz[ren][col];
                }
            }
        }
        System.out.println("Suma diagonal: " + suma);
    }
}
