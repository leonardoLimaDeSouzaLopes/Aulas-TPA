import java.util.Scanner;

public class Intercecao {

	public static void main(String[] args) {

		// Cria os Objeto Scanner
		Scanner ler = new Scanner(System.in);

		// Cria os Vetores com seu Tamanho definido por uma Constante
		final int TAMANHO = 10;
		int a[] = new int[TAMANHO];
		int b[] = new int[TAMANHO];

		// Le os 10 Numeros e os poe em A[]
		System.out.println("Diga os numeros de A[]");
		for (int i = 0; i < a.length; i++) {
			System.out.println("Informe o " + (i + 1) + "o numero");
			a[i] = ler.nextInt();
		}

		// Le os 10 Numeros e os poe em B[]
		System.out.println("Diga os numeros de B[]");
		for (int i = 0; i < b.length; i++) {
			System.out.println("Informe o " + (i + 1) + "o numero");
			b[i] = ler.nextInt();
		}

		// Coloca os Numeros que sao da Intersseccao em A[]
		int i = 0;
		for (int j = 0; j < b.length; j++) {
			for (int k = 0; k < b.length; k++) {
				if (a[j] == b[k]) {
					a[i] = a[j];
					i++;
					break;
				}
			}
		}
		
		// Cria o Vetor C[]
		int c[] = new int[i];
		
		// Coloca os Numeros da Intersseccao em C[]
		while(i>0) {
			i--;
			c[i] = a[i];
		}
		
		// Mostra C[]
		System.out.print("C = [");
		for (int j = 0; j < c.length - 1; j++) {
			System.out.print(c[j] + ", ");
		}
		System.out.println(c[c.length - 1] + "]");
		
		// Destroi o Objeto ler
		ler.close();
	}
}
