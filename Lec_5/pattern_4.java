package Lec_5;

import java.util.Scanner;

public class pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
	      int n= s.nextInt();
	      
	      int row=1;
	      int n_dash=n-1;
	      int nst=1;
	      while(row<=n) { 	  
	    	  // work
	    	  // Print the dash
	    	  int i=1;
	    	  while(i<=n_dash) {
	    		  System.out.print(" ");
	    		  i=i+1;
	    	  }
	    	  // Print the Star
	    	  int j=1;
	    	  while(j<=nst) {
	    		  System.out.print("*");
	    		  j=j+1;
	    	  } 
	    	  // Preparation for the Next Row.
	    	  n_dash=n_dash-1;
	    	  nst=nst+1;
	    	  System.out.println();
	    	  row=row+1;
	      }
	}

}
