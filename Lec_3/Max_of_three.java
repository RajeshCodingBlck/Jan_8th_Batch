package Lec_3;
import java.util.*;
public class Max_of_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       int a= s.nextInt();
       int b= s.nextInt();
       int c= s.nextInt();
       
       if(a>b && a>c) {
    	   System.out.println("a is Maximum");
       }else if(b>c && b>a) {
    	   System.out.println("b is Maximum");
       }else {
    	   System.out.println("c is Maximum");
       }
       
       
       
       
	}

}
