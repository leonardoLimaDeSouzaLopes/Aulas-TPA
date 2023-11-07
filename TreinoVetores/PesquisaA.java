import java.util.Scanner;

public class PesquisaA {

	public static void main(String[] args) {

		// Cria os Objeto Scanner
		Scanner ler = new Scanner(System.in);

		// Cria o Vetor com seu Tamanho definido por uma Constante
		final int TAMANHO = 10;
		int x, a[] = new int[TAMANHO];

		// Le os 10 Numeros e os poe em A[]
		System.out.println("Diga os numeros de A[]");
		for (int i = 0; i < a.length; i++) {
			System.out.println("Informe o " + (i + 1) + "o numero");
			a[i] = ler.nextInt();
		}

		pesquisa: do {
			// Le o Input
			System.out.println("\nEscreva um Numero para pesquisar");
			x = ler.nextInt();

			// Pesquisa pelo Numero
			boolean encontrado = false;
			for (int i = 0; i < a.length; i++) {
				if (x == a[i]) {
					System.out.println("O Numero esta no indice " + i);
					encontrado = true;
				}
			}
			if (encontrado == false) {
				System.out.println("O Numero nao esta no Vetor");
			}

			System.out.println("\nGostaria de Pesquisar outro Numero? (S/N)");

			do {
				String resposta = ler.next();
				if(resposta.equalsIgnoreCase("s")) {
					break;
				} else if (resposta.equalsIgnoreCase("n")) {
					break pesquisa;
				} else {
					System.out.println(("(S/N)"));
				}
			} while (true);

		} while (true);

		ler.close();
	}
}
