/* Params: An array of integers a.
An integer d, the number of rotations. */

public class Solution {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

        int [] retArr = new int [a.length] ;

        for (int i = 0 ; i < a.length ; i++){

            retArr[(i - d + a.length) % a.length] = a[i] ;
        }

        return retArr;

    }
