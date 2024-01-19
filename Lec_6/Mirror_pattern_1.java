package Lec_6;
import java.util.*;
public class Mirror_pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s= new Scanner(System.in);
     
     int n=s.nextInt();
     
     int row=1;
     int nst=1;
     while(row<=2*n-1) {
    	 
    	  // Print the Star
    	 
    	  int i=1;
    	  while(i<=nst) {
    		  System.out.print("*");
    		  i=i+1;
    	  }
    	  
    	  // Preparation for Next row
    	  if(row<n) {
    		  nst=nst+1;
    	  }else {
    		  nst=nst-1;
    	  }
    	  
    	  
    	 System.out.println();
    	 row=row+1;
     }
	}

}
