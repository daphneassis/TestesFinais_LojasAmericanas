package primeiroexercicio;

import java.util.Scanner;

public class Questao1ComWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um valor de entrada: ");
		int n= sc.nextInt();
		
		System.out.println(" ");
		System.out.printf("Série de Fibonacci até %d termos:\n", n);
		proximoNumFibonacci(n);
				
	}
	static void proximoNumFibonacci(int n) {
		int num1=0;
		int num2=1;
		int contador=0;
		
		while (contador<n) {
			System.out.print(num1+", ");
		int num3= num1+num2;
		num1= num2;
		num2= num3;
		contador= contador+1;
		}
		
		
	}
}
