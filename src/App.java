import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int item = 0;
        Random random = new Random();

        while (item < 9) {
            item = random.nextInt(10) + 1;
            System.out.println("Item Nr. " + item);
        }

        System.out.println("Ende.");
    }
}