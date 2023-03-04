package com.mavacore369.domain.com.conditional.exercise;

import java.util.Scanner;

/*
 * Shivan MavaCore369;
 */

public class EqualNumberCheck {

	public static void main(String[] args) {
		int x,y,z;
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		y = input.nextInt();
		z = input.nextInt();
		
		if( (x==y) && (x==z) ) {
			System.out.println("All Equals");
		}
		else if( (x==y) || (x==z) ) {
			System.out.println("Two numbers equals");
		}
		else {
			System.out.println("Not Equals");
		}

	}

}
