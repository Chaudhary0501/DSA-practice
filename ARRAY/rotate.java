package ARRAY;
import java.util.*;

public class rotate {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        
        rotate_array(arr,k);
    }
 
    public static void rotate_array(int arr[], int k){
        k=k%arr.length;
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-k-1);
        reverse(arr,0,arr.length-1);
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void reverse(int arr[],int i, int j){
        int m = (i+j)/2;
        while(i<=m){
            int temp = arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
    }
}

