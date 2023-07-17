public class MyFirstGame {

    public static void main(String[] args) {
        int hiddenDigit = 56;
        int playerDigit = 20;
        while (playerDigit != hiddenDigit) {
            if (playerDigit < hiddenDigit) {
                System.out.println("Число " + playerDigit + ", меньше того, что загадал компьютер");
                playerDigit += 5;
            } else if (playerDigit > hiddenDigit) {
                System.out.println("Число " + playerDigit + ", больше того, что загадал компьютер");
                --playerDigit;
            }
        }
        System.out.print("Вы победили");
    }
}

