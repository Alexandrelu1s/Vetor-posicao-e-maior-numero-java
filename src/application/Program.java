package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		Double[] vetor = new Double[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		Double maior = vetor[0];
		int pos = 0;
		
		for(int i = 1; i < vetor.length; i++) {
			if(vetor[i] > maior) {
				maior = vetor[i];
				pos = i;
			}
		}
		
		System.out.println("Maior valor: " + maior + "\nPosição: " + pos);
		
		sc.close();
	}

}
