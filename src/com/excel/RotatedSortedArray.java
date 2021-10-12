package com.excel;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,17,18,99, 154, 0,1,2};
        int target = 999;
        //find the peak
        int peak = findPeak(arr);
        System.out.println("The peak is "+ peak + " the value is "+arr[peak]);

        //search left side of peak
        int result = binSearch(arr, 0 , peak, target);
        //if not fount
        //search right side of peak and return the response
        if (result == -1) result = binSearch(arr, peak, arr.length-1, target);
        if (result != -1)
        System.out.println(" index "+result + " value "+arr[result]);

    }

    private static int binSearch(int[] arr, int start, int end, int target) {

        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] > target){
                end = mid-1;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else return mid;
        }
        return -1;

    }

    private static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int last = arr[end];
        int target = 0;
        //this is for First ascending part of the array.
        while (start < end) {
            int mid = start + (end - start) / 2;
            //first part
            if (mid != last && arr[mid] > arr[mid+1] ) {
                return mid;
                //This is second ascending part.
            } else if((mid != 0) && arr[mid] < arr[mid-1]){
               return mid-1;
            }
            else if (arr[mid] > arr[start]){
                start = mid +1; //as its not caught already in the prevs checks.
            }
            else if (arr[mid] < arr[start]) {
                end = mid -1; //as not caught previously.
            }
        }

        return -1;
        }

    public static int search(int[] nums, int target) {
        return 0;
    }
}
