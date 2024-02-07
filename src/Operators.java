public class Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a=10;
        int b=5;

        System.out.println("\nPerforming Arithmetic Operations\n");
        System.out.println(a+b);

        System.out.println(a*b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a%b+"\n");

        // Unary Operators

        int c=5;
        int d=8;

        System.out.println("Performing Unary Operations \n");
        System.out.println("Post increment operator "+c++);

        System.out.println("pre increment operator "+ ++c);
        System.out.println("Post decrement operator "+d--);
        System.out.println("Pre decrement operator "+ --d+"\n");

        // Assignment Operations is nothing but assigning with = sign

        //Relational  Operators
        int e=100;
        int f=120;

        System.out.println("Performing Relational Operations\n");
        System.out.println(e>f);

        System.out.println(e>=f);
        System.out.println(e<f);
        System.out.println(e<=f);

        System.out.println(e==f);

        // Logical Operators
         boolean g=true;
         boolean h=false;

         System.out.println("\nOR Operator\n");
         System.out.println(g||h);
         System.out.println(g||g);
         System.out.println(h||h);
         System.out.println(h||g);
         System.out.println("\nAnd Operator\n");
         System.out.println(g&&h);
         System.out.println(g&&g);
         System.out.println(h&&h);
         System.out.println(h&&g);
         System.out.println("\nNOT Operator\n");
         System.out.println(!g);
         System.out.println(!h);





    }
}
