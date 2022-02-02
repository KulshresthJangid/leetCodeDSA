package com.company.searching;

public class leetCodeBinarySearch {
    public static void main(String[] args) {
        int ans = mySqrt(55);
        System.out.println("------------------------" + ans);
        int x = guessNumber(10);
        System.out.println(x);

    }

    // Solution for the square root problem
    public static int mySqrt(int x) {
        if(x == 1) return x;
        int l = 1, r = x;
        while(l < r) {
            int mid = l + (r-l) / 2;
            if(mid> x/mid) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l-1;
    }
// 374. Guess Number Higher or Lower
    public static int guess(int x) {
        int pick = 6;
        if(x>pick) {
            return -1;
        } else if (x<pick) {
            return 1;
        } else {
            return 0;
        }
    }
    public static int guessNumber(int n) {
        int start =1;
        int end =n;

        while(start<=end)
        {
            int mid = start +(end-start)/2;
            int guess = guess(mid);

            if(guess == 1){
                start = mid+1;
            }
            else if(guess == -1) {
                end = mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
