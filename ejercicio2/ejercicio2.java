
import java.util.Scanner;

public class ejercicio2 {


//en este procedimiento se dan los valores caracteristicos del tablero
    public void inicializarTablero(int[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = 0;
            }
        }
    }


//como indica el nombre, este procedimiento muestra el tablero
    public void mostrarTablero(int[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void introducirEnteroEntreLimites(int minimo, int maximo) {
        Scanner scanner = new Scanner(System.in);
        int input;

        while (true) {
            System.out.println("ingrese un valor entre " + minimo + " y " + maximo + ":");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= minimo && input <= maximo) {
                    break;
                } else {
                    System.out.println("no esta entre los limites. prueba otra vez.");
                }
            } else {
                System.out.println("La entrada no es un número entero. Prueba otra vez.");
                scanner.next();
            }
        }
    }

    public boolean disparar(int[][] tablero, int fila, int columna) {
        if (tablero[fila - 1][columna - 1] == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ejercicio2 ej2 = new ejercicio2();
        int[][] tablero = new int[5][5];
        ej2.inicializarTablero(tablero);
        ej2.mostrarTablero(tablero);
        ej2.introducirEnteroEntreLimites(1, 5);
        ej2.disparar(tablero, 1, 1);
    }

}









