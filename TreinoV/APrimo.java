import java.util.Scanner;

public class APrimo {

	public static void main(String[] args) {

		// Cria os Objeto Scanner
		Scanner ler = new Scanner(System.in);

		// Cria os Vetores com seu Tamanho definido por uma Constante
		final int TAMANHO = 5;
		int a[] = new int[TAMANHO];

		// Looping para Verificar se o Numero tem Divisores diferentes de 1 e Ele Mesmo
		for (int i = 0; i < a.length; i++) {
			for (int j = 2; j < a[i]; j++) {
				// Verifica se o Numero é Divisivel por i
				if(TemDivisor == true) {
					System.out.println("A[" + i + "] nao é primo");
				}
			}
		}
	}
	
	public boolean TemDivisor(int numero, int possivelDivisor) {
		if (numero % possivelDivisor == 0) {
			// Mostra que o numero nao é divisivel pelo divisor e encera a funcao
			return(false);
		}
		// Mostra que o numeroé divisivel pelo divisor e encera a funcao
		return(true);
	}

}
