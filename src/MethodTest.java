public class MethodTest {
    int sum(int a ,int b)  // Method declaration and Method Head
    {
        int c=a+b;    // Method Body
        return c;
    }
    static int sum(int a, int b, int c)
    {
        a=100;
        int d=a+b+c;

        return d;
    }

    public static void main(String[] args) {
        MethodTest m = new MethodTest();
        int d=m.sum(10,10);  // Method Call
        System.out.println(d);
        int e=sum(10,20,30);
        System.out.println(e);

    }
}
