package org.igacha;

import java.util.Arrays;

public class TestArrayTri {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Le trie : ");

		int [] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

	 /* int min = 0;
	  int tmp = 0;
	  for (int i = 0 ; i < array.length -1 ; i++){

			min = i;
			for (int j = i+1 ; j < array.length ; j++){

				if (array[j] < array[min])
					min = j;
			}
			if(min != i ){ // Echange
				tmp = array[i];
				array[i] = array[min];
				array[min] = tmp;
			}
		}*/

		/* Affichage
		for (int i = 0 ; i < array.length ; i++){
			System.out.println(array[i]);
		}
		*/

		System.out.println("Utilisation de Arrays");
		Arrays.sort(array);
		
		for (int i = 0 ; i < array.length ; i++){
			System.out.println(array[i]);
		}
		
	}
}
