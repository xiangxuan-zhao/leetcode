package com.zxx.one;

public class MoveZero {

    /**
     * [283]移动零
     * 解法一: 双指针法
     * 定义一个指针i，i用来遍历
     * 指针j指向值为0的第一个元素
     * 思路
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0;i < nums.length; i++){
            if(nums[i] != 0) {
                if(i != j){
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
}
