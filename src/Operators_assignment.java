public class Operators_assignment {
    public static void main(String[] args) {
        if ((23==45)==true)
        {
            System.out.println("23 is  equal to 45");
        }
        else
        {
            System.out.println("23 is equal to 45");
        }
        int a=55;
        int b=70;
        System.out.println(a<50);
        System.out.println(a<b);
        int marks_eng=78;
        int marks_math=45;
        int marks_science=62;
        int sum=marks_science+marks_eng+marks_math;
        float avg=(float)sum/300;
        System.out.println("\nPercentage Marks: "+avg*100+"%");
        System.out.println("Total Marks: "+sum);
    }
}
