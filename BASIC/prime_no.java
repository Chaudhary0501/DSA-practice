import java.util.*;

public class prime_no{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int y=0;
        for(int i=2;i<=n/2+1;i++){
            if(n%i==0){
                System.out.println(n + " is not a prime number.");
                y=1;
                break;
            }
        }
        if(y==0){
            System.out.println(n + " is a prime number.");
        }
    }
}