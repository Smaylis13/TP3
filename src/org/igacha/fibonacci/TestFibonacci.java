package org.igacha.fibonacci;

import java.util.Scanner;

public class TestFibonacci {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Tapper la valeur de N : ");
		int rang = scanner.nextInt();
		int i = 1;
		int n_1 = 0;
		int n_2 = 1;
		int result = 0;
		while(i < rang){
			result = n_1 + n_2;
			n_1 = n_2;
			n_2 = result;
			i++;
		}
		System.out.println("La Valeur du rang N choisis est " + result);
		
	}

}
