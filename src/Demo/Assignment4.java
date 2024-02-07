package Demo;
import Demo.OOPS1.*;
class Animal
{

    String name;
    int age;
    int a;

    public void printAnimalDetails(String name,int age)
    {
        System.out.println("Name of Demo.Animal is "+name);
        System.out.println("Age of Demo.Animal is "+age +"\n");

    }

}
class Car //car class
{

    boolean is_electric;
    String model;
    String colour;
    public void printCarDetails(String model,String colour,boolean is_electric)
    {
        System.out.println("\nThis car is a "+model);
        System.out.println("The colour of this car is "+colour);
        if (is_electric==true)
        {
            System.out.println("The car is electric\n");
        }
        else
        {
            System.out.println("The car is not electric\n");
        }
    }

}

class Person //Demo.Person class
{
    int age;
    char Sex;
    String name;
    public void printPersonDetails(String name,char sex,int age)
    {
        System.out.println("The name of the person is "+name);
        if (sex=='M')
        {
            System.out.println("The Demo.Person is a male");
        }
        else
        {
            System.out.println("This person is a female");
        }
        System.out.println(name+" is "+age+" old\n");
    }




}
class Employee   //Demo.Employee class
{
    String name;
    float salary;
    String company_name;

    public void printEmployeeDetails(String name,String company_name,float salary)
    {
        System.out.println("\nName of the Demo.Employee is "+name);
        System.out.println(name+" works for "+company_name);
        System.out.println("Salary of the Demo.Employee is "+salary +"\n");
    }

}
public class Assignment4 {
    public static void main(String[] args) {
        Employee  e=new Employee();
        e.printEmployeeDetails("Sujith","Infosys",25000);
        Car c=new Car();
        c.printCarDetails("Tesla","Red",true);
        Animal a=new Animal();
        a.printAnimalDetails("Jack",4);
        Person p=new Person();
        p.printPersonDetails("Venkat",'M',22);
        Person5 pp=new Person5("a",21);
        System.out.println(pp.age);

    }
}
