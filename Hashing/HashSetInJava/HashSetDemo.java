import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        h.add("gfg");
        h.add("courses");
        h.add("ide");

        System.out.println(h);

        System.out.println(h.contains("ide"));

        Iterator<String> i = h.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        h.remove("ide");
        System.out.println(h.size());
        for (String string : h) {
            System.out.print(string + " ");
        }
        System.out.println(h.isEmpty());
        h.clear();
        System.out.println(h.size());
        System.out.println(h.isEmpty());
    }
}