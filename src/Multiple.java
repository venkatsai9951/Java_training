interface Animal1
{
    public void eat();
    public void makeSound();
}
interface Vehicle
{
    void start();
    void move();
}
class Dog implements Animal1,Vehicle{
    Dog()
    {
        System.out.println("This is a dog class");
    }
    @Override
    public void makeSound()
    {
        System.out.println("Barking");
    }
    @Override
    public void eat()
    {
        System.out.println("Eating");
    }
    @Override
    public void start()
    {
        System.out.println("dog helped start the car");
    }
    @Override
    public void move()
    {
        System.out.println("Dog helped move the car");
    }
}
public class Multiple
{
    public static void main(String[] args) {
    Animal1 a= new Dog();
    a.eat();
    a.makeSound();
    Vehicle v=new Dog();
    v.move();
    v.start();




    }
}
