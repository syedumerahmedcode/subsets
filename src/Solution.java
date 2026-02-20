import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        /**
         * Solved using backtracking
         */
        List<List<Integer>> result = new ArrayList<>();
        generateSubSets(0, nums, new ArrayList<>(), result);
        return result;

    }
    
    private void generateSubSets(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            generateSubSets(i + 1, nums, current, result);
            current.remove(current.size() - 1);
        }
    }

}
