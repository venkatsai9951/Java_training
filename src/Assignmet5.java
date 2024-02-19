import java.util.*;
import java.io.*;
public class Assignmet5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sentence to find the number of words");
        String s=sc.nextLine();
        String[] words_count=new String[100];
        words_count=s.split(" ");
        System.out.println("The number of words in a sentence are "+words_count.length+"\n");
        System.out.println("Enter a string to check if it is palindrome or not");
        String s1=sc.nextLine();
        String s2="";
        for (int i=s1.length()-1;i>=0;i--)
        {
            s2+=s1.charAt(i);
        }
        if (s1.equals(s2))
        {
            System.out.println("The entered string is a palindrome\n");
        }
        else
        {
            System.out.println("The entered string is not a palindrome\n");
        }
        System.out.println("Enter the string to find sum of digits");
        String s3=sc.nextLine();
        System.out.println(s3);

        int sum=0;
        for(int i=0;i<s3.length();i++)
        {
            Character c=s3.charAt(i);
            if(Character.isDigit(s3.charAt(i)))
            {
                sum+=Character.getNumericValue(s3.charAt(i));
            }
        }
        if (sum!=0)
        {
            System.out.println(sum+"\n");
        }
        else
        {
            System.out.println("There are no digits in the string\n");
        }


    }
}
