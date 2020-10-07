import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            Scanner read= new Scanner(System.in);
            System.out.println("Введите операцию из двух римских или арабских чисел. \n" +
                                "Числа можно использовать от 1 до 10. ");
            RomanNum.RomanOrArabic(read.next(), read.next(), read.next());
        }

}
