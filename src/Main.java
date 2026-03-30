public class Main{
    public static void main(String[] args){
        int arr[] ={2,3,4,5,6,7,8};
        int max=arr[0];
        int min=arr[0];
        // first find maximum and minimum
        for (int i=0; i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("First Maximum: " + max);
        System.out.println("First Minimum: " + min);

        int secondmax=arr[0];
        int secondmin=arr[0];

        // second find maximum and minimum
        for (int i=0; i<arr.length;i++){
            if (arr[i]>secondmax && arr[i]<max){
                secondmax = arr[i];
            }
            if (arr[i]<secondmin && arr[i]>min){
                secondmin = arr[i];
            }
        }
        System.out.println("Second Maximum: " + secondmax);
        System.out.println("Second Minimum: " + secondmin);
    }
}