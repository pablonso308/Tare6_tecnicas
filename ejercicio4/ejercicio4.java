package ejercicio4;

public class ejercicio4 {

    public static void main(String[] args) {
        int[][] tablero = new int[10][10];
        int[] posicionActual = {3, 5};
        int[] nuevaPosicion = {3, 6};

        //crear barco
        tablero[posicionActual[0]][posicionActual[1]] = 1;

        //crear instancia de la clase Barco
        Barco barco = new Barco();

        //realizar movimiento
        barco.realizarMovimiento(tablero, posicionActual, nuevaPosicion);

        //imprimir tablero
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void realizarMovimiento(int[][] tablero, int[] posicionActual, int[] nuevaPosicion) {
        int filaActual = posicionActual[0];
        int columnaActual = posicionActual[1];
        int nuevaFila = nuevaPosicion[0];
        int nuevaColumna = nuevaPosicion[1];

        // confirmar que la nueva posición esté dentro del tablero
        if (esMovimientoValido(tablero, nuevaPosicion)) {
            //mover el barco
            tablero[nuevaFila][nuevaColumna] = tablero[filaActual][columnaActual];
            //limpiar posicion actual
            tablero[filaActual][columnaActual] = 0;
        } else {
            System.out.println("Movimiento no válido");
        }
    }


        public boolean esMovimientoValido ( int[][] tablero, int[] nuevaPosicion){
            int nuevaFila = nuevaPosicion[0];
            int nuevaColumna = nuevaPosicion[1];


            //confirmar que la nueva posición esté dentro del tablero
            if (nuevaFila >= 0 && nuevaFila < tablero.length && nuevaColumna >= 0 && nuevaColumna < tablero[0].length) {
                return true;
            } else {
                return false;
            }
        }
    }





