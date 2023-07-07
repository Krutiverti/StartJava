public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int firstDigit = -10;
        int evenSum = 0;
        int oddSum = 0;
        while (firstDigit <= 21) {
            if (firstDigit % 2 == 0) {
                evenSum += firstDigit;
            } else {
                oddSum += firstDigit;
            }
            firstDigit++;
        }
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + evenSum + "," +
                " а нечетных = " + oddSum + ".\n");

        System.out.println("2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = -1;
        int num3 = 5;
        int min = 0;
        int max = 0;
        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num2 < num3) {
            min = num2;
        } else {
            min = num3;
        }
        if (num2 > num1 && num2 > num3) {
            max = num2;
        } else if (num1 < num3) {
            min = num1;
        } else {
            min = num3;
        }
        if (num3 > num1 && num3 > num2) {
            max = num3;
        } else if (num1 < num2) {
            min = num1;
        } else {
            min = num2;
        }
        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int a = 1234;
        int sumA = 0;
        System.out.print("Исходное число в обратном порядке: ");
        while (a > 0) {
            sumA = sumA + (a % 10);
            System.out.print(a % 10);
            a = a / 10;
        }
        System.out.println("\nСумма цифр в числе: " + sumA + "\n");

        System.out.println("4. Вывод чисел на консоль в несколько строк");
        int maxI =24;
        for (int i = 1; i < maxI; i++) {
            System.out.printf("%3d", i);
            i++;
            if (i % 5 == 0) {
                System.out.println();
            }
        }
        int addZero = maxI / 2 % 5;
        if (addZero != 0) {
            for (int i = 5; i > addZero; i--) {
                System.out.printf("%3d", 0);
            }
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
        int numWithTwo = 3242592;
        System.out.print("Число " + numWithTwo + " содержит ");
        int countTwo = 0;
        while (numWithTwo > 0) {
            if (numWithTwo % 10 == 2) {
                countTwo++;
                }
            numWithTwo = numWithTwo / 10;
            }
        String evenOrOdd = "";
        if (countTwo % 2 == 0) {
            evenOrOdd = " (четное) ";
        } else {
            evenOrOdd = " (нечетное) ";
        }
            System.out.print(countTwo + evenOrOdd + "количество двоек\n");

        System.out.println("6. Отображение фигур в консоли");
        for (int i = 0; i < 5 ; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        int triangleSide = 5;
        while (triangleSide > 0) {
           int triangleSide2 = triangleSide;
            while (triangleSide2 > 0) {
                triangleSide2--;
                System.out.print("#");
            }
            System.out.println();
            triangleSide--;
        }

        int halfBase1 = 0;
        do {
            int cathetAB = 0;
            System.out.println();
            halfBase1++;
            do {
                System.out.print("$");
                cathetAB++;
            } while (cathetAB < halfBase1);
        } while (halfBase1 < 3);
        int halfBase2 = 2;
        do {
            int cathetBC = 2;
            System.out.println();
            halfBase2--;
            do {
                System.out.print("$");
                cathetBC--;
            } while (cathetBC == halfBase2);
        } while (halfBase2 > 0);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("символы, идущие до цифр и имеющие нечетные коды");
        char symbol = 0;
        for (symbol = 33; symbol < 48; symbol++) {
            if ( symbol % 2 != 0) {
                System.out.printf("%3c\n", symbol);
            }
        }
        System.out.println("маленькие английские буквы, имеющие четные коды");
        int smallLetter = 0;
        for (smallLetter = 97; smallLetter < 123; smallLetter++) {
            if ( smallLetter % 2 == 0) {
                System.out.printf("%3c\n", smallLetter);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int trueDigit = 1234321;
        int reverseDigit = 0;
        for (int i = trueDigit; i > 0 ; i /= 10) {
            reverseDigit = reverseDigit * 10 + i % 10;
        }
        if (reverseDigit == trueDigit) {
            System.out.println("число " + trueDigit + " является палиндромом\n");
        } else {
            System.out.println("число " + trueDigit + " не является палиндромом\n");
        }

        System.out.println("9. Определение, является ли число счастливым");
        int happyValue = 452371;
        int firstHalfValue = 0;
        for (int i = happyValue % 1000; i > 0  ; i /= 10) {
            firstHalfValue = firstHalfValue + i % 10;
        }
        int secondHalfValue = 0;
        for (int i = happyValue / 1000; i > 0  ; i /= 10) {
            secondHalfValue = secondHalfValue + i % 10;
        }
        System.out.println("Сумма цифр " + happyValue % 1000 + " = " + firstHalfValue);
        System.out.println("Сумма цифр " + happyValue / 1000 + " = " + secondHalfValue);
        if (firstHalfValue == secondHalfValue) {
            System.out.println("Число: " + happyValue + " Является счастливым\n");
        } else {
            System.out.println("Число: " + happyValue + " не является счастливым\n");
        }

        System.out.println("10. Вывод таблицы умножения Пифагора");
        System.out.print(" |");
        for (int i = 2; i < 10 ; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        for (int i = 1; i < 14; i++) {
            System.out.printf("%2c", '_');
        }
        System.out.println();
        for (int i = 2; i < 10; i++) {
            System.out.print(i + "|");
            for (int j = 2; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }





    }
}