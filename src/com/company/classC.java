import java.util.Scanner;

public class classC {
    Scanner input = new Scanner(System.in);
    protected int a = input.nextInt();
    protected int b = input.nextInt();
    protected int c = input.nextInt();

    public int last1() {
        int lastnum = a%10;
        System.out.println("Last digit of the number \n" + lastnum);
        return lastnum;

    }
    public int first1() {
        while (b >= 10)
            b /= 10;
        System.out.println("First digit of the number \n" + b);
        return b;
    }
    void  sum2() {
        int sum = 0;
        while (c > 0){
            sum = sum + c%10;
            c = c / 10;
        }
        System.out.println( "Sum of the digits of third number \n " + sum);
    }
    void mult2(){
        System.out.println("multiplication of the first and the second \n" + (first1() * last1()));
    }
}