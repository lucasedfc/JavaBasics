import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int response = 0;
        do {
            System.out.println("Select one option:");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response ) {
                case 0:
                    System.out.println("Ok Good Bye!");
                    break;
                case 1:
                    System.out.println("Movies selected!");
                    break;
                case 2:
                    System.out.println("Series selected");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (response != 0);
        System.out.println("Program finished!");
    }
}
