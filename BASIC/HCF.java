import java.util.*;

public class HCF {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            int c = a/b;
            int d = a%b;
           while(d!=0){
              a=b;
              b=d;
              c = a/b;
              d = a%b;
              
           }
           System.out.print(b);
          
        }else{
            int n;
            n=a;
            a=b;
            b=n;
            int c = a/b;
            int d = a%b;
           while(d!=0){
              a=b;
              b=d;
              c = a/b;
              d = a%b;
             
           }
           System.out.print(b);
           
        }
    }
    
}
