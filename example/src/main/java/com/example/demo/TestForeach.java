package com.example.demo;

/**
 * Author:ty
 * 2020/7/25
 */
public class TestForeach {
    public static void main(String[] args) {
        String strs[]={"呵呵","哒哒"};
        for (String ll:strs
             ) {
            System.out.println(ll);
        }
        int[] nums={1,4,3,2};
        for (Integer i:nums
             ) {
            System.out.println(i);

        }
    }


}
