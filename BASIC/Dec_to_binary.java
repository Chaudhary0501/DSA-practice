import java.util.*;

public class Dec_to_binary {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int binary = 0;
        int mul = 1;
        while(n!=0){
            int rem = n%2;
            binary = binary + rem*mul;
            mul = mul*10;
            n=n/2;
        }
        System.out.print(binary);
    }
}
