public class Calculator {

    public static int calculator(int first,String operator, int second ) {



            int result = 0;

            if ((first <= 10 && first > 0) && (second <= 10 && second > 0)) {

                if (operator.equals("*")) {
                    result = first * second;
                }
                if (operator.equals("/")) {
                    result = first / second;
                }
                if (operator.equals("+")) {
                    result = first + second;
                }
                if (operator.equals("-")) {
                    result = first - second;
                }

            }else {
                throw new IllegalArgumentException("Ошибка: Ввод арабских цифр должен быть от 1 до 10 ");
            }


            return result;
        }



}