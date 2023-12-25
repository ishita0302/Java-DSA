import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> l= new ArrayList<Integer>();
        l.add(0);
        l.add(78);
        System.out.println(l);
        int c=l.get(0);
        System.out.println(c);
        l.add(1,67);        //to add in between
        l.set(0,90);        //to set an index value
        //l.remove(index)
        //l.size()
        Collections.sort(l);
        System.out.println(l);
    }
}
