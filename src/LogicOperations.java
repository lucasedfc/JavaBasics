public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        System.out.println("a es igual a b?  => " + (a == b));
        System.out.println("a es diferente a b? => " + (a != b));

        // Relational Operator

        System.out.println("a es mayor que b => " + (a > b));
        System.out.println("a es menor que b => " + (a < b));
        System.out.println("a es mayor o igual que b => " + (a >= b));
        System.out.println("a es menor o igual que b => " + (a <= b));

        if(a == b) {
            System.out.println("A es igual a B");
        } else if((a != b) && (a > b)) {
            System.out.println("A es diferente a B");
        }else if( a > b) {
            System.out.println("A es mayor a B");
        }else if(a < b) {
            System.out.println("A es menor a B");
        }else if(a >= b) {
            System.out.println("A es mayor igual a B");
        }else if(a <= b) {
            System.out.println("A es menor igual a B");
        }
    }
}
