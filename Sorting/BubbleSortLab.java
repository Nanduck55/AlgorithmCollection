//Orte, Rainan S

public class BubbleSortLab {
    public static void main(String[] args) {
        int[] arr = {7, 3, 6, 2}; 
        int swaps = 0, passes = 0;
        int n = arr.length;
        boolean swapped;
        
        System.out.println("Initial array: " + java.util.Arrays.toString(arr));
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            passes++;
            for (int j = 0; j < n - i - 1; j++) { //so this code used arr instead of List and .get() and .set()
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                    swapped = true;
                }
            }
            System.out.println("Pass " + passes + ": " + java.util.Arrays.toString(arr)); // just like easy sorts animation wow
            if (!swapped) break; 
        }
        
        System.out.println("Total swaps: " + swaps);
        System.out.println("Total passes: " + passes);
    }
}