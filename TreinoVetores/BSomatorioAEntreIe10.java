import java.util.Scanner;

public class BSomatorioAEntreIe10 {

	public static void main(String[] args) {

		// Cria os Objeto Scanner
		Scanner ler = new Scanner(System.in);

		// Cria os Vetores com seu Tamanho definido por uma Constante
		final int TAMANHO = 10;
		double a[] = new double[TAMANHO], b[] = new double[TAMANHO];

		// Le os 10 Numeros e os poe em A[]
		System.out.println("Diga os numeros de A[]");
		for (int i = 0; i < a.length; i++) {
			System.out.println("Informe o " + (i + 1) + "o numero");
			a[i] = ler.nextInt();
		}

		// Calcula o somatorio de B[]
		for (int i = 0; i < b.length; i++) {
			for (int j = i; j < b.length; j++) {
				b[i] += a[j];
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