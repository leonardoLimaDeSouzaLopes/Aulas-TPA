import java.util.Scanner;

public class MaioresEMenoresDeIdade {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int idade, menorIdade = 0, maiorIdade = 0;
		int i = 1;

		while (i < 11) {

			System.out.println("Informe a Idade da " + i + "� Pessoa");
			idade = ler.nextInt();

			if (idade < 18) {
				menorIdade = menorIdade + 1;
			} else {
				maiorIdade = maiorIdade + 1;
			}

			i++;
		}

		System.out.println(maiorIdade + " S�o maiores de Idade e " + menorIdade + " S�o Menores de Idade");

		ler.close();
	}

}
