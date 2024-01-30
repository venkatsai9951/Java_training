import java.util.*;
public class Roman {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        s=s.toUpperCase();
        String[] r={"I","V","X","L","C","D","M"};
        int[] v={1,5,10,50,100,500,1000};
        int sum=0;
        int c=0;
        for (int i=s.length()-1;i>=0;i--)
        {
            System.out.println(s.charAt(i));
            if(s.charAt(i)=='I')
            {
                c+=1;
            }
            if(s.charAt(i)=='V')
            {
                c+=5;
            }
            if(s.charAt(i)=='X')
            {
                c+=10;
            }
            if(s.charAt(i)=='L')
            {
                c+=50;
            }
            if(s.charAt(i)=='C')
            {
                c+=100;
            }
            if(s.charAt(i)=='D')
            {
                c+=500;
            }
            if(s.charAt(i)=='M')
            {
                c+=1000;
            }


        }
        System.out.println(c);
        //first validity
        // then code

    }
}
