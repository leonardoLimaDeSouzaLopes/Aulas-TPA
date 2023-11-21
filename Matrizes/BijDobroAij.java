public class BijDobroAij {

	public static void main(String[] args) {

		// Cria as Matrizes com seu Tamanho definido por uma Constante
		final int TAMANHO = 4, a[][] = new int[TAMANHO][TAMANHO];

		// Define o Primeiro Item da Primeira Linha
		a[0][0] = 2;
		
		// Calcula os outros Itens da Primeira Linha
		for (int j = 1; j < a[0].length; j++) {
			a[0][j] = a[0][j - 1] * 2;
			System.out.print(a[0][j - 1] + " ");
		}
		
		// Mostra o Ultimo Item Item da Primeira Linha
		System.out.println(a[0][a[0].length - 1]);

		// Calcula e Mostra as Outras Linha da Matriz
		for (int i = 1; i < a.length; i++) {

			// Calcula o Primeiro Item da Linha i
			a[i][0] = a[i - 1][a[i].length - 1] * 2;

			// Calcula os outros Itens da Linha i
			for (int j = 1; j < a[i].length; j++) {
				a[i][j] = a[i][j - 1] * 2;
				//Mostras os Itens da Linha i
				System.out.print(a[i][j-1] + " ");
			}

			//Mostra o Ultimo Item Item da Linha i
			System.out.println(a[i][a[i].length - 1]);
		}
	}
}
