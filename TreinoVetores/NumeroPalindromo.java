import java.util.Scanner;

public class NumeroPalindromo {

	public static void main(String[] args) {

		// Cria os Objeto Scanner
		Scanner ler = new Scanner(System.in);

		// Cria os Vetores com seu Tamanho definido por uma Constante
		final char TAMANHO = 10;
		int a[] = new int[TAMANHO], aReflexo[] = new int[TAMANHO];

		// Le os Numeros e os poe em A[]
		System.out.println("Diga os numeros de A[]");
		for (int i = 0; i < a.length; i++) {
			System.out.println("Informe o " + (i + 1) + "o numero");
			a[i] = ler.nextInt();
		}

		// Verifica se o A fica igual quando refletido
		for (int i = 0; i < aReflexo.length; i++) {
			aReflexo[i] = a[a.length - 1 - i];
			// Se nao for igual entao Mostra que nao e Palindromo e Encerra o codigo
			if (aReflexo[i] != a[i]) {
				System.out.println("A nao e Palindromo");
				// Destroi o Objeto ler
				ler.close();
				return;
			}
		}

		// Mostra que A e Palindromo
		System.out.println("A e Palindromo");

		// Destroi o Objeto ler
		ler.close();
	}

}
