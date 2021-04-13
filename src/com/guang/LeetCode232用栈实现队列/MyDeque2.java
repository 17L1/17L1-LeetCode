package com.guang.LeetCode232用栈实现队列;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MyDeque2 {
    Deque<Integer> stack1;
    Deque<Integer> stack2;
    public MyDeque2(){
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }
    public void push(int x){
        stack2.addLast(x);
    }
    public int peek(){
        if (!stack1.isEmpty()){
            return stack1.peekFirst();
        }else {
            while (!stack2.isEmpty()){
                stack1.addLast(stack2.removeFirst());
            }
        }
        return stack1.peekFirst();
    }
    public int pop(){
        if (!stack1.isEmpty()){
            return stack1.removeFirst();
        }else {
            while (!stack2.isEmpty()){
                stack1.addLast(stack2.removeFirst());
            }
        }
        return stack1.removeFirst();
    }
    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
