import java.util.Scanner;
public class PlacaDiaVeiculo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int UNPlaca;
		
		System.out.println("Coloque o ultimo n�mero da placa do seu ve�culo");
		UNPlaca = ler.nextInt();
		
		switch(UNPlaca) {
			case 1:		
			case 2:
				System.out.println("Seu carro n�o podera andar na segunda");
				break;
				
			case 3:			
			case 4:
				System.out.println("Seu carro n�o podera andar na ter�a");
				break;
				
			case 5:			
			case 6:
				System.out.println("Seu carro n�o podera andar na quarta");
				break;
				
			case 7:			
			case 8:
				System.out.println("Seu carro n�o podera andar na quinta");
				break;
				
			case 9:			
			case 0:
				System.out.println("Seu carro n�o podera andar na sexta");
				break;
				
			default:
				System.out.println("Entrada Invalido");
		}
		
		ler.close();
	}
}
