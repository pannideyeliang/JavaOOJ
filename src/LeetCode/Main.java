package LeetCode;

import java.util.HashMap;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {

    }
}


//1. 两数之和
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0};
    }

    //    第二个版本，使用哈希表可以降低时间复杂度，哈希表示根据计算直接得到数据位置的，所以
//    哈希表寻找数据的事件复杂度是 O(1)
    public int[] twoSumV2(int[] nums, int target) {
        HashMap<Integer, Integer> hashtable = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i],i);
        }
        return new int[]{0};
    }
}