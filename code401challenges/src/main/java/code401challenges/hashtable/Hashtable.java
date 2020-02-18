package code401challenges.hashtable;

// Ref: https://frontrowviews.com/Home/Event/Play/5e1929fdeee6d91a18544057
public class Hashtable {
    public int size;
    public Node[] map;

    public Hashtable(int size){
        this.size = size;
        this.map = new Node[size];
    }

    private int hash(String key){
        int hashValue = 0;
        for(int i = 0; i < key.length(); i++){
            hashValue += (int) key.charAt(i);
        }
        hashValue = (hashValue * 599) % this.size;
        return hashValue;
    }

    public void add(String key, String value){
        int hashKey = hash(key);
        if(map[hashKey] == null){
            map[hashKey] = new Node(key, value);
        }
        else {
            Node runner = map[hashKey];
            map[hashKey] = new Node(key, value);
            map[hashKey].next = runner;
        }
    }

    public String get(String key){
        int hashKey = hash(key);
        if(map[hashKey] != null){
            return map[hashKey].value;
        }
        return null;
    }

    public boolean contains(String key){
        int hashKey = hash(key);
        return map[hashKey] != null;
    }
}
