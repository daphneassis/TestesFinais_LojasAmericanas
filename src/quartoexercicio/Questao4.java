package quartoexercicio;

public class Questao4 {

	public static void main(String[] args) {

		int[] vetor = {2,4,6,8,10,12};
		int soma=0;
		int numElementos=0;
		double media;
		
		for  (int i=0;i<vetor.length;i++) {
			soma= soma+vetor[i];
			numElementos++;	
		}
		 media=soma/numElementos;

		System.out.println("Soma: "+ soma);
		System.out.printf("Media:%.1f ", media);

	}
	
}
