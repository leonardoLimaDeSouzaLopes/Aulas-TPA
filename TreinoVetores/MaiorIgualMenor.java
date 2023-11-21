import java.util.Scanner;

public class MaiorIgualMenor {

	public static void main(String[] args) {

		// Cria os Objeto Scanner
		Scanner ler = new Scanner(System.in);

		// Cria os Vetores com seu Tamanho definido por uma Constante
		final int TAMANHO = 10;
		int a[] = new int[TAMANHO], b[] = new int[TAMANHO], c[] = new int[TAMANHO];

		// Le os Numeros e os poe em A[]
		System.out.println("Diga os numeros de A[]");
		for (int i = 0; i < a.length; i++) {
			System.out.println("Informe o " + (i + 1) + "o numero");
			a[i] = ler.nextInt();
		}

		// Le os Numeros e os poe em B[]
		System.out.println("Diga os numeros de B[]");
		for (int i = 0; i < b.length; i++) {
			System.out.println("Informe o " + (i + 1) + "o numero");
			b[i] = ler.nextInt();
		}

		// Verifica se A[i] e Maior, Igual ou Menor que B[i], e poe 1, 0, -1 de acordo
		// com isso
		for (int i = 0; i < c.length; i++) {
			if (a[i] > b[i]) {
				c[i] = 1;
			} else if (a[i] == b[i]) {
				c[i] = 0;
			} else {
				c[i] = -1;
			}
		}

		// Mostra C[]
		System.out.print("C = [");
		for (int i = 0; i < c.length - 1; i++) {
			System.out.print(c[i] + ", ");
		}
		System.out.print(c[c.length - 1] + "]");

		// Destroi o Objeto ler
		ler.close();

	}

}