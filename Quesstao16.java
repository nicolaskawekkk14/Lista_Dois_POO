package Lista2;

import java.util.Scanner;

public class Quesstao16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        double soma = calcularSoma(numero1, numero2, numero3);

        System.out.println("A soma dos três números é: " + soma);

        scanner.close();
    }

    public static double calcularSoma(double a, double b, double c) {
        return a + b + c;
    }
}
