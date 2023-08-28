package Lista2;

import java.util.Scanner;

public class Questao6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Em que turno você estuda? Digite M (Matutino), V (Vespertino) ou N (Noturno): ");
        char turno = scanner.next().charAt(0);

        if (turno == 'M' || turno == 'm') {
            System.out.println("Bom Dia!");
        } else if (turno == 'V' || turno == 'v') {
            System.out.println("Boa Tarde!");
        } else if (turno == 'N' || turno == 'n') {
            System.out.println("Boa Noite!");
        } else {
            System.out.println("Valor Inválido!");
        }

        scanner.close();
    }
}

