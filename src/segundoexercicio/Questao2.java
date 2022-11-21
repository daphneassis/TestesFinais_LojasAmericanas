package segundoexercicio;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de entrada:");
		int linhas = sc.nextInt();
		int limiteCopa = 1;

		while (limiteCopa <= 2) {
			for (int i = 1; i <= linhas; i++) {

				for (int j = linhas; j >= i; j--) {
					System.out.print(" ");
				}

				for (int j = 1; j <= i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			limiteCopa++;
		}
		 for(int i = 1;i <= linhas-1;i++){
		      System.out.print(" ");
		      
		      for(int j = linhas-2;j > 0;j--){
		        System.out.print(" ");
		      }
		      for(int z = 2;z > 0;z--){
		        System.out.print("| ");
		      }
		      System.out.println();
		    }
		
}
}