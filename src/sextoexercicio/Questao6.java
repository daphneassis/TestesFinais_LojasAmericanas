package sextoexercicio;

import java.util.Arrays;
import java.util.Collections;

public class Questao6 {

	public static void main(String[] args) {
		String[] vetorNomes = {"a", "c", "b", "j", "m", "k"};
		System.out.println(Arrays.toString(vetorNomes));
		
		Arrays.sort(vetorNomes, Collections.reverseOrder());
		System.out.println(Arrays.toString(vetorNomes));
	}

}
