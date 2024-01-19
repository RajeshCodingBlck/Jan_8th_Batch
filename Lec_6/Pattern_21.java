package Lec_6;
import java.util.*;
public class Pattern_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s= new Scanner(System.in);
     
     int n= s.nextInt();
     
     int row=1;
     int nst=1;
     int nsp=2*n-3;
     while(row<=n) {
    	 //Left Star
    	 int i=1;
    	 while(i<=nst) {
    		 System.out.print("*"+" ");
    		 i=i+1;
    	 }
    	 //print the  Space 
    	 int j=1;
    	 while(j<=nsp) {
    		 System.out.print(" "+" ");
    		 j=j+1;
    	 } 
    	 // Right Star
    	 int k=1;
//    	 
    	 if(row==n) {
    		 k=2;
    	 }
    	 while(k<=nst) {
    		 System.out.print("*"+" ");
    		 k=k+1;
    	 }
    	 // Preparation for Next Row
    	 nst=nst+1;
    	 nsp=nsp-2; 
    	 System.out.println();
    	 row=row+1;
     }
	}

}
