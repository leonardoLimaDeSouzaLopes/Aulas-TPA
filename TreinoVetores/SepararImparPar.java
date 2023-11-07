import java.util.Scanner;

public class SepararImparPar {

	public static void main(String[] args) {

		//Cria os Objeto Scanner
		Scanner ler = new Scanner(System.in);

		//Cria os Vetores com seu Tamanho definido por uma Constante
		final int TAMANHO = 20;
		int a[] = new int[TAMANHO], b[] = new int[TAMANHO];
		
		//Cria um indice para o B[] e a posicao onde vao Parar os Pares para comecar os Impares
		int bIndice = 0, bParFim;

		//Le os 20 Numeros e os poe em A[], se eles forem pares poe em B[]
		for (int i = 0; i < a.length; i++) {

			System.out.println("Informe o " + (i + 1) + "o numero");

			//Ve se o numero e Par
			a[i] = ler.nextInt();
			if (a[i] % 2 == 0) {
				b[bIndice] = a[i];
				bIndice++;
			}
			
		}

		//Define o Ponto onde Param os Pares para comecam os Impares
		bParFim = bIndice;

		//Adiciona os Impares a B[]
		for (int i = 0; i < b.length; i++) {
			//Ve se o numero e Impar
			if (a[i] % 2 == 1) {
				b[bIndice] = a[i];
				bIndice++;
			}
		}

		//Mostra os Numeros Pares
		System.out.print("Numeros Pares: ");
		for (int i = 0; i < bParFim - 1; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.print(b[bParFim - 1]);

		//Mostra os Numeros Impares
		System.out.print("\nNumeros Impares: ");
		for (int i = bParFim; i < b.length - 1; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.print(b[b.length - 1]);

		//Destroi o Objeto ler
		ler.close();
		
	}

}
