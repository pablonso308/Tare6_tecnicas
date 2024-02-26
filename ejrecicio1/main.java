

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("Ingrese el primer número: ");
        numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        numero2 = sc.nextInt();
        ejercicio1.mayorDeDos(numero1, numero2);
        ejercicio1.clasificarNumeros(numero1, numero2);

    }
}