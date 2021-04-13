package com.guang.leetcode126WordLadder2;

import java.util.*;

public class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> res = new ArrayList<>();
        if (wordList.size() < 1){
            return res;
        }
        Set<String> wordSet = new HashSet<>(wordList);//定义一个set存储转换的单词是否在里面
        wordSet.remove(beginWord);
         Queue<String> queue = new LinkedList<>();
         Set<String> visited = new HashSet<>();
         queue.offer(beginWord);
         //int step = 1;
         while (!queue.isEmpty()){
             int length = queue.size();//指示进入广度优先遍历
             for (int i = 0; i < queue.size(); i++) {
                 LinkedList<String> list = new LinkedList<>();
                 String currentWord = queue.poll();
                 list.add(currentWord);
                 if (changeOneWord(currentWord,endWord,wordSet,visited,queue)){
                     //step++;
                     list.add(endWord);
                     list.addFirst(beginWord);
                     res.add(new ArrayList<>(list));
                 }
             }
             //step++;
         }
         return res;

    }

    private static boolean changeOneWord(String currentWord, String endWord, Set<String> wordSet, Set<String> visited, Queue<String> queue) {
        char[] charArray = currentWord.toCharArray();
        for (int i = 0; i < endWord.length(); i++) {
            char original = currentWord.charAt(i);
            for (char j = 'a'; j <='z'; j++ ){
                if (j == original){
                    continue;
                }
                String word = String.valueOf(charArray);
                if (wordSet.contains(word)){
                    if (word.equals(endWord)){
                        return true;
                    }
                    if (!visited.contains(word)){
                        visited.add(word);
                        queue.add(word);
                    }
                }

            }
            charArray[i] = original;
        }
        return false;
    }
//    public static boolean changeOneWord(String currentWord, String endWord, List<String> wordList, Set<String> wordSet)
}
