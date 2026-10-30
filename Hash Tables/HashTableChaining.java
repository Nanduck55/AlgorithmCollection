//Orte, Rainan S
import java.util.LinkedList;

class HashTableChaining {
    LinkedList<Integer>[] table;
    int size;

    @SuppressWarnings("unchecked") // This thing prevents an error when creating a generic array
    HashTableChaining(int size) { //This is the constructor for the HashTableChaining class
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) { // It Initialize each index with a new LinkedList
            table[i] = new LinkedList<>();
        }
    }

    void insert(int key) { // This inserts a key into the hash table using separate chaining
        int idx = key % size;
        table[idx].add(key);
    }

    boolean search(int key) { // This searches for key in hash using separate chaining
        int idx = key % size;
        return table[idx].contains(key);
    }

    public static void main(String[] args) { //This is where they run away
        HashTableChaining ht = new HashTableChaining(10);
        
        // Test: Insert 1023, 2033, 3043[cite: 1]
        ht.insert(1023);
        ht.insert(2033);
        ht.insert(3043);

        // Print results to verify all three are found[cite: 1]
        System.out.println("--- Separate Chaining Test ---");
        System.out.println("Search 1023: " + ht.search(1023)); // Should print true
        System.out.println("Search 2033: " + ht.search(2033)); // Should print true
        System.out.println("Search 3043: " + ht.search(3043)); // Should print tr
    }
}