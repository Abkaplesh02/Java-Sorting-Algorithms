//LeetCode 268
//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
// Missing Number LeetCode
import java.util.Arrays;
import java.util.Scanner;

public class MissingNumberLeetCode {
    public static void CSort(int arr[]){
       int i=0;
       while(i<arr.length){
           if(arr[i]!=i && arr[i]<arr.length){
               int temp=arr[arr[i]];
               arr[arr[i]]=arr[i];
               arr[i]=temp;
           }
           else{
               i++;
           }
       }
        System.out.println(Arrays.toString(arr));

       for(int j=0;j<arr.length;j++){
           if(arr[j]!=j){
               System.out.println("This is missing number");
               System.out.println(j);
               return ;
           }
       }
        System.out.println(arr.length);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :: ");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter the values of array :: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The values of array are :: ");
        System.out.println(Arrays.toString(arr));
        CSort(arr);
    }

}
