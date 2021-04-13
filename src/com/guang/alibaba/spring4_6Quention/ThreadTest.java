package com.guang.alibaba.spring4_6Quention;

public class ThreadTest {
    public static void main(String[] args) {
        thread th=new thread();
        for (int i = 0; i <4 ; i++) {
            new Thread(th).start();
        }
    }
    public static class thread implements Runnable {
        int i = 1;
        @Override
        public void run() {
            while (true) {
                synchronized (this){
                    if (i % 4 == 1) {
                        System.out.print("阿");
                    } else if (i % 4 == 2) {
                        System.out.print("里");
                    } else if (i % 4 == 3) {
                        System.out.print("巴");
                    } else{
                        System.out.println("巴");
                    }
                    i++;
                    if(i>103){
                        break;
                    }
                }
            }
        }
    }
}