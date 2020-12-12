public class classInt1 {
    protected int x = 4;
    public classInt1() {
        System.out.println("Hello My Class");
    }
    void even() {
        if (x % 2 == 0) {
            System.out.println("This number is even");
        } else
            System.out.println("This number is odd");
    }
}