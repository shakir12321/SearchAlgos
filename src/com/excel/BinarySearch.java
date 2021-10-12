package com.excel;

public class BinarySearch {
    public static void main(String[] args) {
        int[]  nums = {1,2,3,4,5,6,7,8, 10, 11, 13, 14, 15, 17, 18, 19, 22, 23, 24, 25, 26, 27, 28, 33, 34, 35, 36, 44, 55, 66, 77, 88, 99, 100};
        int target = 55;
        int pos = binarySearch(nums,target);
        System.out.println(" POs "+ pos + " number "+ nums[pos]);
    }

    public static int binarySearch(int[] nums, int target){

        int start = 0;
        int end = 1;

        while(nums[end] < target){
            start*=2;
            end*=2;
        }
        while(start <= end) {
            int mid = start + (end - start)/2;

            if(nums[mid] > target){
                end = mid - 1;
            }
            else if (nums[mid] < target){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;

    }
}
