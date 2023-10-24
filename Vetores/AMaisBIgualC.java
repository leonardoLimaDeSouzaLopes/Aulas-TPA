import java.util.Scanner;

public class AMaisBIgualC {

	public static void main(String[] args) {
		
		//Cria os Objeto Scanner
		Scanner ler = new Scanner(System.in);
		

		//Cria os Vetores com seu tamanho definido por uma constante
		final int TAMANHO = 10;
		int a[] = new int[TAMANHO], b[] = new int[TAMANHO], c[] = new int[TAMANHO];
		

		//Le os 10 numeros e os poe em A[]
		System.out.println("Informe os 10 Numeros Inteiros de A");
		for (int i = 0; i < a.length; i++) {
			a[i] = ler.nextInt();
		}

		//Le os 10 numeros e os poe em A[], eleva eles ao quadrado para por em B[]
		System.out.println("Informe os 10 Numeros Inteiros de B");
		for (int i = 0; i < b.length; i++) {
			b[i] = ler.nextInt();
			c[i] = a[i] + b[i];
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

		// Escreve C[]
		System.out.print("C[] = [");
		for (int i = 0; i < c.length - 1; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println(c[c.length - 1] + "]");
		
		
		ler.close();
	}

}