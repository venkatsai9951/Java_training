//Abstract classes and Interfaces

// private methods cannot be inherited and overridden it acts as new method when written in child class
// private methods don't have visibility whereas final methods are visible
abstract class Testing
{

    Testing()
    {
        System.out.println("This is a constructor for the abstract class");
    }
    abstract void sum(int a,int b);
    public void multiply()
    {
        System.out.println("THis is an actual method not an abstract method");
    }
}
class New1 extends Testing
{
    @Override
    void sum(int a , int b)
    {
        System.out.println(a+b);
    }

    @Override
    public void multiply() {
        System.out.println("THis is from the child class");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Testing t=new New1();
        t.sum(10,20);
        t.multiply();

    }
}
