import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class AutoBoxing {

    public static void main(String[] args) {

        int     a = new Integer(66);
        Integer b = 18;

        Boolean flag  = true;
        boolean isBug = new Boolean(false);

        out.println(a + b);
        out.println(flag + " " + isBug);

        List<String> hello = Arrays.asList("good", "nice", "A*");

        for (String string : hello)
            out.println(string);

        print("good", "nice", "A*");

        print(new String[] {"good", "nice", "A*"});

    }

    public static void print(String... strings) {
        for (String string : strings)
            out.println(string);
    }

}
