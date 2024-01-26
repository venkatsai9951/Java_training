import java.util.Scanner;

public class FlowControl {
    public static void main(String[] args) {
        String [] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
        Scanner sc=new Scanner(System.in);
        // print the month based on number
        System.out.println("Enter a value between 1 and 12 for the month ");
        int m=sc.nextInt();
        if (m>=1 && m<=12)
        {
            System.out.println(months[m-1]+"\n");
        }
        else
        {
            System.out.println("Enter a valid number in between 1 and 12\n");
        }
        //print 4th table
        int n=4;

        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" * "+i+" = "+(int)(n*i));
        }

        // even odd sum
        
        int even_sum=0;
        int odd_sum=0;
        for (int i=0;i<=19;i++)
        {
            if (i%2==0)
            {
                even_sum+=i;
            }
            else
            {
                odd_sum+=i;
            }
        }
        System.out.println("\nthe sum of first 10 even number is"+even_sum);
        System.out.println("the sum of first 10 odd number is\n"+odd_sum);

        //Factorial

        System.out.println("Input a number to find the factorial ");
        int fact=sc.nextInt();
        int d=fact;
        int s=1;
        while(fact>=1)
        {
            s*=fact;
            fact--;
        }
        System.out.println("Factorial of a given number "+d +" is "+s);

        //prime number or not
        System.out.println("\nEnter a number to check whether it is a prime or not");
        int prime=sc.nextInt();
        int count=0;
        for (int i=1;i<=prime;i++)
        {
            if (prime%i==0)
            {
                count++;
            }
        }
        if (count%2==0)
        {
            System.out.println("Given number is a prime");
        }
        else
        {
            System.out.println("It is not a prime number");
        }

    }
}
