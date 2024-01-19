package Lec_6;
import java.util.*;
public class Pattern_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
      
     int n= s.nextInt();
     
     int row=1;
     int nst=1;
     int nsp=n-1;
     while(row<=2*n-1) {
    	 
    	 // Space
    	 int i=1;
    	 while(i<=nsp) {
    		 System.out.print(" ");
    		 i=i+1;
    	 }
    	 
    	 // Star
    	 int j=1;
    	 while(j<=nst) {
    		 System.out.print("*");
    		 j=j+1;
    	 }
    	 
    	 // Preparation for Next row
    	 
    	 if(row<n) {
    		 nst=nst+1;
    		 nsp=nsp-1;
    	 }else {
    		 nst=nst-1;
    		 nsp=nsp+1;
    	 }
    	 
    	 System.out.println();
    	 row=row+1;
     }
     
     
     
     
     
     
     
     
     
     
     
     
	}
	

}
