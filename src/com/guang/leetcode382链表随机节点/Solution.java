/*
 * @Description: 
 * @Author: lilongguang
 * @Date: 2022-03-17 11:35:25
 * @LastEditors: lilongguang
 * @LastEditTime: 2022-03-17 12:14:56
 */
package com.guang.leetcode382链表随机节点;

import java.util.Random;

public class Solution {
    int idx = 0;
    int[] node = new int[10000];
    Random random = new Random(20220116);
    public Solution(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            node[idx++] = cur.val;
            cur = cur.next; 
        }
    }
    
    public int getRandom() {
        return node[random.nextInt(idx)];
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(){

    };
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    
}
