public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        System.out.println("a es igual a b?  => " + (a == b));
        System.out.println("a es diferente a b? => " + (a != b));

        // Relational Operator

        System.out.println("a is greater than b => " + (a > b));
        System.out.println("a is less than b => " + (a < b));
        System.out.println("a is greater or equals b => " + (a >= b));
        System.out.println("a is less or equals b => " + (a <= b));

        if(a == b) {
            System.out.println("A equals B");
        } else if((a != b) && (a > b)) {
            System.out.println("A es different a B");
        }else if( a > b) {
            System.out.println("A is greater than B");
        }else if(a < b) {
            System.out.println("A is less than B");
        }else if(a >= b) {
            System.out.println("A is greater or equals B");
        }else if(a <= b) {
            System.out.println("A is less or equals B");
        }
    }
}
