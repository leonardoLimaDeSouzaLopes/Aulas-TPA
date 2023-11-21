import java.util.Scanner;

public class APrimo {

	public static void main(String[] args) {

		// Cria os Objeto Scanner
		Scanner ler = new Scanner(System.in);

		// Cria os Vetores com seu Tamanho definido por uma Constante
		final int TAMANHO = 10;
		int a[] = new int[TAMANHO];

		// Le os Numeros e os poe em A[]
		for (int i = 0; i < a.length; i++) {
			System.out.println("Informe o " + (i + 1) + "o numero");
			a[i] = ler.nextInt();
		}

		// Looping para Verificar se o Numero tem Divisores diferentes de 1 e Ele Mesmo
		for (int numero = 0; numero < a.length; numero++) {

			// Verifica se o Numero é Divisivel (obs: se colocasse numa funcao nao
			// prescisaria da boolean divisivel)
			boolean divisivel = false;
			for (int possivelDivisor = 2; possivelDivisor < a[numero]; possivelDivisor++) {
				if (a[numero] % possivelDivisor == 0) {
					divisivel = true;
					break;
				}
			}

			// Verifica se o Numero é Primo
			if (divisivel || a[numero] < 2)
				System.out.println("A[" + numero + "] = " + a[numero] + " e nao e primo");
			else {
				System.out.println("A[" + numero + "] = " + a[numero] + " e e primo");
			}

		}

		// Destroi o Objeto ler
		ler.close();
	}
}
