import java.util.List;

public class Bubble {
    public static void main(String[] args){
        List<Integer> numbers = new java.util.ArrayList<>(List.of(
            12,31,32,12,45,21,13,14,12
        ));
        
        int n = numbers.size();

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(numbers.get(j) > numbers.get(j+1)){
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j+1));
                    numbers.set(j+1, temp);
                }
            }
        }

        System.out.println(numbers);
    }
}