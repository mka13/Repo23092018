import java.util.Comparator;

public class valueComparator implements Comparator<StatystykiZawodnika> {

    @Override
    public int compare(StatystykiZawodnika o1, StatystykiZawodnika o2) {
        return (int) (o2.obliczanieWartosci()-o1.obliczanieWartosci());
    }
}
