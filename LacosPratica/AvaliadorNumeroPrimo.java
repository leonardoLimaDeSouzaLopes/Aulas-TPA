import java.util.Scanner;

public class AvaliadorNumeroPrimo {

	public static void main(String[] args) {

		//Cria os Objeto Scanner
		Scanner ler = new Scanner(System.in);
		
		//Le o valor do Numero e o Atribui a uma Variavel
		System.out.println("Insira o Numero que deseja saber se e Primo");
		int numero = ler.nextInt();
		
		//Looping para Verificar se o Numero tem Divisores diferentes de 1 e Ele Mesmo
		for (int i = 2; i < numero; i++) {
			
			//Verifica se o Numero é Divisivel por i
			if(numero % i == 0) {
				//Mostra que o numero nao e primo e encera o programa
				System.out.println("Seu numero não é Primo");
				ler.close();
				return;
			}
		}
		
		//Mostra que o numero e primo
		System.out.println("Seu numero é Primo");
		
		ler.close();
	}

}
