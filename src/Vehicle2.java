class Vehicle2 {
    public void drive()
    {
        System.out.println("the car is being driven");
    }

}
class Car2 extends Vehicle2
{
    @Override
    public void drive()
    {
        System.out.println("Repairing a Demo.Car");
    }
}
class Employee2
{
    public void work()
    {
        System.out.println("The Demo.Employee is working ");
    }
    public void getSalary()
    {
        System.out.println("The salary is credited to the employee account");
    }

}
class HrManager extends Employee2
{
    @Override
    public void work()
    {
        System.out.println("The HR Manager is working");
    }
    public void addEmployee()
    {
        System.out.println("A New employee is added");
    }
}
class BankAccount
{
    int balance;
    public void deposit(int amount)
    {
        balance=balance+amount;
        System.out.println(balance);
    }
    public void withdraw(int amount)
    {
        balance-=amount;
        System.out.println(balance);
    }

}
class SavingsAccount extends BankAccount
{
    @Override
    public void withdraw(int amount)
    {
        int x=balance;
        if(balance-amount<100)
        {
            System.out.println("Withdrawl cannot be done as balance will be less than 100");
        }
        else {
            balance-=amount;
            System.out.println(balance);
        }
    }
}
class Demo3
{
    public static void main(String[] args) {
        Vehicle2 v=new Vehicle2();
        v.drive();
        Car2 c =new Car2();
        c.drive();
        SavingsAccount s= new SavingsAccount();
        s.deposit(10000);
        System.out.println(s.balance);
        s.withdraw(10000);
        System.out.println(s.balance);
        s.withdraw(9800);

    }
}