package Lista2;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        int maior;

        if (numero1 > numero2) {
            maior = numero1;
        } else {
            maior = numero2;
        }

        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
}
