package com.excel;

import java.util.Arrays;

public class FirstLastPos {
    public static void main(String[] args) {
       // int[] nums = {5, 7, 7, 8, 8, 10};
        int[] nums = {1,4};
        int target = 4;
        int[] res = new int[6];
        res = searchRange(nums, target);
        System.out.println(Arrays.toString(res));
    }

        public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if(nums.length ==1) {
            if (target == nums[0]) return new int[] {0,0};
            else return new int[]{-1,-1};

        }

        while (start <= end){

            int mid = start + (end - start)/2;

            if( target > nums[mid]){
                start = mid + 1;
            }
            else if (target < nums[mid]){
                end =  mid-1;
            }
            else{

                while(!(mid <0) && (nums[mid] == target)){
                    mid --;
                }
                mid ++;
                int count = mid;
                while ( !(mid==nums.length) && nums[mid] == target){
                    mid ++;
                }
                return new int[]{count, mid-1};
            }


        }
            return new int[]{-1,-1};
        }

    }




