import java.util.Scanner;

public class SignosDoZodiaco {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int dia, mes;

		System.out.println("Digite o Dia que você nasceu");
		dia = ler.nextInt();
		System.out.println("Digite o Mês que você nasceu");
		mes = ler.nextInt();

		switch (mes) {
		case 1:

			if (dia > 0 && dia < 32) {

				if (dia < 21) {
					System.out.println("Seu Signo do Zodíaco é Capricórnio");
				} else {
					System.out.println("Seu Signo do Zodíaco é Aquário");
				}

			} else {
				System.out.println("A data está inválido");
			}

			break;

		case 2:

			if (dia > 0 && dia < 30) {
				if (dia < 20) {
					System.out.println("Seu Signo do Zodíaco é Aquário");
				} else {
					System.out.println("Seu Signo do Zodíaco é Peixes");
				}

			} else {
				System.out.println("A data está inválido");
			}

			break;

		case 3:

			if (dia > 0 && dia < 32) {

				if (dia < 21) {
					System.out.println("Seu Signo do Zodíaco é Peixes");
				} else {
					System.out.println("Seu Signo do Zodíaco é Áries");
				}

			} else {
				System.out.println("A data está inválido");
			}

			break;

		case 4:

			if (dia > 0 && dia < 31) {

				if (dia < 21) {
					System.out.println("Seu Signo do Zodíaco é Áries");
				} else {
					System.out.println("Seu Signo do Zodíaco é Touro");
				}

			} else {
				System.out.println("A data está inválido");
			}
			
			break;
			
		case 5:
			
			if (dia > 0 && dia < 32) {
				
				if (dia < 21) {
					System.out.println("Seu Signo do Zodíaco é Touro");
				} else {
					System.out.println("Seu Signo do Zodíaco é Gêmeos");
				}
			
			} else {
				System.out.println("A data está inválido");
			}
			
			break;
			
		case 6:
			
			if (dia > 0 && dia < 31) {
				
				if (dia < 21) {
					System.out.println("Seu Signo do Zodíaco é Gêmeos");
				} else if (dia < 32) {
					System.out.println("Seu Signo do Zodíaco é Câncer");
				}
			
			} else {
			System.out.println("A data está inválido");
			}
		
			break;
			
		case 7:
			
			if (dia > 0 && dia < 32) {
			
				if (dia < 23) {
					System.out.println("Seu Signo do Zodíaco é Câncer");
				} else {
					System.out.println("Seu Signo do Zodíaco é Leão");
				}
			
			} else {
				System.out.println("A data está inválido");
			}
			
			break;
			
		case 8:
			
			if (dia > 0 && dia < 32) {
				
				if (dia < 23) {
					System.out.println("Seu Signo do Zodíaco é Leão");
				} else {
					System.out.println("Seu Signo do Zodíaco é Virgem");
				}
				
			} else {
				System.out.println("A data está inválido");
			}
			
			break;
			
		case 9:
			
			if (dia > 0 && dia < 31) {
				
			if (dia < 23) {
				System.out.println("Seu Signo do Zodíaco é Virgem");
			} else if (dia < 32) {
				System.out.println("Seu Signo do Zodíaco é Libra");
			}
			
			} else {
				System.out.println("A data está inválido");
			}
			
			break;
			
		case 10:
			
			if (dia > 0 && dia < 32) {
			
			if (dia < 23) {
				System.out.println("Seu Signo do Zodíaco é Libra");
			} else {
				System.out.println("Seu Signo do Zodíaco é Escorpião");
			}
				
			} else {
				System.out.println("A data está inválido");
			}
			
			break;
			
		case 11:
			
			if (dia > 0 && dia < 31) {
				
			if (dia < 22) {
				System.out.println("Seu Signo do Zodíaco é Escorpião");
			} else {
				System.out.println("Seu Signo do Zodíaco é Sagitário");
			}
			
			} else {
				System.out.println("A data está inválido");
			}
			
			break;
			
		case 12:
			
			if (dia > 0 && dia < 32) {
			
			if (dia < 22) {
				System.out.println("Seu Signo do Zodíaco é Sagitário");
			} else {
				System.out.println("Seu Signo do Zodíaco é Capricórnio");
			}
				
			} else {
				System.out.println("A data está inválido");
			}
			
			break;
			
		default:
			System.out.println("A data está inválido");
			break;
		}

		ler.close();
	}

}
