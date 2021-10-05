package com.excel;

public class EvenNumbers {
    public static void main(String[] args) {
        int[]  count = {2222,3333,444,5555,66,777777};
        System.out.println(findEvens(count));
    }

    private static int findEvens(int[] nums) {
        int count = 0;
        for (int num :
                nums) {
            int numdigits = (int) (Math.log10(num)+1);
            int div = numdigits % 2;
            if ( div == 0){
                count++;
            }
                }

        return count;
    }
}
