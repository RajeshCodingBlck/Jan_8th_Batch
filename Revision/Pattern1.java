package Revision;

import java.util.*;
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		
		int row=1;
		int nst=n;
		while(row<=n) {
			// Print the Star
			int i=1;
		   while(i<=nst) {
			   System.out.print("*");
			   i=i+1;
		   }
		   
		   //Preparation for the Next Row
		   
		   //Go for Next Row
		   row=row+1;
		   System.out.println();
		   
		}
	}

}
