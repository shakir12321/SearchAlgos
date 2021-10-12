package com.excel;

public class CealingNumber {

    public static void main(String[] args) {
       // int[] arr = {90,75,18,12,64,3,1};
        int [] arr = {1,2,3,44,55,75,88,99};
        int target = 50;
        int index = abs(arr, target);
        System.out.println(index);



    }

    private static int abs(int[] arr, int target) {

        //start and end index
        int start = 0;
        int end = arr.length - 1;

        int mid = start + ((end - start )/2);
//        while ( target <= mid){
        while(start <= end){
            mid = start + ((end - start )/2);

            if(target > arr[mid]){
                    start = mid+1;
            }
            else if(target < arr[mid]){
                    end = mid - 1;
            }
            else if (target >=arr[mid-1])// && target < arr[mid]){
                return mid;
            }

        return start;
    }


}
