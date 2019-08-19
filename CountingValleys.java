public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {

        int runningAlt = 0 ; // the running altitude
        int valleys = 0 ; // count of valleys to be returned

        for (char c : s.toCharArray()) {
            if (c == 'U') {
                runningAlt++ ;
                if (runningAlt == 0) {
                    valleys++; // update valley count when alt is 0 and heading up
                }
            } else {
                runningAlt-- ;
            }
        }
        return valleys;
    }
