import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args){
        int[] arr = {1,2,3,1,2,3,4,5,1,2,3,4};
        HashMap<Integer,Integer> freq = new HashMap<>();

        for (int num : arr) {
            if (freq.containsKey(num)) {
                freq.put(num, freq.get(num) + 1);
            } else {
                freq.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
        
    }
}
