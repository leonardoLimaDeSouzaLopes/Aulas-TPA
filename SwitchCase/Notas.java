import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		double mb, b, r, i, totalAl;
		
		double porc;

		System.out.println("Digite quantos alunos que estão com MB");
		mb = ler.nextInt();
		System.out.println("Digite quantos alunos que estão com B");
		b = ler.nextInt();
		System.out.println("Digite quantos alunos que estão com R");
		r = ler.nextInt();
		System.out.println("Digite quantos alunos que estão com I");
		i = ler.nextInt();
		
		totalAl = mb + b + r + i;
		
		System.out.println("O total de Alunos é: " + totalAl);
		System.out.println("De qual Menção você deseja a Porcentagem?");
		
		String resp = ler.next();

		switch (resp) { 
		
		case "MB":
			porc = (mb/totalAl)*100;
			
			System.out.println("A Porcentagem de alunos com MB é: " + porc + "%");
			
			break;
			
		case "B":
			porc = b/totalAl*100;
			
			System.out.println("A Porcentagem de alunos com B é: " + porc + "%");
			
			break;
			
		case "R":
			porc = r/totalAl*100;
			
			System.out.println("A Porcentagem de alunos com R é: " + porc + "%");
			
			break;
			
		case "I":
			porc = i/totalAl*100;
			
			System.out.println("A Porcentagem de alunos com I é: " + porc + "%");
			
			break;
			
		default:
			System.out.println("Essa mensão não existe.");
		
		}
		
		ler.close();
		
	}

}
