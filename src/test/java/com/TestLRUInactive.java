package com;

import java.util.UUID;

import io.shmilyhe.github.utils.LRUCache;

public class TestLRUInactive {
    public static void main(String[] args){
        LRUCache<String,String> lru= new LRUCache<>(6000000);
        lru.setCacheTime(1000);
        lru.onInactive((k,v,c)->{
            System.out.println("expired:"+k+"|"+v+"|"+c);
        });
        new Thread(){

           public void run(){
            while(true){
                String id=UUID.randomUUID().toString();
                lru.put(id,id);
                System.out.println("send:"+id);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
           }
        }.start();
        new Thread(){

            public void run(){
             while(true){
                 String id=UUID.randomUUID().toString();
                 lru.put(id,id);
                 System.out.println("send:"+id);
                 try {
                     Thread.sleep(10);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
            }
         }.start();
         new Thread(){

            public void run(){
             while(true){
                 String id=UUID.randomUUID().toString();
                 lru.put(id,id);
                 System.out.println("send:"+id);
                 try {
                     Thread.sleep(10);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
            }
         }.start();
         new Thread(){

            public void run(){
             while(true){
                 String id=UUID.randomUUID().toString();
                 lru.put(id,id);
                 System.out.println("send:"+id);
                 try {
                     Thread.sleep(1);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
            }
         }.start();
    }
}
