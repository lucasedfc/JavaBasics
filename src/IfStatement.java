public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSent = 3;

        if (isBluetoothEnabled) {
            fileSent++;
            System.out.println("File Sent");
            int i = 0;
            i++;
        } else {
            fileSent--;
            System.out.println("Please activate Bluetooth!");
        }

        System.out.println(isBluetoothEnabled);
        System.out.println(fileSent);
    }
}
