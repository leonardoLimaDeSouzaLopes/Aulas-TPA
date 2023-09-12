import java.util.Scanner;

public class SignosDoZodiaco {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int dia, mes;

		System.out.println("Digite o Dia que voc� nasceu");
		dia = ler.nextInt();
		System.out.println("Digite o M�s que voc� nasceu");
		mes = ler.nextInt();

		switch (mes) {
		case 1:

			if (dia > 0 && dia < 32) {

				if (dia < 21) {
					System.out.println("Seu Signo do Zod�aco � Capric�rnio");
				} else {
					System.out.println("Seu Signo do Zod�aco � Aqu�rio");
				}

			} else {
				System.out.println("A data est� inv�lido");
			}

			break;

		case 2:

			if (dia > 0 && dia < 30) {
				if (dia < 20) {
					System.out.println("Seu Signo do Zod�aco � Aqu�rio");
				} else {
					System.out.println("Seu Signo do Zod�aco � Peixes");
				}

			} else {
				System.out.println("A data est� inv�lido");
			}

			break;

		case 3:

			if (dia > 0 && dia < 32) {

				if (dia < 21) {
					System.out.println("Seu Signo do Zod�aco � Peixes");
				} else {
					System.out.println("Seu Signo do Zod�aco � �ries");
				}

			} else {
				System.out.println("A data est� inv�lido");
			}

			break;

		case 4:

			if (dia > 0 && dia < 31) {

				if (dia < 21) {
					System.out.println("Seu Signo do Zod�aco � �ries");
				} else {
					System.out.println("Seu Signo do Zod�aco � Touro");
				}

			} else {
				System.out.println("A data est� inv�lido");
			}
			
			break;
			
		case 5:
			
			if (dia > 0 && dia < 32) {
				
				if (dia < 21) {
					System.out.println("Seu Signo do Zod�aco � Touro");
				} else {
					System.out.println("Seu Signo do Zod�aco � G�meos");
				}
			
			} else {
				System.out.println("A data est� inv�lido");
			}
			
			break;
			
		case 6:
			
			if (dia > 0 && dia < 31) {
				
				if (dia < 21) {
					System.out.println("Seu Signo do Zod�aco � G�meos");
				} else if (dia < 32) {
					System.out.println("Seu Signo do Zod�aco � C�ncer");
				}
			
			} else {
			System.out.println("A data est� inv�lido");
			}
		
			break;
			
		case 7:
			
			if (dia > 0 && dia < 32) {
			
				if (dia < 23) {
					System.out.println("Seu Signo do Zod�aco � C�ncer");
				} else {
					System.out.println("Seu Signo do Zod�aco � Le�o");
				}
			
			} else {
				System.out.println("A data est� inv�lido");
			}
			
			break;
			
		case 8:
			
			if (dia > 0 && dia < 32) {
				
				if (dia < 23) {
					System.out.println("Seu Signo do Zod�aco � Le�o");
				} else {
					System.out.println("Seu Signo do Zod�aco � Virgem");
				}
				
			} else {
				System.out.println("A data est� inv�lido");
			}
			
			break;
			
		case 9:
			
			if (dia > 0 && dia < 31) {
				
			if (dia < 23) {
				System.out.println("Seu Signo do Zod�aco � Virgem");
			} else if (dia < 32) {
				System.out.println("Seu Signo do Zod�aco � Libra");
			}
			
			} else {
				System.out.println("A data est� inv�lido");
			}
			
			break;
			
		case 10:
			
			if (dia > 0 && dia < 32) {
			
			if (dia < 23) {
				System.out.println("Seu Signo do Zod�aco � Libra");
			} else {
				System.out.println("Seu Signo do Zod�aco � Escorpi�o");
			}
				
			} else {
				System.out.println("A data est� inv�lido");
			}
			
			break;
			
		case 11:
			
			if (dia > 0 && dia < 31) {
				
			if (dia < 22) {
				System.out.println("Seu Signo do Zod�aco � Escorpi�o");
			} else {
				System.out.println("Seu Signo do Zod�aco � Sagit�rio");
			}
			
			} else {
				System.out.println("A data est� inv�lido");
			}
			
			break;
			
		case 12:
			
			if (dia > 0 && dia < 32) {
			
			if (dia < 22) {
				System.out.println("Seu Signo do Zod�aco � Sagit�rio");
			} else {
				System.out.println("Seu Signo do Zod�aco � Capric�rnio");
			}
				
			} else {
				System.out.println("A data est� inv�lido");
			}
			
			break;
			
		default:
			System.out.println("A data est� inv�lido");
			break;
		}

		ler.close();
	}

}
