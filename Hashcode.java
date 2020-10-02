
public class Hashcode {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("abc");
        s.append("xyz");
        System.out.println(s);
        System.out.println(s.hashCode());
        s.append(1);
        System.out.println(s);
        System.out.println(s.hashCode());
    }
}
