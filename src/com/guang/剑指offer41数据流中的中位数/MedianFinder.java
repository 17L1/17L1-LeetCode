package com.guang.剑指offer41数据流中的中位数;

import java.util.Iterator;
import java.util.PriorityQueue;

public class MedianFinder {
    PriorityQueue<Integer> pq;
    private int size;
    /** initialize your data structure here. */
    public MedianFinder() {
        pq = new PriorityQueue<>();
        size = 0;
    }

    public void addNum(int num) {
        pq.offer(num);
    }

    public double findMedian() {
        Iterator it = pq.iterator();
        int i = 0;
        if (size % 2 == 0){
            int a = 0;
            int b = 0;
            while (it.hasNext()){
                it.next();
                if (i == size / 2 - 1 ){
                    a = (int)it.next();
                    i++;
                    continue;
                }else if (i == size / 2){
                    b = (int) it.next();
                    break;
                }
                it.next();
                i++;

            }
            return (double) (b + a) / 2;
        }else {
            while (it.hasNext()){
                if (i == size/2){
                    return (double)it.next();
                }
                it.next();
            }
        }
        return 0;

    }
}
