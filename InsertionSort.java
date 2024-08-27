import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void ISort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j;
            for(j=i-1;j>=0;j--){
                if(arr[j]>current){
                    arr[j+1]=arr[j];
                }
                else{
                    break;
                }
            }
            arr[j+1]=current;
        }

        System.out.println("The sorted array is :: " + Arrays.toString(arr));
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
        ISort(arr);
    }
}
