package Lec_6;
import java.util.*;
public class Pattern_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	  Scanner s= new Scanner(System.in);
	  int n= s.nextInt();
	  
	  int row=1;
	  int nsp=0;
	  int nst=2*n-1;
	  while(row<=n) {
		  
		  // Print the Space
		  
		  int i=1;
		  while(i<=nsp) {
			  System.out.print(" "+" ");
			  i=i+1;
		  }
		  
		  // Print the star
		  int j=1;
		  while(j<=nst) {
			  System.out.print("*"+" ");
			  j=j+1;
		  }
		  
		  nst=nst-2;
		  nsp=nsp+1;
		  System.out.println();
		  row=row+1;
	  }
	}

}
