interface Shape2
{
    public abstract void getArea(); //void getArea() both are equal

}
class Rectangle1 implements Shape2
{
    int l,b;
    Rectangle1(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    @Override
    public void getArea()
    {
        System.out.println(l*b);
    }
}
class Circle1 implements Shape2
{
    int r;
    Circle1(int r)
    {
        this.r=r;
    }
    public void getArea()
    {
        System.out.println(3.14*r*r);
    }
}

class Triangle1 implements Shape2
{
    private float a,b,c;
    Triangle1(float a,float b, float c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Override
    public void getArea()
    {
        float s=(a+b+c)/2;
        float area=Math.abs((s-a)*(s-b)*(s-c));
        System.out.println("Area Of Triangle "+Math.sqrt(s*area));
    }
}

public class Inherit1 {
    public static void main(String[] args) {
        Shape2 c=new Circle1(10);
        c.getArea();
        Shape2 t =new Triangle1(10,10,10);
        t.getArea();
        Shape2 r=new Rectangle1(10,20);
        r.getArea();
    }
}
