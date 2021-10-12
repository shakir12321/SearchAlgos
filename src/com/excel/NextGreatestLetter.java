package com.excel;

public class NextGreatestLetter {
    public static void main(String[] args) {
        // int[] arr = {90,75,18,12,64,3,1};
        char [] arr = {'c','f','j'};
        char target = 'k';
        char let = abs(arr, target);
        System.out.println(let);



    }

    private static char abs(char[] letters, char target) {

        //start and end index
        int start = 0;
        int end = letters.length - 1;
        int arrend = letters.length -1;

       // int mid = start + ((end - start )/2);
//        while ( target <= mid){
        while(start <= end) {
          int  mid = start + ((end - start) / 2);

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
      //  System.out.println("The State "+"Start: "+ start +" End: "+end + " Mid: "+mid+ " Target: "+target);

        return letters[start % letters.length];
    }
}
