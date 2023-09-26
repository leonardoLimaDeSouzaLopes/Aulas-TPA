
public class Multiplos10 {

	public static void main(String[] args) {
		
		int contador = 0;
		
		//For para contar os multiplos de 10 de 1 a 100
		for (int fator1 = 1; fator1 <= 10; fator1++) {
			//For para contar a casa das unidades de 1 a 9
			for (int fator2 = 1; fator2 <= 9; fator2++) {
				contador++;
				System.out.println(contador);
			}
			contador++;
			System.out.println(contador + " multiplo de 10");
		}
	}

}
