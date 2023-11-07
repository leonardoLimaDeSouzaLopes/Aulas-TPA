import java.util.Scanner;

public class FatorialA {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		final int TAMANHO = 15;
		int a[] = new int[TAMANHO], b[] = new int[TAMANHO];

		// Le os 15 Numeros e os poe em A[], tambem calcula o B[]
		System.out.println("Diga os numeros de A[]");
		for (int i = 0; i < a.length; i++) {
			System.out.println("Informe o " + (i + 1) + "o numero");
			a[i] = ler.nextInt();
			b[i] = 1;
			for (int fator = 1; fator <= a[i]; fator++) {
				b[i] *= fator;
			}
		}

		// Mostra B[]
		System.out.print("B = [");
		for (int j = 0; j < b.length - 1; j++) {
			System.out.print(b[j] + ", ");
		}
		System.out.println(b[b.length - 1] + "]");

		// Destroi o Objeto ler
		ler.close();
	}

}
