import java.util.*;

public class HashTable {
    private ArrayList<String> HashTableArr;

    //initializes an array of size capacity
    public HashTable(int capacity) {
        //List<ArrayList<String>> HashTable2DArr = new ArrayList<ArrayList<String>>(capacity);
        HashTableArr = new ArrayList(capacity);
    }

    //put hashes the key to an index in your array, and places the value there. Fails if there are collisions/repeat keys.
    public boolean put(String key, String value) {
        for(int i = 0; i <= HashTableArr.size(); i+=2) {
            if(HashTableArr.get(i).equals(key)) {
                return false;
            }
        }
        HashTableArr.add(key);
        HashTableArr.add(value);
        return true;
    }

    //get hashes the key to get the index, and returns that element. Returns null if key not found.
    public String get(String key) {
        for (int i = 0; i <= HashTableArr.size(); i += 2){
            if(HashTableArr.get(i).equals(key)) {
                return HashTableArr.get(i+1);
            }
        }
        return null;
    }

    //returns the unique int in the range of the [0, array length)
    private int hashCode(String key) {
        for (int i = 0; i <= HashTableArr.size(); i += 2){
            if(HashTableArr.get(i).equals(key)) {
                return i;
            }
        }
    return -1;
    }

}