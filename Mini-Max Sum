import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

        long total = 0;
        int smallest = arr[0];
        int largest = arr[0];
        long min = 0;
        long max = 0;

        for (int i: arr){
            total += i;
            if (i < smallest){
                smallest = i;
            }
            if (i > largest){
                largest = i;
            }

        }

        min = total - largest;
        max = total - smallest;
    
        System.out.print(min + " " + max);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
