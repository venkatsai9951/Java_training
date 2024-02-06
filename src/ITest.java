class Employee5 implements Cloneable
{
    private String name;
    private String Address;
    private int empId;
    Employee5(String name,String Address,int empId)
    {
        this.name=name;
        this.Address=Address;
        this.empId=empId;

    }
    public Object Clone() throws CloneNotSupportedException{
        return super.clone();
}


}
public class ITest {
    public static void main(String[] args) throws CloneNotSupportedException{
        Employee5 e1=new Employee5("Sujith","735 teal dr",112);
        Employee5 e2=(Employee5) e1.clone();
        System.out.println(e2.name);

    }
}
