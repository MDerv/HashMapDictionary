public class HashTableDriver {
    public static void main(String[] args) {
        HashTable h = new HashTable(10000);

        //putting value into Hashmap (Output: true)
        System.out.println(h.put("hi", "hola"));

        //should fail (Output: false)
        System.out.println(h.put("hi", "adios"));

        //print key's value (Output: hola)
        System.out.println(h.get("hi"));

        //should return null (Output: null)
        System.out.println(h.get("lol"));
    }
}
