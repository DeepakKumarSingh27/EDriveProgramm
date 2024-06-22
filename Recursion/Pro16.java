package RaghuSir.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pro16 {
    public void findSubSet(int ind, int[] nums, List<Integer> ds,List<List<Integer>> ansList) {

        ansList.add(new ArrayList<>(ds));
        for (int i = ind; i < nums.length; i++) {
            if (i != ind && nums[i] == nums[i - 1]) continue;
            ds.add(nums[i]);
            findSubSet(i+1,nums,ds,ansList);
            ds.remove(ds.size() - 1);
        }
    }
    public List<List<Integer>> subSetWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ansList = new ArrayList<>();
        findSubSet(0,nums,new ArrayList<>(),ansList);
        return ansList;
    }
}
