package atividade2;

import java.util.Scanner;

public class atividade9 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Recebe a idade da primeira pessoa
	        System.out.print("Digite a idade da primeira pessoa: ");
	        int idade1 = scanner.nextInt();

	        // Recebe a idade da segunda pessoa
	        System.out.print("Digite a idade da segunda pessoa: ");
	        int idade2 = scanner.nextInt();

	        // Verifica se ambas as pessoas são maiores de idade
	        if (idade1 >= 18 && idade2 >= 18) {
	            System.out.println("Ambas as pessoas são maiores de idade.");
	        } else {
	            System.out.println("Pelo menos uma das pessoas não é maior de idade.");
	        }

	        // Fechando o scanner
	        scanner.close();
	    }
	}


