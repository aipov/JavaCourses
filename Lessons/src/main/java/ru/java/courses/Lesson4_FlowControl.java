package ru.java.courses;

public class Lesson4_FlowControl {

    /**
     * В рамках задания необходимо найти в полученном массиве строк самую длинную
     * и вернуть ее в результате выполнени метода.
     * Если таких строк окажется несколько - возвращаем первую найденную.
     * <p>
     * Например, для массива {"Тихий дон", "Вишневый сад", "Война и мир", "Мертвые души"}
     * ответом будет "Вишнеый сад".
     * <p>
     * Подсказка: массив может быть пустой
     *
     * @param strings массив строк случайной длины
     *
     * @return самую длинную строку из полученного массива
     */

    // используюя цикл for each
    /*
    public static String task1(String[] strings) {
        String maxText = "";
        for (String name : strings) {
            if (name.length() > maxText.length()) {
                maxText = name;
            }
        }
       return maxText;
    }
*/

    // используя цикл for

    public static String task1(String[] strings) {
        String maxText = "";
        int i = 0;
        for (i = 0; i < strings.length; i++) {
            if (strings[i].length() > maxText.length()) {
                maxText = strings[i];
            }
        }
        return maxText;
    }

    // метод main для самого длинного названия
/*
    public static void main(String[] names) {
        names = new String[]{"Тихий дон", "Roman", "Мертвые души", "Война и мир", "Вишневый сад"};
        String maxText = "";
        int i = 0;
        for (i = 0; i < names.length; i++) {
            if (names[i].length() > maxText.length()) {
                maxText = names[i];
            }
        } // закрывает цикл
        System.out.println(maxText);
    } // закрывает метод main
*/

    /**
     * В рамках задания необходимо реализовать микро-калькулятор.
     *  В качестве входных параметров будут два числа i и k, а так же символ указывающий на операцию:
     * + - сложение i и k
     * - - вычитание k из i
     * * - умножение i на k
     * / - деление i на k
     * % - остаток от деления i на k
     * <p>
     * Как мы помним, на 0 делить нельзя. В этом случае просто возвращаем 0.
     *
     * Подсказка: переданный символ операции может быть не из списка выше
     *
     * @param i         первый числовой параметр
     * @param k         второй числовой параметр
     * @param operation символ, указывающий на операцию
     *
     * @return целочисленный результат выполнения операции
     */
    public static int task2(int i, int k, char operation) {

        // используюя if
        int result ;
       if (operation == '+'){
           result=i+k;
       }
       else if (operation == '-'){
           result=i-k;
       }
       else if (operation == '*'){
           result=i*k;
       }
       else if (operation == '/'){
           if (k == 0){
               result=0;}
           else result=i/k;
       }
       else if (operation == '%'){
           if (k==0){
               result=0;}
           else result=i%k;
       }
       else {result=0;}
       return result;

       // используюя switch
     /*  int result;
        switch (operation) {
            case '+':
                result = i+k;
                break;
            case '-':
                result = i-k;
                break;
            case '*':
                return i*k;

            case '/':
                if (k == 0){
                    result=0;}
                else result=i/k;
                break;
            case '%':
                if (k==0){
                    result=0;}
                else result=i%k;
                break;
                default:
                    result=0;
        }
        return result;*/
        }
    }

