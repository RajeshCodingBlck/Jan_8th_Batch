import java.util.*;
public class Main {
    public static void main(String args[]) {
     
     Scanner s= new Scanner(System.in);
     int n=s.nextInt();

     int row=1;
     
     int nsp=n-1;
     int nst=1;
    int rowval=1;
     while(row<=n){
       
         // print the Space
         int i=1;
         while(i<=nsp){
             System.out.print(" "+"\t");
             i=i+1;
         }

        // Print the Star
        int j=1;
        int colval=rowval;
        while(j<=nst){
            System.out.print(colval+"\t");
           // Vertical Mirror Concept.....
            if(j<(nst+1)/2){
               colval=colval+1;
            }else{
                colval=colval-1;
            }
            j++;
        }

        // Preparation for Next Row
         nsp=nsp-1;
         nst=nst+2;
          rowval=rowval+1;
         System.out.println();
         row=row+1;
     }
    }
}
