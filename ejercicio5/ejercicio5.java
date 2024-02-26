

public class ejercicio5 {

    //implemento un main donde se ejecutará el programa y se define el while del menu
    public static void main(String[] args) {
        int[][] lienzo = crearLienzo();
        int opcion = mostrarMenu();
        while (opcion != 4) {
            ejecutarAccion(lienzo, opcion);
            mostrarLienzo(lienzo);
            opcion = mostrarMenu();
        }
    }
//defino los métodos que se utilizarán en el main
    //defino el método para dibujar un caracter en el lienzo
    public static void dibujarCaracter(int[][] lienzo, int[] posicion, int caracter) {
        lienzo[posicion[0]][posicion[0]] = caracter;
    }
//defino el método para dibujar un rectángulo en el lienzo
    public static void dibujarRectangulo(int[][] lienzo, int[] esquina1, int[] esquina2, int caracter) {
        for (int i = esquina1[0]; i <= esquina2[0]; i++) {
            for (int j = esquina1[1]; j <= esquina2[1]; j++) {
                lienzo[i][j] = caracter;
            }
        }
    }
//cambiar el valor de una parte del lienzo por otro
    public static void cambiarColor(int[][] lienzo, int[] posicion, int nuevoCaracter) {
        lienzo[posicion[0]][posicion[1]] = nuevoCaracter;
    }
//definimos el lienzo
    public static int[][] crearLienzo() {
        System.out.println("Ingrese el número de filas: ");
        int filas = new java.util.Scanner(System.in).nextInt();
        System.out.println("Ingrese el número de columnas: ");
        int columnas = new java.util.Scanner(System.in).nextInt();
        return new int[filas][columnas];
    }
//valores impresos en el menu
    public static int mostrarMenu() {

        System.out.println("1. Dibujar carácter");
        System.out.println("2. Dibujar rectángulo");
        System.out.println("3. Cambiar color");
        System.out.println("4. Salir");

        return new java.util.Scanner(System.in).nextInt();
    }
//definir el switch para las opciones del menu
    public static void ejecutarAccion(int[][] lienzo, int opcion) {
        switch (opcion) {

            case 1://Dibujar carácter
                int[] posicion = new int[2];
                System.out.println("Ingrese la fila: ");
                posicion[0] = new java.util.Scanner(System.in).nextInt();
                System.out.println("Ingrese la columna: ");
                posicion[1] = new java.util.Scanner(System.in).nextInt();
                System.out.println("Ingrese el carácter: ");
                int caracter = new java.util.Scanner(System.in).nextInt();
                dibujarCaracter(lienzo, posicion, caracter);
                break;
            case 2://Dibujar rectángulo
                int[] esquina1 = new int[2];
                int[] esquina2 = new int[2];
                System.out.println("Ingrese la fila de la esquina 1: ");
                esquina1[0] = new java.util.Scanner(System.in).nextInt();
                System.out.println("Ingrese la columna de la esquina 1: ");
                esquina1[1] = new java.util.Scanner(System.in).nextInt();
                System.out.println("Ingrese la fila de la esquina 2: ");
                esquina2[0] = new java.util.Scanner(System.in).nextInt();
                System.out.println("Ingrese la columna de la esquina 2: ");
                esquina2[1] = new java.util.Scanner(System.in).nextInt();
                System.out.println("Ingrese el carácter: ");
                caracter = new java.util.Scanner(System.in).nextInt();
                dibujarRectangulo(lienzo, esquina1, esquina2, caracter);
                break;
            case 3://Cambiar color
                posicion = new int[2];
                System.out.println("Ingrese la fila: ");
                posicion[0] = new java.util.Scanner(System.in).nextInt();
                System.out.println("Ingrese la columna: ");
                posicion[1] = new java.util.Scanner(System.in).nextInt();
                System.out.println("Ingrese el nuevo carácter: ");
                caracter = new java.util.Scanner(System.in).nextInt();
                cambiarColor(lienzo, posicion, caracter);
                break;
        }
    }
//metodo para imprimir el lienzo en consola
    public static void mostrarLienzo(int[][] lienzo) {
        for (int i = 0; i < lienzo.length; i++) {
            for (int j = 0; j < lienzo[i].length; j++) {
                System.out.print(lienzo[i][j] + " ");
            }
            System.out.println();
        }
    }

}