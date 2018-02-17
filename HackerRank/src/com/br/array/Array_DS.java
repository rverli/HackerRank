package com.br.array;

import java.util.Scanner;

public class Array_DS {

	/*
	 * O(n) solution
	 * Two loops of O(n), and several variable of O(1)
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[] values = new int[length];
        
        //values:   1 4 3 2
        //indexes:  0 1 2 3
        for (int i = 0; i < length; i++) {
			values[i] = input.nextInt();
		}
        
        //print in reverse
        //print indexes: 3 -> 2 -> 1 -> 0, intead of 0 -> 1 -> 2 -> 3
        for (int i = length - 1; i >= 0; i--) {
			System.out.print( values[i] + " " );
		}
        
        input.close();
    }
}
