package quintoexercicio;

import java.util.Arrays;

public class Questao5 {

	public static void main(String[] args) {
		
		String[] vetorNomes = {"a", "c", "b", "j", "m", "k"};
		System.out.println(Arrays.toString(vetorNomes));
		
		Arrays.sort(vetorNomes);
		System.out.println(Arrays.toString(vetorNomes));
	}
}
