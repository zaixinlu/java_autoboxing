import static java.lang.System.out;

public class AutoBoxing {

    public static void main(String[] args) {

        int     a = new Integer(66);
        Integer b = 18;

        Boolean flag  = true;
        boolean isBug = new Boolean(false);

        out.println(a + b);
        out.println(flag + " " + isBug);

    }

}
