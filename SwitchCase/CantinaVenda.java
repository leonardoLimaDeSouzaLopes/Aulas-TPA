import java.util.Scanner;

public class CantinaVenda {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int preco;

		System.out.println("Digite a opção de lanche de 1 a 5");
		preco = ler.nextInt();

		switch (preco) {
		case 1:
			System.out.println("Você escolheu o produto Cachorro Quente e ele custa R$ 8,00");
			break;

		case 2:
			System.out.println("Você escolheu o produto Cheeseburguer e ele custa R$ 12,00");
			break;

		case 3:
			System.out.println("Você escolheu o produto X-Salada e ele custa R$ 15,00");
			break;

		case 4:
			System.out.println("Você escolheu o produto Misto Quente e ele custa R$ 11,00");
			break;

		case 5:
			System.out.println("Você escolheu o produto Pão na Chapa e ele custa R$ 6,00");
			break;

		default:
			System.out.println("Essa produto não existe.");

		}
		
		ler.close();
	}

}
