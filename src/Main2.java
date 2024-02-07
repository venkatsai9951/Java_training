class Person2 {
    private String firstName;
    private String lastName;
    public Person2(String firstName,String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
}
class Employee3 extends Person2
{
    private int empId;
    private String jobTitle;
    public Employee3(String firstName,String lastName,int empId,String jobTitle)
    {
        super(firstName,lastName);
        this.empId=empId;
        this.jobTitle=jobTitle;
    }
    public int getEmpId()
    {
        return empId;
    }
    @Override
    public String getLastName()
    {
        return (super.getLastName()+jobTitle);
    }
}
public class Main2
{
    public static void main(String[] args) {
        Employee3 e1=new Employee3("Venkat","sai",9951,"Lead");
        System.out.println(e1.getFirstName()+e1.getLastName());
        Person2 p2=new Person2("Venkat","sai");

    }


}
