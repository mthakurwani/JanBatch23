public class TestMain {

    public static void main(String args[])
    {
         int x = 10;
        int y = 20;
        int z;

        System.out.println("Values before swapping");
        System.out.println("X :"+x);
        System.out.println("Y :"+y);

        System.out.println();
        System.out.println("Values after swapping");
        z = x;
        x = y;
        y = z;

        System.out.println("X: "+x);
        System.out.println("Y :"+y);


        // x=20, y=10

    }
}
