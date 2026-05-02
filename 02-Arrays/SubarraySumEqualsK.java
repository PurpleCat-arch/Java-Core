import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1};
        int k = 2;
        System.out.println("Total number of continuous subarrays whose sum equals to " + k + ": " + subarraySum(arr, k));
    }

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        // Base case: to handle subarrays starting from index 0
        map.put(0, 1);
        
        for (int num : nums) {
            sum += num;
            
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}
