package com.excel;

public class PeakMoutain {
    public static void main(String[] args) {
        int[] arr = {3,5,3,2,0};
        int ans = peakIndexInMountainArray(arr);
        System.out.println("index " +ans +" value "+arr[ans]);

    }


            public static int peakIndexInMountainArray(int[] arr) {
                int start = 0;
                int end = arr.length -1;
                while(start < end) {
                    int mid = start + (end - start) / 2;
                    // incraesing part of the array
                    if (arr[mid] < arr[mid + 1]) {
                        start = mid + 1;

                    }
                    // this is decreasing part of the array
                    else if (arr[mid] > arr[mid + 1]) {
                        end = mid;
                    }
                }
                 return start;

            }
        }