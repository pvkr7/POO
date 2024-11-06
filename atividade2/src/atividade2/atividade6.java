package atividade2;

import java.util.Scanner;

public class atividade6 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe o preço original
        System.out.print("Digite o preço original: R$ ");
        double precoOriginal = scanner.nextDouble();

        // Recebe o percentual de desconto
        System.out.print("Digite o percentual de desconto (ex: 15 para 15%): ");
        double percentualDesconto = scanner.nextDouble();

        // Calcula o valor do desconto
        double valorDesconto = precoOriginal * (percentualDesconto / 100);

        // Calcula o preço final
        double precoFinal = precoOriginal - valorDesconto;

        // Exibe o resultado
        System.out.printf("O preço final após aplicar o desconto de %.2f%% é: R$ %.2f%n", percentualDesconto, precoFinal);

        // Fechando o scanner
        scanner.close();
    }
}


