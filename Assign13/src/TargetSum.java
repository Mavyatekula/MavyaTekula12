import java.util.HashMap;

public class TargetSum {
    public static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i ; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60};
        int target = 100;
        int[] result = findTwoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
