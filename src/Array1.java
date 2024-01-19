import java.util.*;
public class Array1 {
    public static void main(String[] args){
        System.out.println("Student Biodata");
        String name="Venkat";
        int age=22;
        float gpa=3.4f;
        char sex='M';
        double attendace_percentage=91.314d;
        boolean is_student=true;
        long mobile=3145678900L;
        System.out.println("Name: "+name);
        System.out.println("Age : "+age);
        System.out.println("Gpa : "+gpa);
        System.out.println("Sex : "+sex);
        System.out.println("Is a Student: "+is_student);
        System.out.println("Mobile: "+mobile);
        System.out.println("Attendance-Percentage: "+attendace_percentage);

        String [] students={"Venkat","Rohit","Sujith","Tharun","Bhanu","Lasya","Eesha","Adharsha","Siri","Abhishek"};
        System.out.println("First Student :-"+students[0]);
        System.out.println("Last Student :-"+students[students.length-1]);







//        String [] student1=new String[15]{"venkat","rohit","harshit"};


    }
}
