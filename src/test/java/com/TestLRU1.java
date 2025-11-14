package com;

import java.util.UUID;

import io.shmilyhe.github.utils.LRUCache;

public class TestLRU1 {
    public static void main(String[] args) throws InterruptedException{
        LRUCache<String,String> lru= new LRUCache<>(6000000);
        lru.put("a", "a");
        lru.put("b", "b");
        lru.put("c", "c");
        lru.remove("a");
        lru.remove("b");
        lru.remove("c");
        lru.put("a", "a");

        
    }
}
