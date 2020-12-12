import java.util.Arrays;
import java.util.List;

public class classInt3 {
    protected int a;
    protected int b = 30;
    protected int x = 50;

    public classInt3() {

    }
    public classInt3(int a, int b) {
        this.a = a;//initialize
        this.b = b;
    }
    void first(){
        Integer[] myArray = new Integer[]{a,b};
        List<Integer> list = Arrays.asList(myArray);
        if(a < b){
            System.out.println("Array has interval between a and b");
        }
        else
            System.out.println("Array has no interval between a and b");

    }
    void second(){
        if(x > a && a < b){
            System.out.println("A is between of " + a + " and " + b);
        }
        else
            System.out.println("A is not between of" + a + " and " + b);
    }
}