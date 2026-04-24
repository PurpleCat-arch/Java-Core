public class Array4 {
    public static void main(String[] args) {
        int[] arr={14,78,87,76,84,93};

        int even=0;
        int odd=0;
        
        for (int num: arr) {
            if(num%2==0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
