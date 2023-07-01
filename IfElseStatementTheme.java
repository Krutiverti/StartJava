public class Main {
    public static void main(String[] args) {
        System.out.println("1.Перевод псевдокода на язык Java");
        int age = 21;
        String sex = "man";
        double height = 1.76;
        String name = "Igor";
        if (age > 20) {
            System.out.println("Ты в опасности");
        } else {
            System.out.println("Пока можешь расслабиться");
        }

        if (sex != "man") {
            System.out.println("Можешь не служить");
        } else {
            System.out.println("Теперь ты в армии");
        }

        if (height < 1.80) {
            System.out.println("Привет красавчик");
        } else {
            System.out.println("Сколько зарабатываешь?");
        }

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
        int dgt = -2;
        if (dgt * 2 == 0) {
            System.out.println("Число равно " + dgt);
            return;
        } else if (dgt % 2 == 0) {
            System.out.println("Число " + dgt + " четное");
        } else {
            System.out.println("Число " + dgt + " нечетное");
        } if (/*dgt != 0 && */ dgt > 0) {
            System.out.println("Число " + dgt + " положительное\n");
        } else if(/*dgt != 0 && */ dgt < 0) {
            System.out.println("Число " + dgt + " отрицательное\n");
        }

    System.out.println("4.Поиск одинаковых цифр в числах");
        int firstNumber = 243;
        int secondNumber = 223;
        int sameDgtCount = 0;
        System.out.println("Первое число: " + firstNumber + ". Второе число: " + secondNumber);
        if (firstNumber % 10 == secondNumber % 10) {
            System.out.println("В первом разряде найдены одинаковые цифры: " + firstNumber % 10);
            ++sameDgtCount;
        }
        if (firstNumber / 10 % 10 == secondNumber / 10 % 10) {
            System.out.println("Во втором разряде найдены одинаковые цифры: " + firstNumber / 10 % 10);
            ++sameDgtCount;
        }
        if (firstNumber / 100 % 10 == secondNumber / 100 % 10) {
            System.out.println("В третьем разряде найдены одинаковые цифры: " + firstNumber / 100 % 10);
            ++sameDgtCount;
        }
        if (sameDgtCount == 0) {
            System.out.println("Одинаковых цифр нет");
        }
        System.out.println();

    System.out.println("5. Определение символа по его коду");
        char symbol = '\u0057';
        if (symbol > 0 && symbol < 48) {
            System.out.println("Не буква и не число");
        }
        if (symbol > 47 && symbol < 58) {
            System.out.println("Число");
        }
        if (symbol > 57 && symbol < 65) {
            System.out.println("Не буква и не число");
        }
        if (symbol > 64 &&  symbol < 91) {
            System.out.println("Большая буква");
        }
        if (symbol > 90 && symbol < 97) {
            System.out.println("Не буква и не число");
        }
        if (symbol > 96 && symbol < 123) {
            System.out.println("Маленькая буква");
        }
        if(symbol > 122 && symbol <= 127) {
            System.out.println("Не буква и не число");
        }
        System.out.println(symbol + "\n");

    System.out.println("6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 300000;
        int finalSum = 0;
        if (deposit < 100000) {
            finalSum = (int) (deposit * 1.05);
            System.out.println("Сумма вклада: " + deposit + ". Начисленный процент: " + (finalSum - deposit) +
                    ". Итоговая сумма: " + finalSum + "\n");
        }
        if (deposit >= 100000 && deposit <= 300000) {
            finalSum = (int) (deposit * 1.07);
            System.out.println("Сумма вклада: " + deposit + ". Начисленный процент: " + (finalSum - deposit) +
                    ". Итоговая сумма: " + finalSum + "\n");
        }
        if (deposit > 300000) {
            finalSum = (int) (deposit * 1.1);
            System.out.println("Сумма вклада: " + deposit + ". Начисленный процент: " + (finalSum - deposit) +
                    ". Итоговая сумма: " + finalSum + "\n");
        }

    System.out.println("7. Определение оценки по предметам");
        int historyPercents = 59;
        int programmingPercents = 91;
        int historyMark = 0;
        int programmingMark = 0;
        if (historyPercents <= 69) {
            historyMark = 2;
        }
        if (historyPercents > 69 && historyPercents < 74) {
            historyMark =3;
        }
        if (historyPercents > 73 && historyPercents < 92) {
            historyMark = 4;
        }
        if (historyMark > 91) {
            historyMark = 5;
        }
        if (programmingPercents<= 69) {
            programmingMark = 2;
        }
        if (historyPercents > 69 && historyPercents < 74) {
            programmingMark =3;
        }
        if (programmingPercents> 73 && historyPercents < 92) {
            programmingMark= 4;
        }
        if (programmingPercents > 91) {
            programmingMark= 5;
        }
        System.out.println(historyMark + " - История");
        System.out.println(programmingMark + " - Программирование");
        System.out.println("Средний балл оценок по предметам: " + (historyMark + programmingMark) / 2);
        System.out.println("Средний процент по предметам: " + (historyPercents + programmingPercents) / 2 +"%\n");

    System.out.println("7. Расчет прибыли за год");
        int monthRent = 5000;
        int monthCirculation = 13000;
        int cost = 9000;
        int revenue = (monthCirculation - cost - monthRent) * 12;
        if (revenue >= 0) {
            System.out.println("Прибыль за год: +" + revenue + "\n");
        }
        if (revenue < 0){
            System.out.println("Прибыль за год: " + revenue + "\n");
        }

    System.out.println("9. Подсчет количества банкнот");
        int requestedCash = 567 ;
        int onesLimit = 50;
        int tensLimit = 5;
        int hundredsLimit = 10;
        int requestedOneUsd = 0;
        int requestedTenUsd = 0;
        int requestedHundredUsd = 0;

        if ((onesLimit * 1 + tensLimit * 10 + hundredsLimit * 100) < requestedCash) {
            System.out.println("В банкомате недостаточно средств.");
                    return;
        }
        if (requestedCash / 100 <= hundredsLimit) {
            if (requestedCash % 100  <= tensLimit * 10) {
                requestedHundredUsd = requestedCash /100;
                requestedTenUsd = requestedCash / 10 % 10;
                requestedOneUsd = requestedCash % 10;
            } else if (requestedCash % 100 >= tensLimit * 10) {
                requestedHundredUsd = requestedCash / 100;
                requestedTenUsd = tensLimit;
                requestedOneUsd = requestedCash % 100 - tensLimit * 10 ;
            }
        }
        if(requestedCash / 100 > hundredsLimit) {
            if (requestedCash / 10 - hundredsLimit * 10 <= tensLimit) {
                requestedHundredUsd = hundredsLimit;
                requestedTenUsd = (requestedCash - hundredsLimit * 100) / 10;
                requestedOneUsd = requestedCash % 10;
            } else if (requestedCash / 10 - hundredsLimit * 10 >= tensLimit) {
                requestedHundredUsd = hundredsLimit;
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