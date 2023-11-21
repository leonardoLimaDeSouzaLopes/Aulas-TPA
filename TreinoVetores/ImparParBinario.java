import java.util.Scanner;

public class ImparParBinario {

	public static void main(String[] args) {

		// Cria os Objeto Scanner
		Scanner ler = new Scanner(System.in);

		// Cria os Vetores com seu Tamanho definido por uma Constante
		final int TAMANHO = 10;
		int a[] = new int[TAMANHO], b[] = new int[TAMANHO];

		// Le os Numeros e os poe em A[]
		System.out.println("Diga os numeros de A[]");
		for (int i = 0; i < a.length; i++) {
			System.out.println("Informe o " + (i + 1) + "o numero");
			a[i] = ler.nextInt();
		}

		// Verifica se o Mumero e Impar ou Par, e coloca 0 e 1 no C[] de acordo com isso
		for (int i = 0; i < b.length; i++) {
			if (a[i] % 2 == 0) {
				b[i] = 1;
			} else {
				b[i] = 0;
			}
		}

		// Mostra B[]
		System.out.print("B = [");
		for (int i = 0; i < b.length - 1; i++) {
			System.out.print(b[i] + ", ");
		}
		System.out.print(b[b.length - 1] + "]");

		// Destroi o Objeto ler
		ler.close();

	}

}
