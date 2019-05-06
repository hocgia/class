import java.util.Comparator;

public class NameComparator implements Comparator<PhoneNumber> {

    @Override
    public int compare(PhoneNumber o1, PhoneNumber o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
