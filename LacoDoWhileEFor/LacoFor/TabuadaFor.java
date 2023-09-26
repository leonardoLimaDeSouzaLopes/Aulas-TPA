
public class TabuadaFor {

	public static void main(String[] args) {
		
		//For para almentar o fator 1 da multiplicacao
		for (int fator1 = 1; fator1 <= 10; fator1++) {
			//For para almentar o fator 2 da multiplicacao
			for (int fator2 = 1; fator2 <= 10; fator2++) {
				System.out.println(fator1 + " x " + fator2 + " = " + (fator1*fator2));
			}
		}
	}

}
