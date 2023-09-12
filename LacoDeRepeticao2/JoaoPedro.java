public class JoaoPedro {

	public static void main(String[] args) {
		 
		int ano = 0;
		
		//Altura do Joao e do Pedro em Milimetros
		int alturaJoao = 1340, alturaPedro = 1450;
		
		//Um laco que conta a passagem dos anos e o aumento de altura dos dois
		while(alturaJoao <= alturaPedro) {
			alturaJoao += 25;
			alturaPedro += 20;
			ano++;
		}
		
		System.out.println("Ira demorar " + ano + " anos para Joao ficar maior que Pedro");
		
	}
}
