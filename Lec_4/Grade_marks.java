package Lec_4;
import java.util.*;
public class Grade_marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s= new Scanner(System.in);
     int marks= s.nextInt();
     
     if(marks>90) {
    	 System.out.println("Grade is O");
     }else if(marks>80 && marks <=90) {
    	 System.out.println("Grade is A+");
     }else if(marks>70 && marks <=80) {
    	 System.out.println("Grade is A");
     }else if(marks>50 && marks <=70) {
    	 System.out.println("Pass");
     }else {
    	 System.out.println("Fail"); 
     }
  
	}

}
