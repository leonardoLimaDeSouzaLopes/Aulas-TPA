import java.util.Scanner;

public class EscolaFutebol {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int idadeAl;

		System.out.println("Coloque a idade do aluno");
		idadeAl = ler.nextInt();

		switch (idadeAl) {
		case 6:
			System.out.println("O aluno é um dente de leite");
			break;

		case 7:
			System.out.println("O aluno é um júnior");
			break;

		case 8:
			System.out.println("O aluno é um júnior max");
			break;

		case 9:
			System.out.println("O aluno é um júnior master");
			break;

		case 10:
			System.out.println("O aluno é um master");
			break;

		default:
			System.out.println("A escola não admite alunos com essa idade.");

		}
		
		ler.close();
	}
}
