import java.util.Arrays;
import java.util.Scanner;

public class FirstMissingPositiveLeetCode {
    public static void First(int arr[]){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]>0 &&  arr[i]<=arr.length && arr[i]!=arr[correct] ){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if( arr[j]!=j+1){
                System.out.println(j+1);
                return ;
            }
        }
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
        First(arr);
    }
}
