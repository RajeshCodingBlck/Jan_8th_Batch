package Revision;
import java.util.*;
public class Pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(); // no of rows
		
		int row=1;
		int nst=n;
		while(row<=n) {
			
			// Print the star
			int i=1;
			while(i<=nst) {
				System.out.print("*");
				i=i+1;
			}
//			
			// Preparation for the Next Row
			nst=nst-1;
//			
//			// Go the Next row
			row=row+1;
			System.out.println();
			
		}
		
		
	}

}
