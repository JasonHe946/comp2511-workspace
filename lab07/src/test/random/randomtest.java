package random;

import java.util.Random;

public class randomtest {
    public static void main(String[] args) {
        Random random = new Random(2);
        for (int i = 0; i < 5; i++) {
            System.out.println(random.nextInt(100));
        }
    }
}
