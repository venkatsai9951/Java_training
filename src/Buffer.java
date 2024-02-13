public class Buffer {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("Hello");
        s1.append("World");
        String s2="hello";
        s2.concat("world");
        System.out.println(s1);
        System.out.println(s2);


    }
}
