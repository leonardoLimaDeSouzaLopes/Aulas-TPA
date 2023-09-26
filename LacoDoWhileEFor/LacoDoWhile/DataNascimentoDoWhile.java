import java.util.Scanner;
public class DataNascimentoDoWhile {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		String resposta;
		
		//Parte que repete
		do {
			int idade, anoAtual, anoNasc;
			
			//leitura o Ano Atual
			System.out.println("Diga Ano Atual");
			anoAtual = ler.nextInt();
			
			//leitura o Ano De Nascimento
			System.out.println("Diga seu Ano de Nascimento");
			anoNasc = ler.nextInt();
			
			//Calcula a Idade
			idade = anoAtual - anoNasc;
			
			//Verifica se é Menor ou Maior de Idade
			if(idade < 18) {
				System.out.println("Você é Menor de Idade");
			} else {
				System.out.println("Você é Maior de Idade");
			}
			
			//Ve se o usuario vai continuar a execucao 
			System.out.println("Deseja Continuar a Execucao (1-Sim 2-Nao)");
			resposta = ler.next();
			
			} while(!(resposta.equals("2")));
		
		ler.close();
		
	}

}
