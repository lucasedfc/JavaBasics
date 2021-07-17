public class Exercise02 {
    public static void main(String[] args) {
        char c = 'z';
        int cI = (int) c;
        System.out.println(cI);

        int i1 = 250;
        short iS = (short) i1;
        long iL = (long) iS;

        System.out.println(iS);
        System.out.println(iL);

        double d = 301.067; // conviertelo a long
        long dL = (long) d;
        System.out.println(dL);

        int i2 = 100;
        long i2L = (long) (i2 + 301.067);
        System.out.println(i2L);

        int i3 = 737;
        byte i3B = (byte) (i3 * 100);
        System.out.println(i3B);

        double d2 = 298.638;
        long d2L =  (long) (d2 / 25);
        System.out.println(d2L);
}
}