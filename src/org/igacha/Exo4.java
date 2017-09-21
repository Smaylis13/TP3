package org.igacha;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/**
 * 
 * @author ETY23
 *
 *	Faire un programme avec le menu suivant : 
 *		1. Ajouter un nombre
 *		2. Afficher les nombres existants
 */
public class Exo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> array = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		boolean myBool = true;
		while (myBool){
			System.out.println("Choisir :\n\t 1. Ajouter un nombre\n\t 2. Afficher les nombre existant");
			switch (scanner.nextInt()) {
			case 1:
				System.out.print("Numéro à ajouter : ");
				array.add(scanner.nextInt());
				break;
			case 2:
				afficherTableau(array);
				break;
	
			default:
				myBool = false;
				break;
			}
		}

	}
	public static void afficherTableau(ArrayList<Integer> array){
		System.out.println();
		for (int i = 0 ; i < array.size() ; i++){
			System.out.print(array.get(i) + " ");
		}
		System.out.println();
	}

}
