import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero = 0, resultado = 1;
		
		System.out.println("Coloque um numero para calcular o fatorial");
		numero = ler.nextInt();
		
		while(numero > 0) {
			resultado *= numero;
			numero--;
		}
		
		System.out.println(resultado);
		ler.close();
	}
}
