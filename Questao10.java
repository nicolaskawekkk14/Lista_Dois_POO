package Lista2;

import java.util.Scanner;

public class Questao10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro de 1 a 10 para gerar a tabuada: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 10) {
            System.out.println("Tabuada de " + numero + ":");

            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " X " + i + " = " + resultado);
            }
        } else {
            System.out.println("Número inválido. Digite um número de 1 a 10.");
        }

        scanner.close();
    }
}

