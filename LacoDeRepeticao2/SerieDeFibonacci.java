import java.util.Scanner;

public class SerieDeFibonacci {

	public static void main(String[] args) {
		//inicializa o Scanner
		Scanner ler = new Scanner(System.in);
		
		int n, numeroAtual = 1, ultimoNumero = 0, penultimoNumero = 0;
		String serie = "";
		
		//Leitura de n
		System.out.println("Diga até que Elemento da Serie de Fibonacci você quer");
		n = ler.nextInt();
		
		//Laco for para fazer a serie de fibonacci ate o numero antes do enesimo
		for (int i = 0 ; i < n-1; i++) {
			serie += numeroAtual + ", ";
			penultimoNumero = ultimoNumero;
			ultimoNumero = numeroAtual;
			numeroAtual = ultimoNumero + penultimoNumero;
			
		}
		//Adciona o enesimo numero
		serie += numeroAtual;
		
		//Sysout para mostrar o Resultado
		System.out.println(serie);
		
		ler.close();
	}

}