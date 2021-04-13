package com.guang.leetcode225用栈实现队列;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Mystack2 {
    Queue<Integer> stack;
    public Mystack2(){
        stack = new LinkedList<>();
    }

    public void push(int x){
        stack.offer(x);
        for (int i = 1; i < stack.size(); i++) {
            stack.offer(stack.poll());
        }
    }

    public int pop(){
        return stack.poll();
    }

    public int top(){
        return stack.peek();
    }

    public boolean empty(){
        return stack.isEmpty();
    }
}
