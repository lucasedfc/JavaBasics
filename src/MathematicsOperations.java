public class MathematicsOperations {

    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        System.out.println(Math.ceil(x));
        System.out.println(Math.floor(x));
        System.out.println(Math.pow(x,y));
        System.out.println(Math.max(x,y));
        System.out.println((int)Math.sqrt(y));

        // Circle Area: PI * RADIO E2
        System.out.println(Math.PI * Math.pow(y,2));

        // 4PI * R2
        System.out.println(Math.PI * 4 * Math.pow(y,2));

        // (4/3)*PI * R3
        System.out.println((4/3) * Math.PI * Math.pow(y, 3));
    }
}
