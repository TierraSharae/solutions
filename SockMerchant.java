public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        int total = 0 ; // total count to be returned
        int currCount = 1 ; // count of the current sock color we're on
        int num = 0 ; // the sock "color" itsef

        Arrays.sort(ar) ; 

        num = ar[0] ;

        for (int i = 1 ; i < n ; i++){

            if (ar[i] == num){
                currCount++;
            } 
            if (ar[i] != num || i == n-1) {
                num = ar[i];
                if (currCount % 2 == 0) {
                    total += currCount / 2 ;
                } else {
                    total += (currCount-1) / 2 ;
                }
                currCount = 1;
            }
        }    
        return total;
    }
