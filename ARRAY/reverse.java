package ARRAY;
import java.util.*;

public class reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        reverse_array(arr);
    }

    public static void reverse_array(int arr[]){
        int j=arr.length-1;
        for(int i=0;i<=(arr.length/2)-1;i++){
           
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }
}
