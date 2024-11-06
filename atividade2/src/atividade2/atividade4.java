package atividade2;

import java.util.Scanner;

public class atividade4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe a primeira idade
        System.out.print("Digite a primeira idade: ");
        int idade1 = scanner.nextInt();

        // Recebe a segunda idade
        System.out.print("Digite a segunda idade: ");
        int idade2 = scanner.nextInt();

        // Comparação das idades
        if (idade1 > idade2) {
            System.out.println("A primeira idade (" + idade1 + ") é maior que a segunda idade (" + idade2 + ").");
        } else if (idade1 < idade2) {
            System.out.println("A segunda idade (" + idade2 + ") é maior que a primeira idade (" + idade1 + ").");
        } else {
            System.out.println("As idades são iguais.");
        }

        // Fechando o scanner
        scanner.close();
    }
}


