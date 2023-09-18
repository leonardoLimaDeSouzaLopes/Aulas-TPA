import java.util.Scanner;

public class Potencializacao {

	public static void main(String[] args) {
		//inicializa o Scanner
		Scanner ler = new Scanner(System.in);
		
		int base, expoente = 0, resultado = 1;
		
		//Leitura dos valores
		System.out.println("Informe a Base");
		base = ler.nextInt();
		System.out.println("Informe um Expoente Positivo");
		expoente = ler.nextInt();
		
		//For para fazer a potencializacao
		for (int i = expoente; i > 0; i--) {
			resultado *= base;
		}
		
		//Sysout para mostrar o Resultado
		System.out.println((int) base + " elevado a " + expoente + " e igual a " + (int) resultado);
		
		ler.close();
	}

}
