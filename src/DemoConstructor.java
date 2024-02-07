public class DemoConstructor {
    public DemoConstructor()
    {
        System.out.println("This is a default constructor");
    }
    public DemoConstructor(String n,int salary, int age)
    {
        System.out.println("Name is "+n);
        System.out.println("Salary is "+salary);
        System.out.println("Age is "+age);

    }
    public static void main(String[] args) {
        DemoConstructor d= new DemoConstructor();
        DemoConstructor d1=new DemoConstructor("venkat",1000,10);

    }
}
