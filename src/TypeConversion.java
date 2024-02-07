import java.util.*;
public class TypeConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer");
        int a=sc.nextInt();
        String b=Integer.toString(a);
        System.out.println("Value after converting to string "+b+"\nEnter a String ");
        String c=sc.next();
        int d=Integer.parseInt(c);
        System.out.println("String after converting to integer is "+d+"\nEnter a String for Float Conversion");
        String e=sc.next();
        Float f=Float.parseFloat(e);
        System.out.println("String after converting it to float "+f+"\nEnter a double value for String Conversion");
        Double g=sc.nextDouble();
        System.out.println("Double after Converting it to string "+g);
    }
}
