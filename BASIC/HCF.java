import java.util.*;

public class HCF {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a<b){
            int n=a;
            a=b;
            b=n;
        }

        while(a%b!=0){
            int rem=a%b;
            a=b;
            b=rem;
            
         }
         System.out.print(b);

        
    }
    
}
