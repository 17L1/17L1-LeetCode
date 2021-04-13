package com.guang.alibaba4_6;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintUsingLock {
    private Lock threadLock =new ReentrantLock();
    int count = 0;
    Thread athread = new Thread(
            new Runnable() {
                @Override
                public void run() {
                    while (true){
                        threadLock.lock();
                        try {
                            if (count>103){
                                return;
                            }
                            if (count%4==0){
                                System.out.print("阿");
                                count=count+1;
                            }
                        }catch (Exception e){
                            System.out.println(e);
                        }finally {
                            threadLock.unlock();
                        }
                    }
                }
            }
    );
    Thread lithread = new Thread(
            new Runnable() {
                @Override
                public void run() {
                    while (true){
                        threadLock.lock();
                        try {
                            if (count>102){
                                return;
                            }
                            if (count%4==1){
                                System.out.print("里");
                                count=count+1;
                            }
                        }catch (Exception e){
                            System.out.println(e);
                        }finally {
                            threadLock.unlock();
                        }
                    }
                }
            }
    );
    Thread ba1thread = new Thread(
            new Runnable() {
                @Override
                public void run() {
                    while (true){
                        threadLock.lock();
                        try {
                            if (count>102){
                                return;
                            }
                            if (count%4==2){
                                System.out.print("巴");

                                count=count+1;
                            }
                        }catch (Exception e){
                            System.out.println(e);
                        }finally {
                            threadLock.unlock();
                        }
                    }
                }
            }
    );
    Thread ba2thread = new Thread(
            new Runnable() {
                @Override
                public void run() {
                    while (true){
                        threadLock.lock();
                        try {
                            if (count>103){
                                return;
                            }
                            if (count%4==3){
                                System.out.println("巴");
                                count=count+1;
                            }
                        }catch (Exception e){
                            System.out.println(e);
                        }finally {
                            threadLock.unlock();
                        }
                    }
                }
            }
    );
    public void statrtThread(){
        athread.start();
        lithread.start();
        ba1thread.start();
        ba2thread.start();
    }

    public static void main(String[] args) {
        PrintUsingLock testThread = new PrintUsingLock();
        testThread.statrtThread();
    }
}

