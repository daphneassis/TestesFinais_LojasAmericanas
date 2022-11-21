package primeiroexercicio;

import java.util.Scanner;

public class Questao1ComFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um valor de entrada: ");
		int n= sc.nextInt();
		int num1=1;
		int num2=0;
		System.out.println(" ");
		System.out.printf("Série de Fibonacci até %d termos:\n", n);
		System.out.print(num2+", ");
		System.out.print(num1+", ");
		
	for(int i=0;i<n-2;i++) {
		num1= num1+num2;
		num2= num1-num2;
		System.out.print(num1+", ");

}
	}
}
