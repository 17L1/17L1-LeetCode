package com.guang.LeetCode127WordLedder;

import java.util.*;

public class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList){
        //1、先将wordList放到哈希表中，用于判断某个单词是否在wordList中
        Set<String> wordSet = new HashSet<>(wordList);
        if (wordSet.size() == 0 || !wordSet.contains(endWord)){
            return 0;
        }
        wordSet.remove(beginWord);

        //2、图的广度优先遍历，必须使用队列和表示是否访问过的visited哈希表
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);
        //3、开始广度优先遍历，包含七点，因此初始化的步数为1
        int step = 1;
        while (!queue.isEmpty()){
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                String currentWord = queue.poll();
                //如果currentWord能够修改一个字符与endWord相同，则返回step+1
                if (changeWordEveryOneLetter(currentWord,endWord,queue,visited,wordSet)){
                    return step + 1;
                }
            }
            step++;
        }
        return 0;

    }

    private boolean changeWordEveryOneLetter(String currentWord, String endWord, Queue<String> queue, Set<String> visited, Set<String> wordSet) {
        char[] charArray = currentWord.toCharArray();
        for (int i = 0; i < endWord.length() ; i++) {
            //保存初始字符串，一个一个字符改变
            char orignaChar = charArray[i];
            for (char j = 'a'; j <= 'z'; j++) {
                if (j == orignaChar){
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
                        //添加到队列以后，必须马上标记为已访问
                        visited.add(nextWord);
                    }
                }
            }
            charArray[i] = orignaChar;
        }
        return false;
    }
}
