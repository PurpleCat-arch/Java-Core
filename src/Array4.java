public class Array4 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};

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
