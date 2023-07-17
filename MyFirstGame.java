public class MyFirstGame {

    public static void main (String[] args) {
        int hiddenDigit = 56;
        int playerDigit = 99;
        while (playerDigit != hiddenDigit) {
            if (playerDigit < hiddenDigit) {
                ++playerDigit;
                System.out.println(playerDigit);
            } else if (playerDigit > hiddenDigit) {
                --playerDigit;
                System.out.println(playerDigit);
            }
        }
        System.out.println( playerDigit + " win");




    }

    }

