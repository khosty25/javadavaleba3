import java.util.Random;
import java.util.Scanner;

public class classA2 {
    void array1() {
        int length = 10;
        Scanner input = new Scanner(System.in);

        String[] numbers = new String[10];
        for(int i = 0; i < length; i++){
            System.out.println("Enter number" + (i+1));
            numbers[i] = input.next();
        }
        input.close();

        for(int i = 0; i < length; i ++){
            System.out.println("Number "+ (i+1) + "\n" + numbers[i]);
        }
    }
    void random1() {
        Random randInt = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randInt.nextInt(15);
            System.out.println("Random number " + (i+1) + "\n"  + arr[i]);
        }
    }
    void index1() {

        int[] my_array = { 58, 69, 88, 2, 5, 1024, 1 };
        int length = my_array.length;
        for (int i = 0; i < length; i++) {
            if(my_array[i] < i) {
                int sum = 0;
                sum += my_array[i = i+i];
                System.out.print("Sum is :\n" + sum);

            }
        }
    }
}