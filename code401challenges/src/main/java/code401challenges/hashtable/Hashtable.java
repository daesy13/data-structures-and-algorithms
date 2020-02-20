package code401challenges.hashtable;

import java.util.LinkedList;

// Ref: https://frontrowviews.com/Home/Event/Play/5e1929fdeee6d91a18544057
// Ref: https://www.geeksforgeeks.org/implementing-our-own-hash-table-with-separate-chaining-in-java/
public class Hashtable<K, V> {

    // here the bucketArray is used to store arrays of keys with their respectives values
    private LinkedList<HashNode<K, V>> bucketArray;

    // number of capacity of the linkList
    private int numBuckets;

    // current size of linkList
    private int size;

    public Hashtable(int size){
        this.numBuckets = size;
        this.bucketArray = new LinkedList<>();
        // Create empty chains
        for (int i = 0; i < numBuckets; i++)
            bucketArray.add(null);
    }

    // HASH METHOD
    private int hash(K key){
        int hashValue = key.hashCode();
        return hashValue % numBuckets;
    }

    // ADD METHOD
    public void add(K key, V value){

        //finding head of chain for given key
        int bucketIndex = hash(key);
        HashNode<K, V> head = bucketArray.get(bucketIndex);

        // check if key is already present
        while (head != null) {
            if(head.key.equals(key)) {
                head.value = value;
                return;
            }

            head = head.next;
        }

        // inserting key in chain
        size++;
        head = bucketArray.get(bucketIndex);
        HashNode<K, V> newNode = new HashNode<K, V>(key, value,null);
        newNode.next = head;
        bucketArray.set(bucketIndex, newNode);

        // if load factor goes beyond the limit
        if((1 * size)/numBuckets >= 0.7) {
            LinkedList<HashNode<K, V>> temp = bucketArray;
            bucketArray = new HashNode<K, V>(key, value, null);
            numBuckets = 2 * numBuckets;
            size = 0;

            for (int i = 0; i < numBuckets; i++) {
                bucketArray.add(null);
            }

            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }

    // GET METHOD
    public V get(K key) {
        int bucketIndex = hash(key);
        HashNode<K, V> bucketty = bucketArray.get(bucketIndex);

        while (bucketty != null) {
            if (bucketty.key.equals(key)) {
                return bucketty.value;
            }
            bucketty = bucketty.next;
        }
        return null;
    }

    // CONTAINS METHOD
    public boolean contains(K key){
        int bucketIndex = hash(key);
        HashNode<K, V> bucketty = bucketArray.get(bucketIndex);
        while (bucketty != null){
            if (bucketty.key.equals(key)){
                return true;
            }
            bucketty = bucketty.next;
        }
        return false;
    }
}
