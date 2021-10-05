package com.excel;

public class AgnostBinarySearch {
    public static void main(String[] args) {
        int[] arr = {90,75,18,12,64,3,1};
//        int [] arr = {1,2,3,44,55,75,88,99};
        int target = 18;
        int index = abs(arr, target);
        System.out.println(index);



    }

    private static int abs(int[] arr, int target) {

        //start and end index
        int start = 0;
        int end = arr.length - 1;
       // boolean asc = true;
    //    if (arr[start] > arr[end]) asc = false;

        boolean asc = arr[start] < arr[end];


        int mid = start + ((end - start )/2);
//        while ( target <= mid){
        while(start <= end){
            mid = start + ((end - start )/2);

            if(target > arr[mid]){
                if (asc)
                start = mid+1;
                else
                    end = mid -1;

            }
            else if(target < arr[mid]){
                if (asc)
                end = mid - 1;
                else
                    start = mid+1;
            }
            else if (target == arr[mid]){
                return mid;
            }
        }
        return -1;
    }


}
