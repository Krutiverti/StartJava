public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1.Перевод псевдокода на язык Java");
        int age = 21;
        if (age > 20) {
            System.out.println("Ты в опасности");
        } else {
            System.out.println("Пока можешь расслабиться");
        }
        String sex = "man";
        if (sex != "man") {
            System.out.println("Можешь не служить");
        } else {
            System.out.println("Теперь ты в армии");
        }
        double height = 1.76;
        if (height < 1.80) {
            System.out.println("Привет красавчик");
        } else {
            System.out.println("Сколько зарабатываешь?");
        }
        String name = "Igor";
        char firstLetter = name.charAt(0);
        if (firstLetter == 'M') {
            System.out.println("Могло быть и лучше");
        } else if (firstLetter == 'I') {
            System.out.println("Моя любимая буква;) \n");
        } else {
            System.out.println("Я сейчас вызову полицию\n");
        }

        System.out.println("2.Поиск max и min числа");
        int a = 41;
        int b = 128;
        if (a > b) {
            System.out.println(" Число " + a + " больше " + b + "\n");
        } else if (b > a) {
            System.out.println(" Число " + b + " больше " + a + "\n");
        } else {
            System.out.println(" Число " + b + " равно " + a + "\n");
        }

        System.out.println("3.Проверка числа");
        int digit = -2;
        if (digit == 0) {
            System.out.println("Число равно " + digit + "\n");
        } else {
            if (digit % 2 == 0) {
                System.out.println("Число " + digit + " четное");
            } else {
                System.out.println("Число " + digit + " нечетное");
            }
            if (digit > 0) {
                System.out.println("Число " + digit + " положительное\n");
            } else {
                System.out.println("Число " + digit + " отрицательное\n");
            }
        }

        System.out.println("4.Поиск одинаковых цифр в числах");
        int num1 = 243;
        int num2 = 223;
        boolean sameDigitCount = false;
        System.out.println("Первое число: " + num1 + ". Второе число: " + num2);
        if (num1 % 10 == num2 % 10) {
            System.out.println("В первом разряде найдены одинаковые цифры: " + num1 % 10);
            sameDigitCount = true;
        }
        if (num1 / 10 % 10 == num2 / 10 % 10) {
            System.out.println("Во втором разряде найдены одинаковые цифры: " + num1 / 10 % 10);
            sameDigitCount = true;
        }
        if (num1 / 100 == num2 / 100) {
            System.out.println("В третьем разряде найдены одинаковые цифры: " + num1 / 100 );
            sameDigitCount = true;
        }
        if (!sameDigitCount) {
            System.out.println("Одинаковых цифр нет");
        }


        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0057';
        if (symbol >= '0' && symbol <= '9') {
            System.out.println("Число");
        } else if (symbol >= 'A' &&  symbol <= 'Z') {
            System.out.println("Большая буква");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Маленькая буква");
        } else {
            System.out.println("Не буква и не число");
        }
        System.out.println(symbol + "\n");

        System.out.println("6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 300000;
        int finalSum = 0;
        if (deposit < 100000) {
            finalSum = (int) (deposit * 1.05);
        } else if (deposit >= 100000 && deposit <= 300000) {
            finalSum = (int) (deposit * 1.07);
        } else if (deposit > 300000) {
            finalSum = (int) (deposit * 1.1);
        }
        System.out.println("Сумма вклада: " + deposit + ". Начисленный процент: " + (finalSum - deposit) +
                ". Итоговая сумма: " + finalSum + "\n");

        System.out.println("7. Определение оценки по предметам");
        int historyPercents = 59;
        int historyMark = 2;
         if (historyPercents > 69 && historyPercents < 74) {
            historyMark =3;
        } else if (historyPercents > 73 && historyPercents < 92) {
            historyMark = 4;
        } else if (historyMark > 91) {
            historyMark = 5;
        }
        int programmingPercents = 91;
        int programmingMark = 2;
        if (historyPercents > 69 && historyPercents < 74) {
            programmingMark =3;
        } else if (programmingPercents> 73 && historyPercents < 92) {
            programmingMark= 4;
        } else if (programmingPercents > 91) {
            programmingMark= 5;
        }
        System.out.println(historyMark + " - История");
        System.out.println(programmingMark + " - Программирование");
        System.out.println("Средний балл оценок по предметам: " + (historyMark + programmingMark) / 2);
        System.out.println("Средний процент по предметам: " + (historyPercents + programmingPercents) / 2 +"%\n");

        System.out.println("8. Расчет прибыли за год");
        int monthRent = 5000;
        int monthCirculation = 13000;
        int cost = 9000;
        int revenue = (monthCirculation - cost - monthRent) * 12;
        if (revenue > 0) {
            System.out.println("Прибыль за год: +" + revenue + "\n");
        }  else {
            System.out.println("Прибыль за год: " + revenue + "\n");
        }

        System.out.println("9. Подсчет количества банкнот");
        int requestedCash = 567;
        int onesLimit = 50;
        int tensLimit = 5;
        int hundredsLimit = 10;
        int requestedOneUsd = requestedCash % 10;
        int requestedTenUsd = requestedCash / 10 % 10;
        int requestedHundredUsd = requestedCash / 100;
        if ((onesLimit * 1 + tensLimit * 10 + hundredsLimit * 100) < requestedCash) {
            System.out.println("В банкомате недостаточно средств.");
            return;
        }
        if (requestedCash / 100 <= hundredsLimit && requestedCash % 100 >= tensLimit * 10) {
                requestedTenUsd = tensLimit;
                requestedOneUsd = requestedCash % 100 - tensLimit * 10;
        }
        if (requestedCash / 100 > hundredsLimit) {
            requestedHundredUsd = hundredsLimit;
            if (requestedCash / 10 - hundredsLimit * 10 <= tensLimit) {
                requestedTenUsd = (requestedCash - hundredsLimit * 100) / 10;
                } else if (requestedCash / 10 - hundredsLimit * 10 >= tensLimit) {
                requestedTenUsd = tensLimit;
                requestedOneUsd = requestedCash - hundredsLimit * 100 - tensLimit * 10;
            }
        }
        System.out.println("Доступные номиналы банкнот: 100 USD - " + hundredsLimit + "шт. 10 USD - " + tensLimit +
                "шт. 1 USD - " + onesLimit + "шт.");
        System.out.println("Кол-во выдаваемых банкнот: 100 USD - " + requestedHundredUsd + "шт. 10 USD - " +
                requestedTenUsd + "шт. 1 USD - " + requestedOneUsd + "шт.");
        System.out.println("Выданная сумма - " + requestedCash + "USD\n");
    }

}