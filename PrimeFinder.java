import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFinder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>(limit - 1);
        for (int i = 2; i <= limit; i++){
            numbers.add(i);
        }
        
        for (int i = 2; i <= Math.sqrt(limit); i++){
            for (int j = 0; j < numbers.size(); j++){
                if (numbers.get(j) != i && numbers.get(j) % i == 0){
                    numbers.remove(j);
                }
            }
        }

        System.out.println(numbers);
        sc.close();
    }
}
