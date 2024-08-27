import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void BSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            boolean Check=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>=arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    Check=true;
                }
            }
            if(!Check){
                break;
            }
        }
        System.out.println("The sorted array is : : " + Arrays.toString(arr));
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
        BSort(arr);
    }
}
