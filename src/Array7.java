public class Array7 {
    public static void main(String[] args){
        int[] arr ={1,2,3,4,4,3,3};
        int duplicate =0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i+1]) {
                duplicate++;
            }
        }
        System.out.println("Number of duplicates: " + duplicate);
    }
}
        
