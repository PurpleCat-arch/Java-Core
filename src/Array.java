import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements: ");
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
            sum = sum + arr[i];
        }
        double avg=sum/n;
        System.out.println("sum of array is: "+sum);
        System.out.println("average of array is: "+avg);
    }
}
