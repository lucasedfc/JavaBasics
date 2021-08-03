public class Functions {
    public static void main(String[] args) {
        double y = 3;
        // Circle Area: PI * RADIO E2
        System.out.println(circleArea(y));

        // 4PI * R2
        System.out.println(sphereArea(y));

        // (4/3)*PI * R3
        System.out.println(sphereVolume(y));

        System.out.println("PESOS TO DOLLAR at 03/08/2021: " + convertToDolar(95000, "MXN"));
    }

    public static double circleArea(double radio) {
        return Math.PI * Math.pow(radio,2);
    }

    public static double sphereArea(double radio) {
        return Math.PI * 4 * Math.pow(radio,2);
    }

    public static  double sphereVolume(double radio) {
        return (4/3) * Math.PI * Math.pow(radio, 3);
    }

    public static double convertToDolar(double quantity, String currency) {
        switch (currency) {
            case "ARS":
                quantity = quantity * 0.010;
                break;
            case "MXN":
                quantity = quantity * 0.050;
                break;
            case "COP":
                quantity = quantity * 0.00026;
                break;
        }
        return quantity;
    }

}
