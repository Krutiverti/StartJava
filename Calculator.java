public class Calculator {

    public static void main(String[] args){
        char sign = '%';
        int num1 = 8;
        int num2 = 3;
        int result = 0;
        if (sign == '+') {
            result = num1 + num2;
        } else if (sign == '-') {
            result = num1 - num2;
        } else if (sign == '*') {
            result = num1 * num2;
        } else if (sign == '/') {
            result = num1 / num2;
        } else if (sign == '^') {
            result = num1;
            for (int i = 1; i < num2; i++) {
                result = result * num1;
            }            
        } else if (sign == '%') {
            result = num1 % num2;
        }
        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}
