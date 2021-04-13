package com.guang.LeetCode146LRU缓存机制;

import java.util.HashMap;

public class LRUCathe {
    private int capactity;
    private int size;
    private HashMap<Integer, DoubleList> map = new HashMap<>();
    private DoubleList head,tail;
    class DoubleList{
        int key;
        int val;
        DoubleList pre;
        DoubleList next;
        public DoubleList(int key,int val){
            this.key = key;
            this.val = val;
        }

        public DoubleList() {
        }
    }

    public LRUCathe(int capacity){
        this.capactity = capacity;
        this.size = 0;
        head = new DoubleList();
        tail = new DoubleList();
        head.next = tail;
        tail.pre = head;
    }
    public int get(int key){
        DoubleList node = map.get(key);
        if (node == null){
            return -1;
        }

        moveToHead(node);
        return node.val;

    }
    public void put(int key, int value){
        DoubleList node = map.get(key);
        if (node == null){
            size++;
            DoubleList newNode = new DoubleList(key,value);
            map.put(key,newNode);
            addToHead(newNode);
            if (size > capactity){
                DoubleList tail = removeTail();
                map.remove(tail.key);size--;
            }
        }else {
            node.val = value;
            moveToHead(node);
        }
    }
    private void moveToHead(DoubleList node) {
        removeNode(node);
        addToHead(node);

    }

    private void removeNode(DoubleList node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    private DoubleList removeTail() {
        DoubleList res = tail.pre;
        removeNode(res);
        return res;
    }

    private void addToHead(DoubleList node){
        node.pre = head;
        node.next = head.next;
        head.next.pre = node;
        head.next = node;
    }

}
