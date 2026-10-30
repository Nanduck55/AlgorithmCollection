//Orte, Rainan S
class HashTableProbing {
    Integer[] table;
    int size;

    HashTableProbing(int size) { // A constructor I recognize from OOP
        this.size = size;
        table = new Integer[size];
    }

    void insert(int key) { // This does the linear probing insertion
        int idx = key % size;
        int startIndex = idx;
        while (table[idx] != null) {
            idx = (idx + 1) % size;
            if (idx == startIndex) {
                throw new IllegalStateException("Hash table is full");
            }
        }
        table[idx] = key;
    }

    boolean search(int key) { // This does the linear probing search
        int idx = key % size;
        int start = idx;
        while (table[idx] != null) {
            if (table[idx] == key) return true;
            idx = (idx + 1) % size;
            if (idx == start) break;
        }
        return false;
    }

    public static void main(String[] args) { // This prints the stuff to the console
        HashTableProbing ht = new HashTableProbing(10);

        // Test: Insert 1023, 2033, 3043[cite: 1]
        ht.insert(1023);
        ht.insert(2033);
        ht.insert(3043);

        System.out.println("\n--- Linear Probing Test ---");
        System.out.println("Search 1023: " + ht.search(1023)); // Should print true
        System.out.println("Search 2033: " + ht.search(2033)); // Should print true
        System.out.println("Search 3043: " + ht.search(3043)); // Should print true
        System.out.println("Search 2007: " + ht.search(2007)); // Should print false
        System.out.println("I tried putting something that isnt here for some reason (2007)");
    }
}