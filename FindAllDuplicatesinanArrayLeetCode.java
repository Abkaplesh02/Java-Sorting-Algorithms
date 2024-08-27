import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindAllDuplicatesinanArrayLeetCode {
    public static List<Integer> AllDup(int arr[]){
        ArrayList<Integer>List=new ArrayList<>();
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
        }

        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                List.add(arr[j]);
            }
        }

        return List;
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
        System.out.println("The all duplicates are :: " + AllDup(arr));
    }

}
