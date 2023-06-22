import java.util.HashMap;

public class TargetSum {
    public static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (hashMap.containsKey(diff)) {
                return new int[]{hashMap.get(diff), i};
            }

            hashMap.put(nums[i], i);
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60};
        int target = 100;
        int[] result = findTwoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]"); // Output: [3, 5]
    }
}
