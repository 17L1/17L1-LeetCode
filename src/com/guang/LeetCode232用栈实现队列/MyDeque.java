package com.guang.LeetCode232用栈实现队列;

import java.util.LinkedList;
import java.util.Stack;

public class MyDeque {
    Stack<Integer> stackIn;
    Stack<Integer> stackOut;
    public MyDeque() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }
    public int push(int x){
        return stackIn.push(x);
    }
    public int pop(){
        if (stackOut.isEmpty()){
            inToOut();
        }
        return stackOut.pop();
    }
    public int peek(){
        if (stackOut.isEmpty()){
            inToOut();
        }
        return stackOut.peek();
    }



    private void inToOut() {
        while (!stackIn.isEmpty()){
            stackOut.push(stackIn.pop());
        }
    }

    public boolean empty() {
        if (stackIn.isEmpty() && stackOut.isEmpty()){
            return true;
        }
        return false;
    }


}
