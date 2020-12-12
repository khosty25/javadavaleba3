public class classInt4 {
    protected int x = 3;
    protected int y = 3;

    public classInt4() {
        System.out.println("Hello My Class");
    }
    void first4() {
        if(x>0){
            System.out.println(4*x-y);
        }
        else if(x == 0){
            System.out.println(4*x+y);
        }
    }
    void second4() {
        if(y>0){
            System.out.println(4*x+y);
        }
        else if(y == 0){
            System.out.println(2*x-y);
        }
    }

}