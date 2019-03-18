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
    public static int task1(String[] strings) {
       return 0;
    }

    public  static void main(String[] names) {
        names = new String[]{"Тихий дон", "Вишневый сад", "Война и мир", "Мертвые души"};
    }

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

