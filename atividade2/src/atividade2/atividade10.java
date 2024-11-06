package atividade2;

import java.util.Scanner;

public class atividade10 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o primeiro número
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        // Solicita ao usuário o segundo número
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Solicita ao usuário o operador
        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        double resultado;

        // Realiza a operação com base no operador fornecido
        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                // Verifica se o segundo número é diferente de zero para evitar divisão por zero
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operador inválido. Por favor, use +, -, * ou /.");
                break;
        }

        // Fechando o scanner
        scanner.close();
    }
}


