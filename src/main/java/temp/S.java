package temp;

import java.util.ArrayList;
import java.util.Collections;

public class S {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList<>(5);
        ar.ensureCapacity(5);
        ar.add("Edward");
        ar.add("Den");
        ar.add("Jane");

        Collections.sort(ar, Collections.reverseOrder());
        System.out.println(ar);


        System.out.println(ar.hashCode());




        System.out.println(ar.size());
    }
    }

