public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

        int maxSum = Integer.MIN_VALUE ;

        for (int i = 0 ; i < arr.length ; i++) {
            for (int j = 0 ; j < arr.length ; j++) {
                
                int runningSum = 0 ;

                if (i-1 >= 0 && j-1 >= 0 && i+1 < arr.length && j+1 < arr.length) {
                    runningSum += arr[i-1][j-1];
                    runningSum += arr[i-1][j];
                    runningSum += arr[i-1][j+1];
                    runningSum += arr[i][j];     
                    runningSum += arr[i+1][j-1];
                    runningSum += arr[i+1][j];
                    runningSum += arr[i+1][j+1];
                    maxSum = Math.max(maxSum, runningSum);
            }
        }
    }
        return maxSum;
}
