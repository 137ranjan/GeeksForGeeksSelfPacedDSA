import java.util.ArrayList;
import java.util.LinkedList;

public class MyHash {

    private int BUCKET;
    private ArrayList<LinkedList<Integer>> table;

    public MyHash(int b) {
        BUCKET = b;
        table = new ArrayList<LinkedList<Integer>>();
        for (int i = 0; i < b; i++) {
            table.add(new LinkedList<Integer>());
        }
    }

    public void insert(Integer key) {
        int i = key % BUCKET;
        table.get(i).add(key);
    }

    public boolean search(Integer key) {
        int i = key % BUCKET;
        return table.get(i).contains(key);
    }

    public void remove(Integer key) {
        int i = key % BUCKET;
        table.get(i).remove(key);
    }
}
