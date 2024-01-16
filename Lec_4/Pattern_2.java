package Lec_4;
import java.util.*;
public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     
     int n= s.nextInt();
     
      int row=1;
      
      while(row<=2) {
    	  
    	  // work
    	  int i=1;
          while(i<=n) {
       	   System.out.print("* "+i);
       	   i=i+1;
          }
          System.out.println();
          // work
    	  row=row+1;
      }
	}

}
