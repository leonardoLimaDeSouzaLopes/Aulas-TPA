import java.util.Scanner;
import java.text.DecimalFormat; 

public class Idade15Pessoas {

	public static void main(String[] args) {
		
		//Cria os Objetos
		Scanner ler = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("#.##");
		
		//Cria as Variaveis
		int ate15 = 0, de16A30 = 0, de30A45 = 0, de46A60 = 0, acima61 = 0;
		double quantidadePessoas = 15;
		
		//Le as Idades das Pessoas
		for (int i = 0; i < quantidadePessoas; i++) {
			
			int idade = ler.nextInt();
			
			//Verifica sua Faixa Etaria
			if (idade <= 15) {
				ate15++;
			} else if (idade <= 30) {
				de16A30++;
			} else if (idade <= 45) {
				de30A45++;
			} else if (idade <= 60) {
				de46A60++;
			} else {
				acima61++;
			}
		}
		
		//Mostra os Resultados =D
		System.out.println();
		System.out.println("Ate 15 Anos: " + ate15 + " pessoa, " + formato.format(ate15/quantidadePessoas*100) + "%");
		System.out.println("De 16 a 30 Anos: " + de16A30 + " pessoa, " + formato.format(de16A30/quantidadePessoas*100) + "%");
		System.out.println("De 31 a 45 Anos: " + de30A45 + " pessoa, " + formato.format(de30A45/quantidadePessoas*100) + "%");
		System.out.println("De 46 a 60 Anos: " + de46A60 + " pessoa, " + formato.format(de46A60/quantidadePessoas*100) + "%");
		System.out.println("Acima de 61 Anos: " + acima61 + " pessoa, " + formato.format(acima61/quantidadePessoas*100) + "%");
		
		ler.close();
	}

}
