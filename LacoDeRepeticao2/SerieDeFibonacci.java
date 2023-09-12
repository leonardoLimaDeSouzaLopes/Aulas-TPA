import java.util.Scanner;

public class SerieDeFibonacci {

	public static void main(String[] args) {
		//iniciza o Scanner
		Scanner ler = new Scanner(System.in);
		
		int n, numeroAtual, penultimoNumero = 0, antepenultimoNumero = 1;
		String serie = "";
		
		//Leitura de n
		System.out.println("Diga até que Elemento da Serie de Fibonacci você quer");
		n = ler.nextInt();
		
		//Laco for para fazer a serie de fibonacci ate o numero antes do enesimo
		for (int i = 0 ; i < n-1; i++) {
			numeroAtual = (penultimoNumero + antepenultimoNumero);
			serie += numeroAtual + ", ";
			antepenultimoNumero = penultimoNumero;
			penultimoNumero = numeroAtual;
		}
		//Adciona o enesimo numero
		numeroAtual = (penultimoNumero + antepenultimoNumero);
		serie += numeroAtual;
		
		//Sysout para mostrar o Resultado
		System.out.println(serie);
		
		ler.close();
	}

}
