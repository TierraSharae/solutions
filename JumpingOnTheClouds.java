public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {

        int count = 0 ; // number of jumps to be returned

        for (int i = 0 ; i < c.length ; i++) {
                if (i+2 < c.length && c[i+2] == 0) {
                    count++; 
                    i++;
                } else if (i+1 < c.length && c[i+1] == 0){
                    count++;
            }
        }
        return count;
    }
