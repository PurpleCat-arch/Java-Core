public class Array9 {
    public static void main(String[] args) {
        int i =3 ,j=3;
        int[][] arr = new int[i][j];
            for (i=0; i<arr.length; i++){
                for (j=0; j<arr[i].length; j++){
                    arr[i][j] = (int)(Math.random()*100);
                }
            }
            for (i=0; i<arr.length; i++){
                for (j=0; j<arr[i].length; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
    }
}