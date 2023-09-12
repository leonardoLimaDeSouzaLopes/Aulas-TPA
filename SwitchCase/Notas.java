import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		double mb, b, r, i, totalAl;
		
		double porc;

		System.out.println("Digite quantos alunos que est�o com MB");
		mb = ler.nextInt();
		System.out.println("Digite quantos alunos que est�o com B");
		b = ler.nextInt();
		System.out.println("Digite quantos alunos que est�o com R");
		r = ler.nextInt();
		System.out.println("Digite quantos alunos que est�o com I");
		i = ler.nextInt();
		
		totalAl = mb + b + r + i;
		
		System.out.println("O total de Alunos �: " + totalAl);
		System.out.println("De qual Men��o voc� deseja a Porcentagem?");
		
		String resp = ler.next();

		switch (resp) { 
		
		case "MB":
			porc = (mb/totalAl)*100;
			
			System.out.println("A Porcentagem de alunos com MB �: " + porc + "%");
			
			break;
			
		case "B":
			porc = b/totalAl*100;
			
			System.out.println("A Porcentagem de alunos com B �: " + porc + "%");
			
			break;
			
		case "R":
			porc = r/totalAl*100;
			
			System.out.println("A Porcentagem de alunos com R �: " + porc + "%");
			
			break;
			
		case "I":
			porc = i/totalAl*100;
			
			System.out.println("A Porcentagem de alunos com I �: " + porc + "%");
			
			break;
			
		default:
			System.out.println("Essa mens�o n�o existe.");
		
		}
		
		ler.close();
		
	}

}
