public class PotenciaBase2 {

	public static void main(String[] args) {

		// Cria o Vetor com seu Tamanho definido por uma Constante
		final int TAMANHO = 11;
		int a[] = new int[TAMANHO];

		// Calcula o valor da Inesima posicao de A[]
		a[0] = (int) (2 * 1 / 2.0);
		for (int i = 1; i < a.length; i++) {
			a[i] = 2 * a[i - 1];
		}

		// Mostra A[]
		System.out.print("A = [");
		for (int i = 0; i < a.length - 1; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print(a[a.length - 1] + "]");

	}

}
