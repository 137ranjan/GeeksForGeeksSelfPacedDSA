import java.util.Comparator;

public class IntervalComparator implements Comparator<Interval> {
    @Override
    public int compare(Interval i1, Interval i2) {
        if (i1.getStart() < i2.getStart()) {
            return -1;
        } else if (i2.getStart() > i2.getStart()) {
            return 1;
        } else {
            return 0;
        }
    }
}
