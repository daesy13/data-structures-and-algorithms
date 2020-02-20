package code401challenges.hashtable;

import java.util.LinkedList;

public class HashNode<K,V> extends LinkedList<HashNode<K, V>> {

    public K key;
    public V value;

    // to refer to next node
    HashNode<K, V> next;

    // constructor
    public HashNode(K key, V value, HashNode<K,V> next){
        this.key = key;
        this.value = value;
        this.next = next;
    }
}
