public class Buffer {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("Hello");
        s1.append("World");
        String s2="hello";
        s2.concat("world");
        System.out.println(s1);
        System.out.println(s2);
        String s="Java is my world";
        String[] sp=s.split(" ");

        String a="";
        for (int j=0;j<sp.length;j++)
        {
            String sn=sp[j];
            for (int i=sn.length()-1;i>=0;i--)
            {
                a=a+(sn.charAt(i));
            }
            a=a+" ";

        }

        System.out.println(a);

    }
}
