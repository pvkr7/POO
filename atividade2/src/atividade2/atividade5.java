package atividade2;

import java.util.Scanner;

public class atividade5 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Recebe um número do usuário
	        System.out.print("Digite um número: ");
	        int numero = scanner.nextInt();

	        // Verifica se o número está entre 10 e 20, inclusive
	        if (numero >= 10 && numero <= 20) {
	            System.out.println("O número " + numero + " está dentro do intervalo de 10 a 20.");
	        } else {
	            System.out.println("O número " + numero + " está fora do intervalo de 10 a 20.");
	        }

	        // Fechando o scanner
	        scanner.close();
	    }
	}


