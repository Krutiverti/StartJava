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
        int max = num2;
        if (num1 > num2) {
            min = num2;
            max = num1;
        }
        if (max < num3) {
            max = num3;
        } else if (num3 < min) {
            min = num3;
        }
        for (int i = --max; i > min; i--) {
            System.out.print(i + " ");
        }

        //3. Вывод реверсивного числа и суммы его цифр
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int workNum= 1234;
        int sumDigits = 0;
        System.out.print("Исходное число в обратном порядке: ");
        while (workNum > 0) {
            int remainder = workNum % 10;
            sumDigits += remainder;
            System.out.print(remainder);
            workNum /= 10;
        }
        System.out.println("\nСумма цифр в числе: " + sumDigits + "\n");

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
        workNum = 3242592;
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
        int lang = 5;
        while (lang > 0) {
           int height = lang;
            while (height > 0) {
                height--;
                System.out.print("#");
            }
            System.out.println();
            lang--;
        }

        lang = 0;
        int countStrings = 0;
        do {
            if (countStrings < 3){
                ++lang;
            } else {
                --lang;
            }
            System.out.println();
            int height = 0;
            do {
                ++height;
                System.out.print("$");
            } while (height < lang);
            countStrings++;
        } while (countStrings < 5);



        //7. Отображение ASCII-символов
        System.out.println("\n\n7. Отображение ASCII-символов");
        System.out.println("символы, идущие до цифр и имеющие нечетные коды");
        for (int i = 33; i < 48; i++) {
            if (i % 2 != 0) {
                System.out.printf("%3d%3c\n", i, i);
            }
        }
        System.out.println("маленькие английские буквы, имеющие четные коды");
        for (int i = 97; i < 123; i++) {
            if ( i % 2 == 0) {
                System.out.printf("%3d%3c\n", i, i);
            }
        }

        //8. Проверка, является ли число палиндромом
        System.out.println("\n8. Проверка, является ли число палиндромом");
        int palindrome = 1234321;
        int reverse = 0;
        for (int i = palindrome; i > 0; i /= 10) {
            reverse = reverse * 10 + i % 10;
        }
        if (reverse == palindrome) {
            System.out.println("число " + palindrome + " является палиндромом\n");
        } else {
            System.out.println("число " + palindrome + " не является палиндромом\n");
        }

        //9. Определение, является ли число счастливым
        System.out.println("9. Определение, является ли число счастливым");
        int happyNum = 452371;
        int rightHalf = happyNum % 1000;
        int leftHalf = happyNum / 1000;
        int sumRight = 0;
        int sumLeft = 0;
        for (int i = 0; i < 3; ++i) {
            sumRight += rightHalf % 10;
            rightHalf /= 10;
            sumLeft += leftHalf % 10;
            leftHalf /= 10;
        }
        System.out.println("Сумма цифр " + happyNum % 1000 + " = " + sumRight);
        System.out.println("Сумма цифр " + happyNum / 1000 + " = " + sumLeft);
        if (sumRight == sumLeft) {
            System.out.println("Число: " + happyNum + " Является счастливым\n");
        } else {
            System.out.println("Число: " + happyNum + " не является счастливым\n");
        }

        //10. Вывод таблицы умножения Пифагора
        System.out.println("10. Вывод таблицы умножения Пифагора");
        System.out.println("    Таблица Пифагора");
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