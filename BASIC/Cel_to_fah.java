import java.util.*;

public class Cel_to_fah {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int step = sc.nextInt();
        for(int i = min; i<=max; i+=step){
            int F = (int)((5.0/9)*(i-32));
            System.out.println(i + "  " + F);
        }
    }
    
}
