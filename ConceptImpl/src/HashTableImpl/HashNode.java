package HashTableImpl;

/**
 * Created by Abhishek Kumar on 7/5/2017.
 */
public class HashNode<K, V> {
    K key;
    V value;

    HashNode<K, V> next;

    public HashNode(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
