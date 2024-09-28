import java.util.*;

public class Linear_search {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter the elements of the array : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to be searched in the array : ");
        int num = sc.nextInt();
        Linear_Search(arr , num);
    }

    public static void Linear_Search(int arr[], int num){
        int flag=0;
        int index=-1;
        for(int i=0; i<arr.length ;i++){
            if(num==arr[i]){
                flag=1;
                index=i;
                break;
            }
            
            else
            flag=0;
        }
        if(flag==1)
        System.out.println("Given number is at index "+ index +" in the array");
        else
        System.out.println("Given number is not present in the array");
    }
}
