import java.util.*;
import java.io.*;
public class CollectionsFrame {
    public static void main(String[] args) {
        List <Integer> list1=new ArrayList<Integer>();
        ArrayList list2= new ArrayList();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            if(i%2==0) {
                list1.add(0);
            }
            else {
                list1.add(1);
            }
        }
        System.out.println(list1);
        list1.remove(8);
        System.out.println(list1);
//        list1.removeAll(List.of(1,0));
//        System.out.println(list1);
        System.out.println(list1.indexOf(1));
        System.out.println(list1.indexOf(1));
        System.out.println(list1.isEmpty());
        System.out.println(list1.size());
        System.out.println(list1.lastIndexOf(1));
        System.out.println(list1.contains(1));
        list2.add("harsha");
        list2.add(10);
        System.out.println(list2);

    }
}
