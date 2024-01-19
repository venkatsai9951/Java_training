import java.util.Scanner;

public class Input_assignment {
    public static void main(String[] args) {
        //Question 1
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value: ");
        int inches=sc.nextInt();
        System.out.println(inches+" inches is equal to "+inches*0.0254+" meters\n");

        //Question 2
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        System.out.println("Power of a number "+n+"is equal to "+(n*n));
        System.out.println("Qube of a number "+n+"is equal to "+(n*n*n));
        System.out.println("Forth Power of a number "+n+"is equal to "+(n*n*n*n));

        //Question 3

        System.out.println("Enter the first number :");
        int a=sc.nextInt();
        System.out.println("Enter the second number :");
        int b=sc.nextInt();
        System.out.println("Enter the third number :");
        int c=sc.nextInt();
        System.out.println("Enter the fourth number :");
        int d=sc.nextInt();

        if(a==b && b==c && c==d)
        {
            System.out.println("All the entered numbers are equal");
        }
        else
        {
            System.out.println("Entered numbers are not equal ");
        }

        // Question 4
        System.out.println("Enter the number");
        int x=sc.nextInt();
        if (x%2==0)
        {
            System.out.println("The entered number is even");
        }
        else
        {
            System.out.println("The entered number is odd");
        }


    }
}
