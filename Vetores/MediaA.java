import java.util.Scanner;

public class MediaA {

	public static void main(String[] args) {
		
		//Cria os Objeto Scanner
		Scanner ler = new Scanner(System.in);
		
		
		//Cria os Vetores com seu tamanho definido por uma constante
		int a[] = new int[10], somaA = 0;
		double media;
		
		
		//Le os 10 Numeros e os poe em A[]
		for (int i = 0; i < a.length; i++) {
			System.out.println("Diga o " + (i + 1) + "o Numero");
			a[i] = ler.nextInt();
		}
		
		
		//Soma os Numeros de A[]
		for (int i = 0; i < a.length; i++) {
			
			somaA += a[i];
		}
		
		
		//Calcula a Media
		media = ((double) somaA)/a.length;
		
		
		//Mostra a Media
		System.out.println(media);
		
		
		ler.close();
		
	}

}
