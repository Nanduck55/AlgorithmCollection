// Orte, Rainan S. BSIT2-05
public class SearchComparisonLab {
    public static int linearSearch(int[] arr, int target, int[] comparisonCount) {
        comparisonCount[0] = 0; // reset counter

        for (int i = 0; i < arr.length; i++) {
            comparisonCount[0]++;
            if(arr[i] == target){
                return i;
            }
            
        }
        return -1; // target not found
    }
    public static int binarySearch(int[] arr, int target, int[] comparisonCount) {
        comparisonCount[0] = 0; // reset counter
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // calculate middle index
            comparisonCount[0]++;

            if (arr[mid] > target){
                return mid;
            }else if (arr[mid] == target) {
                high = mid - 1; 
            }else{
                low = mid + 1;
            }
        }
        return -1; // target not found
    }

    // ========== MAIN METHOD — DO NOT MODIFY ==========
    public static void main(String[] args) {
        // 15 elements — unsorted for Linear Search
        int[] unsortedData = { 45, 12, 89, 34, 67, 23, 78, 56, 15, 92, 8, 50, 39, 71, 27 };

        // Same 15 elements — sorted for Binary Search
        int[] sortedData = { 8, 12, 15, 23, 27, 34, 39, 45, 50, 56, 67, 71, 78, 89, 92 };

        int[] count = new int[1]; // holds comparison count

        System.out.println("===== TEST 1: Search for 23 =====");
        int idx = linearSearch(unsortedData, 23, count);
        System.out.printf("Linear Search → Index: %2d | Comparisons: %d%n", idx, count[0]);
        idx = binarySearch(sortedData, 23, count);
        System.out.printf("Binary Search → Index: %2d | Comparisons: %d%n", idx, count[0]);

        System.out.println("\n===== TEST 2: Search for 45 =====");
        idx = linearSearch(unsortedData, 45, count);
        System.out.printf("Linear Search → Index: %2d | Comparisons: %d%n", idx, count[0]);
        idx = binarySearch(sortedData, 45, count);
        System.out.printf("Binary Search → Index: %2d | Comparisons: %d%n", idx, count[0]);

        System.out.println("\n===== TEST 3: Search for 99 (Not Found) =====");
        idx = linearSearch(unsortedData, 99, count);
        System.out.printf("Linear Search → Index: %2d | Comparisons: %d%n", idx, count[0]);
        idx = binarySearch(sortedData, 99, count);
        System.out.printf("Binary Search → Index: %2d | Comparisons: %d%n", idx, count[0]);

        System.out.println("\n===== TEST 4: Search for 8 =====");
        idx = linearSearch(unsortedData, 8, count);
        System.out.printf("Linear Search → Index: %2d | Comparisons: %d%n", idx, count[0]);
        idx = binarySearch(sortedData, 8, count);
        System.out.printf("Binary Search → Index: %2d | Comparisons: %d%n", idx, count[0]);
    }
}