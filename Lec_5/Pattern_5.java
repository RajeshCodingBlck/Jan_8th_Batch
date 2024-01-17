package Lec_5;

import java.util.Scanner;

public class Pattern_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		
		int row=1;
		
		int nsp=0;
		int nst=n;
		
		while(row<=n) {
			// work
			
//			Print the Space
			int i=1;		
			while(i<=nsp) {
				System.out.print(" ");
				i=i+1;
			}
			// print the Star			
			int j=1;
			while(j<=nst) {
				
				System.out.print("*");
				j=j+1;
			}
			
			// Preparation for Next row
			nsp=nsp+2;
			nst=nst-1;
			
			System.out.println();
			row=row+1;
		}

	}

}
