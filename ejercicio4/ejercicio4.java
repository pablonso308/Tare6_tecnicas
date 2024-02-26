

import java.util.Random;

public class ejercicio4 {


    public static void realizarMovimiento(int[][] tablero, int[] posicion) {
        int currentX = posicion[0];
        int currentY = posicion[1];


        if (currentY + 1 < tablero[0].length && tablero[currentX][currentY + 1] == 0) {

            tablero[currentX][currentY] = 0;

            tablero[currentX][currentY + 1] = 1;

            posicion[1] = currentY + 1;
        }
    }


    public static boolean esMovimientoVálido(int[][] tablero, int[] posicion) {
        int currentX = posicion[0];
        int currentY = posicion[1];

        //confirmar si se puede mover la oveja

        if (currentY + 1 < tablero[0].length && tablero[currentX][currentY + 1] == 0) {
            return true;
        }
        return false;
    }


    private static void mostrarTablero(int[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

   private static int[] obtenerMovimiento() {
    int[] posicion = new int[2];
    // Generar un número aleatorio entre 0 y 3
    int direccion = new Random().nextInt(4);
    switch (direccion) {
        case 0:
            // Mover hacia arriba
            posicion[0] = -1;
            posicion[1] = 0;
            break;
        case 1:
            // Mover hacia abajo
            posicion[0] = 1;
            posicion[1] = 0;
            break;
        case 2:
            // Mover hacia la izquierda
            posicion[0] = 0;
            posicion[1] = -1;
            break;
        case 3:
            // Mover hacia la derecha
            posicion[0] = 0;
            posicion[1] = 1;
            break;
    }
    return posicion;
}

   private static boolean esConfiguraciónFinal(int[][] tablero) {
    for (int i = 0; i < tablero.length; i++) {
        for (int j = 0; j < tablero[i].length; j++) {
            if (tablero[i][j] == 0) {
                return false;
            }
        }
    }
    return true; // Si todas las celdas están ocupadas (1), la configuración es final
}



        public static void main(String[] args) {
            // algoritmo principal
            int[][] tablero = new int[5][5];
            int[] posicion;
            tablero[0][0] = 1;
            while (!esConfiguraciónFinal(tablero)) {
                mostrarTablero(tablero);
                posicion = obtenerMovimiento();
                if (esMovimientoVálido(tablero, posicion)) {
                    realizarMovimiento(tablero, posicion);
                }
            }
            System.out.println("¡Objetivo alcanzado!");
        }
    }




