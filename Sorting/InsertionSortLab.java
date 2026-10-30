// Orte, Rainan S
public class InsertionSortLab {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 1}; 
        int shifts = 0;
        int n = arr.length;
        
        System.out.println("Initial array: " + java.util.Arrays.toString(arr)); //uses array now not list or .get and .set
        
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                shifts++;
                j--;
            }
            arr[j + 1] = key;
            System.out.println("Step " + i + ": " + java.util.Arrays.toString(arr)); // Like easy sort animation again :D
        }
        
        System.out.println("Total shifts: " + shifts);
    }
}