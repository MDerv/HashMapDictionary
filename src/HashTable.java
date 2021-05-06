import java.util.*;

public class HashTable {
    private ArrayList<String> HashTableArr;

    //initializes an array of size capacity
    public HashTable(int capacity) {
        HashTableArr = new ArrayList(capacity);
        for (int i = 0; i < capacity; i++) {
            HashTableArr.add(null);
        }
    }

    //put hashes the key to an index in your array, and places the value there. Fails if there are collisions/repeat keys.
    public boolean put(String key, String value) {
        String indexNum = "";

        for (int i = 0; i < key.length(); i++) {
            indexNum += (int)key.charAt(i);
        }

        if (HashTableArr.get(Integer.parseInt(indexNum)%601) == null) {
            HashTableArr.add(Integer.parseInt(indexNum)%601, value);
            return true;
        }
        else {
            return false;
        }
    }

    //get hashes the key to get the index, and returns that element. Returns null if key not found.
    public String get(String key) {
        return HashTableArr.get(this.hashCode(key));
    }

    //returns the unique int in the range of the [0, array length)
    private int hashCode(String key) {
        String indexNum = "";

        for (int i = 0; i < key.length(); i++) {
            indexNum += (int)key.charAt(i);
        }

        return Integer.parseInt(indexNum)%601;
    }
}