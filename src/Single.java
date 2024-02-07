public class Single {
    public int roll_no;
    void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    static void diff(int a,int b)
    {
        System.out.println(a-b);
    }
    void multiplication(int a,int b)
    {
        System.out.println("This is in child class");
        System.out.println(a*b);
    }

}

class B extends Single
{
    @Override  void sum(int a,int b)
    {
        System.out.println(a+a+b);
    }
//    @Override static void diff(int a ,int b)
//    {
//        System.out.println("Overridden method diff");
//    }  Static method cannot be overridden

    void multiplication(int a,int b)
    {
        System.out.println("This is in child class");
        System.out.println(a*b*10);
    }
    public static void main(String[] args) {
        Single s=new Single();
        s.sum(4,5);
        diff(10,4);
        s.diff(10,2);
        System.out.println(s.roll_no);
        B b=new B();
        System.out.println(b.roll_no);
        b.sum(4,5);
        b.diff(5,1);
        s.multiplication(10,20);




    }



}
