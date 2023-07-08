public class CyclesTheme {

    public static void main(String[] args) {
        //1. Подсчет суммы четных и нечетных чисел
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;
        while (counter <= 21) {
            if (counter % 2 == 0) {
                sumEven+= counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        }
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEven + "," +
                " а нечетных = " + sumOdd + ".\n");

        //2. Вывод чисел в интервале (min и max) в порядке убывания
        System.out.println("2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = -1;
        int num3 = 5;
        int min = num1;
        if (num2 < min && num2 < num3) {
            min = num2;
        } else {
            min = num3;
        }
        int max = num2;
        if (num1 > max && num1 > num3) {
            max = num1;
        } else {
            max = num3;
        }
        for (int i = ++min; i < max; ++i) {
            System.out.print(i + " ");
        }

        //3. Вывод реверсивного числа и суммы его цифр
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int baseDigit = 1234;
        int sumDigit = 0;
        System.out.print("Исходное число в обратном порядке: ");
        while (baseDigit > 0) {
            int reverseStep = baseDigit % 10;
            sumDigit = sumDigit + (reverseStep);
            System.out.print(reverseStep);
            baseDigit /= 10;
        }
        System.out.println("\nСумма цифр в числе: " + sumDigit+ "\n");

        //4. Вывод чисел на консоль в несколько строк
        System.out.println("4. Вывод чисел на консоль в несколько строк");
        int endOfSection = 24;
        int stringTransfer = 0;
        for (int i = 1; i < endOfSection; i += 2) {
            System.out.printf("%3d", i);
            stringTransfer++;
            if (stringTransfer % 5 == 0) {
                System.out.println();
            }
        }
        int addZero = endOfSection / 2 % 5;
        if (addZero != 0) {
            for (int i = 5; i > addZero; i--) {
                System.out.printf("%3d", 0);
            }
        }

        //5. Проверка количества двоек на четность/нечетность
        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
        int workNum = 3242592;
        System.out.print("Число " + workNum + " содержит ");
        int countTwos = 0;
        while (workNum > 0) {
            if (workNum % 10 == 2) {
                countTwos++;
            }
            workNum /= 10;
        }
        String evenOrOdd = "";
        if (countTwos % 2 == 0) {
            evenOrOdd = " (четное) ";
        } else {
            evenOrOdd = " (нечетное) ";
        }
        System.out.print(countTwos + evenOrOdd + "количество двоек\n");

        //6. Отображение фигур в консоли
        System.out.println("\n6. Отображение фигур в консоли");
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

        //7. Отображение ASCII-символов
        System.out.println("\n\n7. Отображение ASCII-символов");
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

        //8. Проверка, является ли число палиндромом
        System.out.println("\n8. Проверка, является ли число палиндромом");
        int workDigit = 1234321;
        int reverseDigit = 0;
        for (int i = workDigit; i > 0 ; i /= 10) {
            reverseDigit = reverseDigit * 10 + i % 10;
        }
        if (reverseDigit == workDigit) {
            System.out.println("число " + workDigit + " является палиндромом\n");
        } else {
            System.out.println("число " + workDigit + " не является палиндромом\n");
        }

        //9. Определение, является ли число счастливым
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

        //10. Вывод таблицы умножения Пифагора
        System.out.println("10. Вывод таблицы умножения Пифагора");
        System.out.print(" |");
        for (int i = 2; i < 10 ; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        for (int i = 1; i < 10; i++) {
            System.out.printf("%-3c", '—');
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