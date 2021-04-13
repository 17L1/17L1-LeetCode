package com.guang.剑指offer41数据流中的中位数;

import java.util.PriorityQueue;
import java.util.Queue;

public class MedianFinder2 {
    Queue<Integer> small,big;
    public MedianFinder2() {
        small = new PriorityQueue<>();
        big = new PriorityQueue<>((x,y)->y-x);
    }

    public void addNum(int num) {
        if (small.size() != big.size()){
            small.offer(num);
            big.offer(small.poll());
        }else {
            big.offer(num);
            small.offer(big.poll());
        }
    }

    public double findMedian() {
        return small.size() == big.size() ? small.peek() : (double) (big.peek() + small.peek()) / 2;
    }
}
