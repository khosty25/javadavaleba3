import java.util.Random;
import java.util.Scanner;

public class classB2 {
    void array2() {
        int length = 12;
        Scanner input = new Scanner(System.in);

        Double[] numbers = new Double[12];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter number" + (i + 1));
            numbers[i] = Double.valueOf(input.next());
        }
        input.close();

        for (int i = 0; i < length; i++) {
            System.out.println("Number " + (i + 1) + "\n" + numbers[i]);
        }
    }

    void random2() {
        Random rd = new Random();
        int[] arr = new int[12];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(15);
            System.out.println(arr[i]);
        }
    }

    void index2() {
        double[] my_array = {5, 4, 6.2, 2, 3, 2, 7.2, 8, 11};
        int length = my_array.length;
        for (int i = 0; i < length; i++) {
            if (my_array[i] > 7) {
                System.out.println("The values more than 7\n" + my_array[i]);
            }
        }
        double maxmin = getMax(my_array);
        System.out.println("Difference of max and min:\n" + maxmin);

    }
    public int getMax(double[] inputArray){
        double maxValue = inputArray[0];
        double minValue = inputArray[0];
        for(int i=1; i< inputArray.length; i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
            else if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return (int) maxValue - (int) minValue;

    }
}