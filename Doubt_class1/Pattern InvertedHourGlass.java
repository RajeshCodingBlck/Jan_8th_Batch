import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner s= new Scanner(System.in);
      int n=s.nextInt();

      int row=1;  
      int nst=1;
      int nsp= 2*n-1;
      int rowval1=n;
      int rowval2=n;
      while(row<=2*n+1){

          // print the Left star
          int i=1;
          int colval1=rowval1;
          while(i<=nst){
              System.out.print(colval1+" ");
              colval1--;
              i=i+1;
          }
          // print the Space
          int j=1;
          while(j<=nsp){
              System.out.print(" "+" ");
              j=j+1;
          }
          // print the right Star
          int colval2=rowval2;
          int k=1;
          if(row==n+1){
              k=2;
              colval2=1;
          }
          while(k<=nst){
              System.out.print(colval2+" ");
              colval2++;
              k=k+1;
          }

          // preparation for Next row
          if(row<n+1){
              nst=nst+1;
              nsp=nsp-2;
              rowval2--;
          }else{
              nst=nst-1;
              nsp=nsp+2;
              rowval2++;
          }

          System.out.println();
          row=row+1;

      }

    }
}
