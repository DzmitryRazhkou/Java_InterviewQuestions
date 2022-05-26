package temp;

import java.util.*;

public class FZ {
    public static void main(String[] args) {
        Integer[] numbers = {1, 5, 5, 89, 15, 12, 15, 5, 12, 55, 99, 12, 75, 75, 12};

        duplicate(numbers);
    }

    public static void duplicate(Object[] object) {
        Set<Object> set = new HashSet<>();
        for (Object s : object) {
            set.add(s);
        }
        set.forEach(x -> System.out.println(x));

    }
}

