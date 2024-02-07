class Person1
{
    String name;
    int age;
    public Person1(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void printPersonDetails()
    {
        System.out.println("Name of Demo.Person is "+name);
        System.out.println("Age of Demo.Person is "+age+"\n");
    }
}

class Employee1
{
    private String empName;
    private int salary;
    private String JobTitle;
    public Employee1(String empName,int salary,String JobTitle)
    {
        this.empName=empName;
        this.salary=salary;
        this.JobTitle=JobTitle;

    }
    public void setEmployeeDetails(String empName,int salary,String JobTitle)
    {
        this.empName=empName;
        this.salary=salary;
        this.JobTitle=JobTitle;
    }
    public void getEmployeeDetails()
    {
        System.out.println("Name of the Demo.Employee is "+empName);
        System.out.println("Salary of the Demo.Employee is "+salary);
        System.out.println("Job Title of the Demo.Employee is "+JobTitle+"\n");
    }
    public void updateSalary(float percentage)
    {
        float x=percentage*salary/100;
        System.out.println("Salary is increased from "+salary+ " to "+((float)salary+x)+"\n");
    }
}

class TrafficLight
{
    String colour;
    int duration;
    public TrafficLight(String colour,int d)
    {
        this.colour=colour;
//        colour=colour;
        this.duration=d;
    }
    public void setter(String colour,int d)
    {
        this.colour=colour;
        this.duration=d;

    }
    public void getter()
    {
        System.out.println("Colour of the light is "+colour);
        System.out.println("Duration of the light is "+duration+"\n");
    }
    public void checkLight()
    {
        if (colour=="Red"|| colour=="RED"|| colour=="red")
        {
            System.out.println("Colour of light is RED\n");
        }
        else if (colour=="Green"|| colour=="GREEN"|| colour=="green")
        {
            System.out.println("Colour of light is GREEN\n");
        }
    }
}

class Demo1
{
    public void displayMessage()
    {
        System.out.println("This message is printed using a class");
    }
}

public class ObjectOrientedProgramming {
    public static void main(String[] args) {
        //Write a Java program to create a class called "Demo.Person" with a name and age attribute.
        // Create two instances of the "Demo.Person" class, set their attributes using the constructor, and print their name and age.
        Person1 p =new Person1("Venkat",22);
        p.printPersonDetails();
        Person1 p2 =new Person1("Sujith",24);
        p2.printPersonDetails();



        //3. Write a Java program to create a class called "Demo.Employee" with a name, job title, and salary attributes,
        // and methods to calculate and update salary.
        //Hint: The above class has three private attributes: name, jobTitle, and salary.
        // It has a constructor that initializes these attributes with the values passed as arguments.
        // aIt also has getter and setter methods to access and modify these attributes.
        //In addition, it provides methods for raising salaries by a certain percentage and printing employee information.
        Employee1 e=new Employee1("Sujith",20000,"Tech");
        e.getEmployeeDetails();
        e.setEmployeeDetails("Venkat",25000,"Tech Lead");
        e.getEmployeeDetails();
        e.updateSalary(10);



        //Write a Java program to create class called "TrafficLight" with attributes
        // for color and duration, and methods to change the color and check for red or green.
        //Hint : The above class has two private attributes: 'color' and 'duration'.
        // A constructor initializes these attributes with the values passed as arguments,
        // and getter and setter methods to access and modify these attributes.
        //It also has methods to change the 'color', and to check if the light is red or green.

        TrafficLight t=new TrafficLight("Red",10);
        t.setter("Green",12);
        t.getter();
        t.checkLight();
        t.setter("Red",14);
        t.getter();
        t.checkLight();


        // Write a java method to print message using a class

        Demo1 d= new Demo1();
        d.displayMessage();
    }


}
