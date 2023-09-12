import java.util.Scanner;

public class Tabuada {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int i = 1, n, r;
		
		System.out.println("Insira um n�mero para tabuada");
		n = ler.nextInt();
		
		while(i<=10) {
			
			r = n*i;
			
			System.out.println(n + "x" + i + "=" + r);
			
			i++;
		}
		
		ler.close();
	}
}
