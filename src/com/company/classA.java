import java.util.Scanner;

public class classA {
    Scanner input = new Scanner(System.in);
    protected int a = input.nextInt();
    protected int b = input.nextInt();
    void sum1() {

        int sum = (a+b);
        System.out.print("sum is " + sum + '\n');
    }
    void mult1() {
        int mult = (a*b);
        System.out.print("multiplication is" +  mult + '\n');
    }
}