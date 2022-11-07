package dom;

public class TestError {

    public static void main(String args[])
    {
        int x;
        x = 2;
        {
            int y = 1;
            System.out.print(x + " " + y);
        }
//        System.out.println(x + " " + y);
    }
}
