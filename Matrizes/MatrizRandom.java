import java.util.Random;

public class MatrizRandom {

	public static void main(String[] args) {

		
		Random random = new Random();
		
		// Cria as Matrizes com seu Tamanho definido por uma Constante
		final int TAMANHO = 3;
		int a[][] = new int[TAMANHO][TAMANHO], maiorNumero[] = {-2147483648, 0, 0}, menorNumero[] = {2147483647, 0, 0};
		
		

		// Calcula os itens Randomicos da Matriz
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = random.nextInt();
				
				if(maiorNumero[0] < a[i][j]) {
					maiorNumero[0] = a[i][j];
					maiorNumero[1] = i+1;
					maiorNumero[2] = j+1;
				}
				
				if(menorNumero[0] > a[i][j]) {
					menorNumero[0] = a[i][j];
					menorNumero[1] = i+1;
					menorNumero[2] = j+1;
				}
			}
		}

		System.out.println("O Maior Numero e: " + maiorNumero[0] + " e ele esta na Linha " + maiorNumero[1] + " e na Coluna " + maiorNumero[2]);
		System.out.println("O Menor Numero e: " + menorNumero[0] + " e ele esta na Linha " + menorNumero[1] + " e na Coluna " + menorNumero[2]);
	}

}
