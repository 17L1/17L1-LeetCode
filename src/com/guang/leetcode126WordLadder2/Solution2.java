package com.guang.leetcode126WordLadder2;

import java.util.*;

public class Solution2 {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        //先将wordList添加到set中，以查找该单词是否存在；
        Set<String> wordSet = new HashSet<>(wordList);
        List<List<String>> res = new ArrayList<>();
        if (wordSet.size()==0 || !wordSet.contains(endWord)){
            return res;
        }
        //第一步，：使用广度优先遍历得到后继节点列表successors
        //key:字符串，value:广度优先遍历过程中key的后继节点列表
        Map<String, Set<String>> succssors = new HashMap<>();
        boolean found = bfs(beginWord,endWord,wordSet,succssors);
        if (!found){
            return res;
        }
        //基于后继节点列表successors，使用回溯算法得到所有最短路径列表
        Deque<String> path = new ArrayDeque<>();
        path.addLast(beginWord);
        dfs(beginWord,endWord,succssors,path,res);
        return res;
    }

    private static void dfs(String beginWord, String endWord, Map<String, Set<String>> succssors, Deque<String> path, List<List<String>> res) {
        if (beginWord.equals(endWord)){
            res.add(new ArrayList<>(path));
            return;
        }
        if (!succssors.containsKey(beginWord)){
            return ;
        }
        Set<String> successorWord = succssors.get(beginWord);
        for (String nextWord : successorWord){
            path.addLast(nextWord);
            dfs(nextWord,endWord,succssors,path,res);
            path.removeLast();
        }
    }

    private static boolean bfs(String beginWord, String endWord, Set<String> wordSet, Map<String, Set<String>> succssors) {
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);
        boolean found = false;
        int wordLen = beginWord.length();//指示每个单词的长度；
        //当前层访问过的节点，当前层全部遍历完成后，再添加到总的visited集合里，
        Set<String> nextLevelVisited = new HashSet<>();
        while (!queue.isEmpty()){
            int currentSize = queue.size();
            for (int i = 0; i< currentSize;i++){
                String currentWord = queue.poll();
                char[] charArray = currentWord.toCharArray();
                for (int j = 0; j < wordLen; j++) {
                    char originary = charArray[i];
                    for (char k = 'a'; k <= 'z'; k++) {
                        if (charArray[i] == k){
                            continue;
                        }
                        charArray[i] = k;
                        String nextWord = String.valueOf(charArray);
                        if (wordSet.contains(nextWord)){
                            if (!visited.contains(nextWord)){
                                if (nextWord.equals(endWord)){
                                    found = true;
                                }
                                //避免下层元素重复加入队列
                                if (!nextLevelVisited.contains(nextWord)){
                                    queue.offer(nextWord);
                                    nextLevelVisited.add(nextWord);
                                }
                                //维护successor的定义
                                succssors.computeIfAbsent(currentWord,a->new HashSet<>());
                                succssors.get(currentWord).add(nextWord);
                            }
                        }
                    }
                    charArray[j] = originary;
                }
            }
            if (found){
                break;
            }
            visited.addAll(nextLevelVisited);
            nextLevelVisited.clear();
        }
        return found;
    }
}
