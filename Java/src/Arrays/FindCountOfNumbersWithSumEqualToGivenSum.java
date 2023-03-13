package Arrays;

/*
*Given two integers ‘n’ and ‘sum’, find count of all n digit numbers with sum of digits as ‘sum’. Leading 0’s are not counted as digits.
1 <= n <= 100 and
1 <= sum <= 500
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindCountOfNumbersWithSumEqualToGivenSum {

    public static  void getCount(int n,int sum){
        int start = (int) Math.pow(10, n-1);
        int end = (int) Math.pow(10, n)-1;

        int count = 0;
        int i = start;

        while(i < end) {

            int cur = 0;
            int temp = i;

            while( temp != 0) {
                cur += temp % 10;
                temp = temp / 10;
            }

            if(cur == sum) {
                count++;
                System.out.print(i+ " ");
                i += 9;
            }else
                i++;

        }
        System.out.println();
        System.out.println("Count : "+ count);

    }


    public static void main(String[] args) throws IOException {
//        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
//        int n = Integer.parseInt(input.readLine());
//        int sum=Integer.parseInt(input.readLine());
        getCount(2,16);

    }
}
