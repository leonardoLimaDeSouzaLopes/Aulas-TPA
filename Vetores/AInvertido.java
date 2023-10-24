import java.util.Scanner;

public class AInvertido {

	public static void main(String[] args) {

		//Cria os Objeto Scanner
		Scanner ler = new Scanner(System.in);

		
		//Cria os Vetores com seu tamanho definido por uma constante
		final int TAMANHO = 5;
		int a[] = new int[TAMANHO], b[] = new int[TAMANHO];

		
		//Le os 10 numeros e os poe em A[]
		for (int i = 0; i < a.length; i++) {
			System.out.println("Diga o " + (i + 1) + "o Numero");
			a[i] = ler.nextInt();
		}

		
		//Coloca os Numeros de A em B, indo do ultimo numero do a ao primeiro
		for (int i = 0; i < a.length; i++) {
			b[i] = a[a.length - 1 - i];
		}

		
		// Escreve A[]
		System.out.print("A[] = [");
		for (int i = 0; i < a.length - 1; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(a[a.length - 1] + "]");

		// Escreve B[]
		System.out.print("B[] = [");
		for (int i = 0; i < b.length - 1; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println(b[b.length - 1] + "]");
		
		
		ler.close();

	}

}
