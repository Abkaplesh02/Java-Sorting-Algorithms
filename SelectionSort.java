// Selection sort
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void SSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minI=i;
            int minE=arr[i];
            boolean Check=false;
            for(int j=i+1;j<arr.length;j++){
                if (arr[j] < minE) {  // Corrected comparison
                    minI = j;
                    minE = arr[j];
                    Check = true;
                }
            }
            if(Check){
                int temp=arr[i];
                arr[i]=minE;
                arr[minI]=temp;
            }
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
       SSort(arr);
    }
}
