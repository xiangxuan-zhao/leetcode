package com.zxx.one;

public class MoveZero {

    /**
     * [283]移动零
     * 解法一
     * 思路
     * @param nums
     */
    public void moveZeroes1(int[] nums) {
        int i,j = 0;
        for(i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                if(i != j){
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
    }

    /**
     * 解法二：
     */
    public void moveZeroes2(int[] nums){
        int index = 0;
        for(int num : nums){
            if(num != 0){
                nums[index++] = num;
            }
        }

        while(index < nums.length){
            nums[index] = 0;
        }
    }
}
