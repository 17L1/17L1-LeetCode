package com.guang.LeetCode127WordLedder;

import java.util.*;

public class Solution2 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList){
        //建立一个hash表，表示列表中是否含有该单词
        Set<String> wordSet = new HashSet<>(wordList);
        if (wordList.size() == 0 || !wordList.contains(endWord)){
            return 0;
        }
        wordSet.remove(beginWord);
        //广度优先遍历的准备工作
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);
        //广度优先遍历图
        int step = 1;
        while (!queue.isEmpty()){
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                String currentWord = queue.poll();
                if (changeEveryoneLetter(currentWord,queue,wordSet,visited,endWord)){
                    return step + 1;
                }
            }
            step++;
        }
        return 0;
    }

    private boolean changeEveryoneLetter(String currentWord, Queue<String> queue, Set<String> wordSet, Set<String> visited, String endWord) {
        char[] charArray = currentWord.toCharArray();
        for (int i = 0; i < endWord.length(); i++) {
            char original = charArray[i];
            for (char j = 'a'; j < 'z'; j++) {
                if (j == original){
                    continue;
                }
                charArray[i] = j;
                String nextWord = String.valueOf(charArray);
                if (wordSet.contains(nextWord)){
                    if (nextWord.equals(endWord)){
                        return true;
                    }
                    if (!visited.contains(nextWord)){
                        queue.add(nextWord);
                        visited.add(nextWord);
                    }
                }
                charArray[i] = original;
            }
        }
        return false;
    }
}
