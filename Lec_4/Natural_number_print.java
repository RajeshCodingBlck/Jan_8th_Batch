package Lec_4;

import java.util.*;

public class Natural_number_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int i = 1; // ith natural Number.
		// i=1 means that 1st natural Number
		// ki baat ho rahi he

		while (i <= n){
			System.out.println(i);

			i = i + 1;
		}

	}

}
