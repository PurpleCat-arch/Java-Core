import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = findTwoSum(arr, target);
        if (result != null) {
            System.out.println("Indices of elements that add up to " + target + ": " + Arrays.toString(result));
            System.out.println("Values: " + arr[result[0]] + " and " + arr[result[1]]);
        } else {
            System.out.println("No two sum solution found.");
        }
    }

    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            numMap.put(nums[i], i);
        }
        
        return null;
    }
}
