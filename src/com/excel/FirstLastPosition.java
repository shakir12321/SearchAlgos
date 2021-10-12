package com.excel;

import java.util.Arrays;

public class FirstLastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 4, 7, 7,7,8, 8, 10};
        //int[] nums = {1,4};
        int target = 7;
        int[] res = searchRange(nums, target);
        System.out.println(Arrays.toString(res));

    }

    public static int[] searchRange(int[] nums, int target) {

        int firstOccurrence = findBound(nums, target, true);
        int lastOccurrence = findBound(nums, target, false);
        return new int[]{firstOccurrence, lastOccurrence};
    }

    private static int findBound(int[] nums, int target, boolean isFirst) {
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start <= end) {
            int mid = start + (end - start)/2;

            if(nums[mid] > target){
                end = mid - 1;
            }
            else if (nums[mid] < target){
                start = mid + 1;
            }
            else {
                //return mid;
                ans = mid;

                if (isFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
