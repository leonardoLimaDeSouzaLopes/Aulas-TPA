import java.util.Scanner;

public class CrescenteDecrescente {

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

		// Ve o Maior Numero de A[] e poe em B[]
		b[b.length - 1] = a[0];
		for (int i = 0; i < a.length; i++) {
			if (b[b.length - 1] < a[i]) {
				b[b.length - 1] = a[i];
			}
		}

		// Ve o Menor Numero de A[] e poe em B[]
		b[0] = b[b.length - 1];
		for (int i = 0; i < a.length; i++) {
			if (b[0] > a[i]) {
				b[0] = a[i];
			}
		}

		// Coloca o Maior e o Menor Numero em C[]
		c[c.length - 1] = b[0];
		c[0] = b[b.length - 1];

		// Organiza o Vetor A[] em Ordem Cressente em B[], aproveita e Inverte para por
		// no C[] (que e Decrescente)
		for (int i = 1; i < c.length; i++) {
			b[i] = b[b.length - 1];
			for (int j = 0; j < c.length; j++) {
				if (b[i] > a[j] & b[i - 1] < a[j]) {
					b[i] = a[j];
				}
			}
			c[c.length - 1 - i] = b[i];
		}

		// Mostra B[]
		System.out.print("B = [");
		for (int i = 0; i < b.length - 1; i++) {
			System.out.print(b[i] + ", ");
		}
		System.out.print(b[b.length - 1] + "] ");

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
