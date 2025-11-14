package com;

import java.util.UUID;

import io.shmilyhe.github.utils.LRUCache;

public class TestLRU {
    public static void main(String[] args) throws InterruptedException{
        LRUCache<String,String> lru= new LRUCache<>(6000000);
        lru.setCacheTime(1000);
        lru.startWatch();
        lru.onInactive((k,v,c)->{
            System.out.println("expired:"+k+"|"+v+"|"+c);
        });
        lru.put("a", "b");
        Thread.sleep(100000);
        
    }
}
