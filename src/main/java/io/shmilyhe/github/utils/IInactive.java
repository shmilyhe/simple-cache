package io.shmilyhe.github.utils;

/**
 * 缓存失效,昨听
 */
public interface IInactive<K, V> {
    void onInactive(K key,V value,long crate);
}
