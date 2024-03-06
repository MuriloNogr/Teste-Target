package br.com.target.teste02;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Verificador Fibonacci");
		System.out.println("---------------------------");
		System.out.println("Qual número deseja verificar: ");
		
		int n1 = sc.nextInt();
		
		sc.close();
		
		verificador(n1);
		retorno(n1);
		
	}
	public static boolean verificador(int n1) {
		int f1 = 0;
		int f2 = 1;
		
		while (f1 <= n1) {
			if (f1 == n1) {
				return true;
			} 
			int prox = f1 + f2;
			f1 = f2;
			f2 = prox;
			
		}
		
		return false;
		
	}
	
	public static void retorno(int n1) {
		if (verificador(n1) == true) {
			System.out.println(n1 + " pertence a sequencia de Fibonacci");
		} else {
			System.out.println(n1 + " não pertence a sequencia de Fibonacci");
			
		}
	}

}
