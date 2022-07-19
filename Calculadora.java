package com.dio;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			int a, b;
			
			System.out.print("Digite o primeiro valor: ");
			a = scan.nextInt();
			System.out.print("Digite o segundo valor: ");
			b = scan.nextInt();
			
			int soma = soma(a,b);
			int subtracao = subtracao(a,b);
			int multiplicacao = multiplicacao(a,b);
			int divisao = divisao(a,b);
			
			System.out.print(" soma = " + soma);
			System.out.print(" sub = " + subtracao);
			System.out.print(" multi = " + multiplicacao);
			System.out.print(" div = " + divisao);
		}
	} 

	public static int soma (int a, int b) {
		return a + b;
	}

	public static int subtracao (int a, int b) {
			return a - b;
	}

	public static int multiplicacao (int a, int b) {
			return a * b;
	}

	public static int divisao (int a, int b) {
			return a / b;
		}




}
