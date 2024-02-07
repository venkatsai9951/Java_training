public class CommandLineInput {
    public static void main(String[] args) {
        System.out.println("The values entered in command line is ");
        String a=args[0];
        String b=args[1]; // command line inputs from args are always taken in string data type
        System.out.println(args[0]);
        System.out.println(args[1]);
        int aa=Integer.parseInt(args[0]);
        int bb=Integer.parseInt(args[1]);
        System.out.println("The command line values after converting them to integers and adding them");
        System.out.println(aa+bb);
        // wrapper class is used to convert string to other data types


    }
}
