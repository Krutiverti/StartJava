public class VariablesTheme  {

    public static void main(String[] args) {
        System.out.println("1.Вывод характеристик компьютера");
        char cpuIndex = '5';
        int cpuCore = 6;
        double cpuFrequency = 2.9;
        byte memorySize = 16;
        float memoryFrequency = 2.6f;
        short ssdSize = 256;
        boolean videoCard = false;
        long mtbf = 5400000000L;
        System.out.println("Процессор Intel Core i" + cpuIndex + ", Частота процессора: " + cpuFrequency +
                "Ггц, Количество ядер: " + cpuCore);
        System.out.println("Объем твердотельного накопителя: " + ssdSize + "Гб, наработка на отказ: " +
                mtbf + " секунд");
        System.out.println("Объем оперативной памяти: " + memorySize + "Гб, частота памяти: " + memoryFrequency + "ГГц");
        System.out.println("Наличие дискретной видеокарты: " + videoCard + "\n");

        System.out.println("2.Расчет стоимости товаров");
        int penPrice = 100;
        int bookPrice = 200;
        int sumGoods = penPrice + bookPrice;
        int discount = sumGoods / 100 * 11;
        int discountPrice = sumGoods - discount;
        System.out.println("Сумма товаров: " + sumGoods );
        System.out.println("Размер скидки: " + discount);
        System.out.println("Итоговая стоимость: " + discountPrice + "\n");

        System.out.println("3.Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a\n");

        System.out.println("4.Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807L;
        System.out.println("Первоначальное значение byte: " + maxByte + ", Инкремент byte: " + ++maxByte +
                ", Декремент byte: " + --maxByte);
        System.out.println("Первоначальное значение short: " + maxShort + ", Инкремент short: " + ++maxShort +
                ", Декремент short: " + --maxShort);
        System.out.println("Первоначальное значение Integer: " + maxInt + ", Инкремент Integer: " + ++maxInt +
                ", Декремент Integer: " + --maxInt);
        System.out.println("Первоначальное значение long: " + maxLong + ", Инкремент long: " + ++maxLong +
                ", Декремент long: " + --maxLong + "\n");

        System.out.println("5.Перестановка значений переменных");
        int a = 2;
        int b = 5;
        int c = a;
        System.out.println("Исходные значения переменных : a = " + a + ", b = " + b);
        a = b;
        b = c;
        System.out.println("с помощью третьей переменной: a = " + a + ", b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("с помощью арифметических операций: a = " + a + ", b = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("с помощью побитовой операции ^ : a = " + a + ", b = " +  b + "\n" );

        System.out.println("6.Вывод символов и их кодов");
        char hashtag = '#';
        char ampersand = '&';
        char at = '@';
        char caret = '^';
        char underscore = '_';
        System.out.println("Код символа: " + (int) hashtag + ", Символ : " + hashtag);
        System.out.println("Код символа: " + (int) ampersand + ", Символ : " + ampersand);
        System.out.println("Код символа: " + (int) at + ", Символ : " + at);
        System.out.println("Код символа: " + (int) caret + ", Символ : " + caret);
        System.out.println("Код символа: " + (int) underscore + ", Символ : " + underscore + "\n");

        System.out.println("7.Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char openParenthesis = '(';
        char closeParenthesis = ')';
        System.out.println("    " + slash +  backSlash);
        System.out.println("   " + slash + "  "+ backSlash);
        System.out.println("  " + slash + underscore + openParenthesis + " " + closeParenthesis + backSlash);
        System.out.println(" " + slash + "      " + backSlash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + backSlash +
                underscore + underscore + backSlash + "\n");

        System.out.println("8.Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int hundreds = num / 100;
        int tens = num / 10 % 10;
        int ones = num % 10;
        System.out.println("Число " + num + " содержит:");
        System.out.println(hundreds + " сотню" + "\n" + tens+ " десятка" +"\n" + ones + " единицы");
        System.out.println("Сумма его цифр = " + (hundreds + tens + ones) + "\n" +
                "Произведение = " + (hundreds * tens * ones) + "\n");

        System.out.println("9.Вывод времени");
        int time = 86399;
        int hh = time / 3600;
        int mm = time / 60 % 60;
        int ss = time % 60;
        System.out.println(hh + ":" + mm + ":" + ss );
    }
}
