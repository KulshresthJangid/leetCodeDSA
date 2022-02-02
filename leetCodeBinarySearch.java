package com.company.searching;

public class leetCodeBinarySearch {
    public static void main(String[] args) {
        int ans = mySqrt(55);
        System.out.println("------------------------" + ans);
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

}
