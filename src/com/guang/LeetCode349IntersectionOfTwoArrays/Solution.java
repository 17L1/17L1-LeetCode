package com.guang.LeetCode349IntersectionOfTwoArrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        return getIntersection(set1,set2);

    }

    private int[] getIntersection(Set<Integer> set1, Set<Integer> set2) {
        if (set1.size() > set2.size()){
            return getIntersection(set2,set1);
        }
        Set<Integer> intersectionSet = new HashSet<>();
        for (int i : set1) {
            if (set2.contains(i)){
                intersectionSet.add(i);
            }
        }
        int[] intetscetion = new int[intersectionSet.size()];
        int index = 0;
        for (int i : intersectionSet){
            intetscetion[index++] = i;
        }
        return intetscetion;
    }

}
