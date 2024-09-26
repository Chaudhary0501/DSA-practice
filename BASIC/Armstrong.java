import java.util.*;

public class Armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int a = num;
        int no_of_digits = 0;
        while(a>0){
            a = a/10;
            no_of_digits+=1;
        }
        a=num;
        while(a>0){
            int rem = a%10;
            sum = (int)(sum + Math.pow(rem,no_of_digits));
            a = a/10;
        }
        if(num==sum){
            System.out.print(num + " is an Armstrong number!");
        }
        else{
            System.out.print(num + " is not an Armstrong number!");
        }
    }
}
