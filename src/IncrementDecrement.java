public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        lives -= 1;
        System.out.println(lives); // 4

        lives--;
        System.out.println(lives); // 3

        lives++;
        System.out.println(lives); // 4

        int gift = 100 + ++lives;
        System.out.println(gift);

    }
}

