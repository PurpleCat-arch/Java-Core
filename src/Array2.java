public class Array2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        int sum=0;
        for (int num:arr){
            sum = sum+num;
        }

        double average = (double)sum/arr.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
