public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelected = "Dark";

        switch (colorModeSelected) {
            case "Light":
                System.out.println("Light mode selected");
                break;
            case "Dark":
                System.out.println("Dark mode selected");
                break;
            case "Blue Dark":
                System.out.println("Blue Dark mode selected");
                break;
            case "Night":
                System.out.println("Night mode selected");
                break;
            default:
                System.out.println("Invalid mode selected");
        }
    }
}
