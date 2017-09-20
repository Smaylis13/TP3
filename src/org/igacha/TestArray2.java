package org.igacha;

public class TestArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int sum = 0 ; 
		for (int i = 0 ; i < array.length ; i++){
			sum += array[i];
		}
		System.out.println("la moyenne des éléments du tableau est " + sum/array.length);
		
		
		for (int i = 0 ; i < array.length ; i++){
			if ( array[i] == 15 ){
				System.out.println("L'index de 15 est "+ i );
				break;
			}
		}
		
		System.out.println("Ecrire un algorithme pour trouver le nombre d’entiers en doublon dans le tableau");
		int doublon = 0;
		for (int i = 0 ; i < array.length-1 ; i++){
			for (int j = i+1 ; j < array.length ; j++){
				if ( array[i] == array[j]){
					doublon++;
					break;
				}
			}
		}
		System.out.println("Le nombre de doublon est  " + doublon);
		
	}

}
