package Demo;
class Person5
{
    String name;
    int age;
    Person5(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
}
class Dog2
{
    private String name;
    private String breed;
    Dog2(String name,String breed)
    {
        this.name=name;
        this.breed=breed;
    }
    void setName(String name)
    {
        this.name=name;

    }
    void setBreed(String breed)
    {
        this.breed=breed;
    }
    void getter()
    {
        System.out.println(name);
        System.out.println(breed);

    }
}
public class OOPS1 {
    public static void main(String[] args) {
        Person5 p1=new Person5("Sujith",21);
        Person5 p2=new Person5("Venkat",19);
        System.out.println(p1.name);
        System.out.println(p2.name);

        //Second
        Dog2 d1=new Dog2("AA","BB");
        d1.getter();
        d1.setBreed("CC");
        d1.setName("DD");
        d1.getter();

    }
}
