import java.util.Scanner;

public class RelacaoPares {

	public static void main(String[] args) {

		// Cria os Objeto Scanner
		Scanner ler = new Scanner(System.in);

		// Cria o Vetore com seu Tamanho definido por uma Constante
		final int TAMANHO = 11;
		int a[] = new int[TAMANHO];

		// Le os Numeros e os poe em A[]
		for (int i = 0; i < a.length; i++) {
			System.out.println("Informe o " + (i + 1) + "o numero");
			a[i] = ler.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			// Mostra A[i]
			System.out.print(a[i] + ": ");

			// Mostra a relacao de todos os pares entre 0 e A[i]
			for (int j = 0; j < a[i] - 1; j += 2) {
				System.out.print("P(" + j / 2 + ") = " + j + ", ");
			}
			System.out.println("P(" + ((int) a[i] / 2) + ") = " + ((int) a[i] / 2) * 2);
		}

		// Destroi o Objeto ler
		ler.close();
	}

}
