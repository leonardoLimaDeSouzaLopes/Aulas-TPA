import java.util.Scanner;

public class MediaNumerosEntre13E73 {

	public static void main(String[] args) {
		
		//Cria os Objetos
		Scanner ler = new Scanner(System.in);
		
		//Cria as Variaveis
		int primeiroNumero, segundoNumero;
		
		//Le o Primeiro Numero
		System.out.println("Insira um Numero entre 13 e 73");
		primeiroNumero = ler.nextInt();
		while (!(primeiroNumero >= 13 && primeiroNumero <= 73)) {
			System.out.println("Desculpe,");
			System.out.println("Mas o Numero Inserido Não esta entre 13 e 73");
			System.out.println("Por favor, Insira Outro Numero");
			primeiroNumero = ler.nextInt();
		}
		
		//Le o Segundo Numero
		System.out.println("Ok, agora Insira Outro Numero entre 13 e 73");
		segundoNumero = ler.nextInt();
		while (!(segundoNumero >= 13 && segundoNumero <= 73)) {
			System.out.println("Desculpe,");
			System.out.println("Mas o Numero Inserido Não esta entre 13 e 73");
			System.out.println("Por favor, Insira Outro Numero");
			segundoNumero = ler.nextInt();
		}
		
		//Calcula e Mostra a Media entre os Numeros
		System.out.println("A Media Aritmetica dos Numeros Inseridos é: " + (primeiroNumero+segundoNumero)/2.00);
		
		ler.close();
	}

}
