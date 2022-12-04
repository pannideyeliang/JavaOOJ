package LeetCode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(14/10);
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
            hashtable.put(nums[i], i);
        }
        return new int[]{0};
    }

    //自己能看懂的版本
    public int[] twoSumV3(int[] nums, int target) {
        HashMap<Integer, Integer> hashtable = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashtable.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (hashtable.containsKey(target - nums[i]) && i != hashtable.get(target - nums[i])) {
//                上面的判断是为了防止自己和自己相加得到target
                return new int[]{hashtable.get(target - nums[i]), i};
            }
        }
        return new int[]{0};
    }

    //    两数相加
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//          去除等于0的情况
        if (l1.val == 0) return l2;
        if (l2.val == 0) return l1;

        Integer count = 0;      //存储进位
        Integer num = 0;        //存储余数

        while (l1.next != null l2.next != null){
            count = l1.val + l2.val
        }

    }










































}