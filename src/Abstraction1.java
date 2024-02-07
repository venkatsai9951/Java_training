abstract class Shape
{
    abstract void calculateArea();
    abstract void calculatePerimeter();
}
abstract class Animal4
{
    abstract void eat();
    abstract void sleep();
}
abstract class Person4
{
    abstract void eat();
    abstract void excercise();

}
class Circle extends Shape
{
    private float r;
    Circle(float r)
    {
        this.r=r;
    }
    @Override
    public void calculateArea()
    {
        System.out.println("Area Of Triangle "+3.14*r*r);
    }
    @Override
    public void calculatePerimeter()
    {
        System.out.println("Perimeter of Triangle "+2*3.14*r);
    }
}
class Triangle extends Shape
{
    private float a,b,c;
    Triangle(float a,float b, float c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public void calculateArea()
    {

        float s=(a+b+c)/2;
        float area=Math.abs((s-a)*(s-b)*(s-c));
//        System.out.println(area);
//        System.out.println(s);
        System.out.println("Area Of Triangle "+Math.sqrt(s*area));
    }
    public void calculatePerimeter()
    {
        System.out.println("Perimeter Of Triangle "+a+b+c);
    }
}
class Lion extends Animal4
{
    @Override
    public void eat()
    {
        System.out.println("Lion is eating");
    }
    @Override
    public void sleep()
    {
        System.out.println("Lion is sleeping");
    }
}
class Deer extends Animal4
{
    @Override
    public void eat()
    {
        System.out.println("Deer is eating");
    }
    @Override
    public void sleep()
    {
        System.out.println("Deer is sleeping");
    }

}

class Tiger extends Animal4
{
    @Override
    public void eat()
    {
        System.out.println("Tiger is eating");
    }
    @Override
    public void sleep() {
        System.out.println("Tiger is sleeping");
    }
}
class Athlete extends Person4
{
    @Override
    public void eat()
    {
        System.out.println("The Athlete is on a proper diet ");
    }
    @Override
    public void excercise()
    {
        System.out.println("The Athlete is exercising daily");

    }
}
class LazyPerson extends Person4
{
    public void eat()
    {
        System.out.println("The Lazy person is eating whatever he wants");
    }
    @Override
    public void excercise()
    {
        System.out.println("The Lazy person is sleeping rather than exercising daily");

    }

}
public class Abstraction1 {
    public static void main(String[] args) {
        Shape a=new Circle(10);
        a.calculateArea();
        a.calculatePerimeter();
        Shape b=new Triangle(10,30,30);
        b.calculatePerimeter();
        b.calculateArea();
        Person4 Ath=new Athlete();
        Ath.eat();
        Ath.excercise();
        Person4 Laz=new LazyPerson();
        Laz.eat();
        Laz.excercise();
        Animal4 one=new Lion();
        one.eat();
        one.sleep();
        Animal4 two=new Deer();
        two.eat();
        two.sleep();
        Animal4 three=new Tiger();
        three.sleep();
        three.eat();
    }
}
