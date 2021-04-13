package com.guang.leetcode225用栈实现队列;

import java.util.Deque;
import java.util.LinkedList;

public class MyStack {
    Deque<Integer> dequeIn;
    public MyStack(){
        dequeIn = new LinkedList<>();
    }
    public void push(int x){
        dequeIn.offer(x);
        for (int i = dequeIn.size() - 1; i > 0 ; i--) {
            dequeIn.offer(dequeIn.poll());
        }
    }
    public int pop(){
        return dequeIn.poll();
    }
    public int top(){
        return dequeIn.peek();
    }
    public boolean isEmpty(){
        return dequeIn.isEmpty();
    }

}
