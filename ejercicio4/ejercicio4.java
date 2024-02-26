import java.util.InputMismatchException;

public class ejercicio4 {
    private static final char OVEJA = 'O';
    private static final char VACIO = ' ';
    private static char[][] tablero;
    private static final int TAMANO = 5; // Tamaño del tablero

    public static void main(String[] args) {
        tablero = crearTableroInicial();

        System.out.println("¡Bienvenido al Juego del Rebaño de Ovejas!");

        mostrarTablero();

        while (!esConfiguracionFinal()) {
            try {
                // Simulación de movimientos automáticos
                int filaInicial = obtenerAleatorio(0, TAMANO - 1);
                int columnaInicial = obtenerAleatorio(0, TAMANO - 1);
                int filaFinal = obtenerAleatorio(0, TAMANO - 1);
                int columnaFinal = obtenerAleatorio(0, TAMANO - 1);

                realizarMovimiento(filaInicial, columnaInicial, filaFinal, columnaFinal);
                System.out.println("¡Movimiento exitoso!");
                mostrarTablero();
            } catch (MovimientoInvalidoException e) {
                System.out.println(e.getMessage());
                System.out.println("Oops... ese movimiento no es válido. ¡Inténtalo de nuevo!");
            }
        }

        System.out.println("¡Felicidades! Has logrado alcanzar la configuración objetivo. Las ovejas te lo agradecen.");
    }

    private static char[][] crearTableroInicial() {
        char[][] tablero = new char[TAMANO][TAMANO];
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                tablero[i][j] = VACIO;
            }
        }
        tablero[1][1] = OVEJA;
        tablero[2][3] = OVEJA;
        tablero[4][4] = OVEJA;
        return tablero;
    }

    private static void mostrarTablero() {
        System.out.print("  ");
        for (int i = 0; i < tablero.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < tablero.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void realizarMovimiento(int filaInicial, int columnaInicial, int filaFinal, int columnaFinal) throws MovimientoInvalidoException {
        if (!esMovimientoValido(filaInicial, columnaInicial, filaFinal, columnaFinal)) {
            throw new MovimientoInvalidoException("El movimiento es inválido.");
        }
        tablero[filaFinal][columnaFinal] = OVEJA;
        tablero[filaInicial][columnaInicial] = VACIO;
    }

    private static boolean esMovimientoValido(int filaInicial, int columnaInicial, int filaFinal, int columnaFinal) {
        return filaInicial >= 0 && filaInicial < TAMANO &&
                columnaInicial >= 0 && columnaInicial < TAMANO &&
                filaFinal >= 0 && filaFinal < TAMANO &&
                columnaFinal >= 0 && columnaFinal < TAMANO &&
                tablero[filaInicial][columnaInicial] == OVEJA &&
                tablero[filaFinal][columnaFinal] == VACIO;
    }

    private static boolean esConfiguracionFinal() {
        int contadorOvejas = 0;
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                if (tablero[i][j] == OVEJA) {
                    contadorOvejas++;
                }
            }
        }
        return contadorOvejas > 0 && contadorOvejas == contarOvejasConectadas(0, 0, new boolean[TAMANO][TAMANO]);
    }

    private static int contarOvejasConectadas(int fila, int columna, boolean[][] visitado) {
        if (fila < 0 || fila >= TAMANO || columna < 0 || columna >= TAMANO || visitado[fila][columna] || tablero[fila][columna] != OVEJA) {
            return 0;
        }

        visitado[fila][columna] = true;
        int cuenta = 1;

        cuenta += contarOvejasConectadas(fila + 1, columna, visitado);
        cuenta += contarOvejasConectadas(fila - 1, columna, visitado);
        cuenta += contarOvejasConectadas(fila, columna + 1, visitado);
        cuenta += contarOvejasConectadas(fila, columna - 1, visitado);

        return cuenta;
    }

    private static int obtenerAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}

class MovimientoInvalidoException extends Exception {
    public MovimientoInvalidoException(String mensaje) {
        super(mensaje);
    }
}
