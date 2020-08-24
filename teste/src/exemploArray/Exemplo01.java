package exemploArray;

public class Exemplo01 {
	
	public static void main (String[] args) {
		int[] meuArray = {12, 32, 54, 6, 8, 89, 64};
		for(int i = 0; i < meuArray.length; i++) {
			System.out.println(meuArray[i]);
		}
								//index i=0		index i=1
		int[][] meuArrayMulti = {{1, 2, 3, 4}, {5, 6, 7}};
		for(int i = 0; i < meuArrayMulti.length; i++) { //primeiro percorre o index 0 onde está o 1,2,3,4 - Depois o index 1 onde esta o 5,6,7
			for(int j = 0; j < meuArrayMulti[i].length; j++) { //vai percorrer os numeros propriamente
				System.out.println(meuArrayMulti[i][j]);
			}
		}
	}
}
