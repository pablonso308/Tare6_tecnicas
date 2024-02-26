

public class ejercicio1 {



    public static void mayorDeDos(int numero1, int numero2) {
        if (numero1 > numero2) {
            System.out.println("El mayor es: " + numero1);
        } else {
            System.out.println("El mayor es: " + numero2);
        }
    }

    public static void clasificarNumeros(int numero1, int numero2) {
        if (numero1 == numero2) {
            System.out.println("La clasificación es: 0");
        } else if (numero1 > numero2) {
            System.out.println("La clasificación es: 1");
        } else {
            System.out.println("La clasificación es: -1");
        }
    }
}


//número1 = obtenerNúmero("Ingrese el primer número: ")
//número2 = obtenerNúmero("Ingrese el segundo número: ")
//mayor = mayorDeDos(número1, número2)
//clasificación = clasificarNúmeros(número1, número2)
//imprimir("El mayor es: ", mayor, " y la clasificación es: ", clasificación)