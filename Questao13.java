package Lista2;

import java.util.Scanner;

public class Questao13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int n = scanner.nextInt();

        double h = calcularH(n);

        System.out.println("O valor de H com " + n + " termos é: " + h);

        scanner.close();
    }

    public static double calcularH(int n) {
        double h = 0;
        for (int i = 1; i <= n; i++) {
            h += 1.0 / i;
        }
        return h;
    }
}

