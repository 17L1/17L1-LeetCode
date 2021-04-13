package com.guang.leetcode347前K个高频元素;

import java.util.*;


public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num,map.getOrDefault(num,0) + 1);

        }
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
            @Override
            public int compare(int[] m, int[] n) {
                return m[1] - n[1];
            }
        });
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            int num = entry.getKey(),count = entry.getValue();
            if (pq.size() == k){
                if (pq.peek()[1] < count){
                    pq.poll();
                    pq.offer(new int[]{num,count});
                }
            }else {
                pq.offer(new int[]{num,count});
            }
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll()[0];
        }
        return res;
    }
}
