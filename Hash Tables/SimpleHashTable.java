//Orte, Rainan S
public class SimpleHashTable {
    int[] table;
    int tableSize = 10;

    // 1. integer array size 10, initialized to -1
    public SimpleHashTable() {
        table = new int[tableSize];
        for (int i = 0; i < tableSize; i++) {
            table[i] = -1; // -1 = empty
        }
    }

    // 2. returning key % tableSize 
    public int hashFunction(int key) {
        return key % tableSize;
    }

    // 3. Insert method: if slot occupied, print "Collision!"
    public void insert(int key) {
        int index = hashFunction(key);
        
        // Check if slot is already occupied (not -1)
        if (table[index] != -1) {
            System.out.println("Collision! Key " + key + " at index " + index);
        }
        
        // Insert the key into the slot (basic direct placement or overwrite on collision for simple demo)
        table[index] = key;
    }

    // 4. Display table to print all indices
    public void displayTable() {
        for (int i = 0; i < tableSize; i++) {
            System.out.println("Index " + i + ": " + table[i]);
        }
    }

    // 5. Main method with specified keys: 1023, 2045, 3098, 4101, 2033
    public static void main(String[] args) {
        SimpleHashTable ht = new SimpleHashTable();
        int[] keys = {1023, 2045, 3098, 4101, 2033};
        
        for (int k : keys) {
            ht.insert(k);
        }
        
        System.out.println("\n--- Final Hash Table ---");
        ht.displayTable();

        System.out.println("I take back what I said about the sorts being long");
    }
}
