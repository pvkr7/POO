package atividade2;

import java.util.Scanner;

public class atividade2 {
	public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para digitar o primeiro número
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        // Solicita ao usuário para digitar o segundo número
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Solicita ao usuário para digitar o terceiro número
        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        // Calcula a média aritmética
        double media = (numero1 + numero2 + numero3) / 3;

        // Exibe o resultado da média
        System.out.println("A média aritmética dos três números é: " + media);

        // Fecha o scanner
        scanner.close();
    }
}


