import java.util.Scanner;

public class Divisores {

	public static void main(String[] args) {

		// Cria os Objeto Scanner
		Scanner ler = new Scanner(System.in);

		// Cria o Vetor com seu Tamanho definido por uma Constante
		final int TAMANHO = 10;
		int a[] = new int[TAMANHO];

		// Le os Numeros e os poe em A[]
		System.out.println("Diga os numeros de A[]");
		for (int i = 0; i < a.length; i++) {
			System.out.println("Informe o " + (i + 1) + "o numero");
			a[i] = ler.nextInt();
		}

		// Calcula quantos Divisores A[i] tem e Mostra
		int divisores = 0;
		for (int i = 0; i < a.length; i++, divisores = 0) {
			for (int j = a[i]; j > 0; j--) {
				if (a[i] % j == 0) {
					divisores++;
				}
			}
			System.out.println("O numero de divisores do " + a[i] + " é: " + divisores);
		}

		// Destroi o Objeto ler
		ler.close();
	}

}
