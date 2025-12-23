import java.util.Random;

public class Load_Rostics {
    public static void main(String[] args) {
        Random random = new Random();

        int i = 0;
        while (i < 10) {
            int load = random.nextInt(101);

            if (load > 85) {
                System.out.println("Крылышки в опасности! Нагрузка - " + load + "%");
            } else {
                System.out.println("Все в норме. Нагрузка - " + load + "%");
            }

            i++;
        }
    }
}

