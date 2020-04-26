package com.zxx.one;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /**
     * [1]两数之和
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum1(int[] nums, int target) {
        int i,j = 0;
        for(i = 0;i < nums.length -1; i++){
            for(j = i + 1;j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    /**
     * 一遍哈希
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum2(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

}
