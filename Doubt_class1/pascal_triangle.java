import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner s= new Scanner(System.in);

      int n=s.nextInt();

      int row=0;
      int nst=1;
      while(row<n){

          // print the Star
          int i=0;
          int ncr=1;
          while(i<nst){
              System.out.print(ncr+"\t");
              // Preparation for Next ncr
              ncr= ((row-i)*(ncr))/(i+1);
              
              i=i+1;
          }

          //preparation for Next row
          nst++;
          System.out.println();
          row++;
      }


    }
}
