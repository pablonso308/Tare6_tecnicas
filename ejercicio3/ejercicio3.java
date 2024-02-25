package ejercicio3;
import java.util.ArrayList;
import java.util.Random;

public class ejercicio3 {

        public static void main(String[] args) {
            ArrayList<Integer> tabla = crearTablaAleatoria(10, 1, 100);
            System.out.println("Tabla: " + tabla);
            System.out.println("El mayor es: " + encontrarMayor(tabla));
        }

        public static ArrayList<Integer> crearTablaAleatoria(int tamaño, int mínimo, int máximo) {
            ArrayList<Integer> tabla = new ArrayList<>();
            Random random = new Random();

            for (int i = 0; i < tamaño; i++) {
                tabla.add(random.nextInt(máximo - mínimo + 1) + mínimo);
            }

            return tabla;
        }

        public static int encontrarMayor(ArrayList<Integer> tabla) {
            int mayor = tabla.get(0);
            for (int valor : tabla) {
                if (valor > mayor) {
                    mayor = valor;
                }
            }
            return mayor;
        }


    }
