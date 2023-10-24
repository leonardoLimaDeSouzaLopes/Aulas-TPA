import java.util.Scanner;

public class TabuadaA {

	public static void main(String[] args) {

		// Cria os Objeto Scanner
		Scanner ler = new Scanner(System.in);

		// Cria os Vetores com seu Tamanho definido por uma Constante
		final int TAMANHO = 5;
		int a[] = new int[TAMANHO];

		
		//Le os 5 Numeros e os poe em A[]
		for (int i = 0; i < a.length; i++) {
			System.out.println("Informe o " + (i + 1) + "o numero");
			a[i] = ler.nextInt();
		}

		//Calcula as Tabuadas e as Motra
		for (int i = 0; i < a.length; i++) {
			System.out.println("\nTabuada de " + a[i]);
			for (int fator = 1; fator <= 10; fator++) {
				System.out.println(a[i] + " x " + fator + " = " + (a[i] * fator));
			}
		}

		// Destroi o Objeto ler
		ler.close();
	}

}
