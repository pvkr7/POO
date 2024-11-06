package atividade2;

import java.util.Scanner;

public class atividade7 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Recebe a idade do usuário
	        System.out.print("Digite sua idade: ");
	        int idade = scanner.nextInt();

	        // Verifica se o usuário pode votar
	        if (idade >= 16) {
	            System.out.println("Você pode votar.");
	        } else {
	            System.out.println("Você não pode votar.");
	        }

	        // Fechando o scanner
	        scanner.close();
	    }
	}


