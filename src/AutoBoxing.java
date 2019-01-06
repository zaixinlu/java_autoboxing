public class AutoBoxing {

    public static void main(String[] args) {

        int     a = new Integer(66);
        Integer b = 18;

        Boolean flag  = true;
        boolean isBug = new Boolean(false);

        System.out.println(a + b);
        System.out.println(flag + " " + isBug);

    }

}
