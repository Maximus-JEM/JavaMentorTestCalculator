public class RomanNum {
    static String [] in = {"0","I","II","III","IV","V","VI","VII","VIII","IX","X"};
    static String [] out = {"0","I","II","III","IV","V","VI","VII","VIII","IX","X",
            "XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX",
            "XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX",
            "XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XL",
            "XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII","XLIX","L",
            "LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX","LX",
            "LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII","LXIX","LXX",
            "LXXI","LXXII","LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXIX","LXXX",
            "LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX","XC",
            "XCI","XCII","XCIII","XCIV","XCV","XCVI","XCVII","XCVIII","XCIX","C"};



    static int  firstNum,secondNum,output, countID = 0;


    public static void RomanOrArabic(String oneNum, String operation, String twoNum){
        try
        {
            for (String in: in ) {
                if (oneNum.toUpperCase().equals(in)) {
                    oneNum = oneNum.toUpperCase();
                    countID++;
                }
                if (twoNum.toUpperCase().equals(in)) {
                    twoNum = twoNum.toUpperCase();
                    countID++;
                }
            }
            switch (countID) {
                case 0 -> {
                    firstNum= Integer.parseInt(oneNum);
                    secondNum = Integer.parseInt(twoNum);
                    System.out.println("Ответ: " + Calculator.calculator(firstNum,operation,secondNum));
                }
                case 1 -> throw new IllegalArgumentException("Ошибка: Ввод должен быть арабскими или римскими цифрами от I до X ");
                case 2 -> {
                    firstNum = RomanToArabic(oneNum);
                    secondNum = RomanToArabic(twoNum);
                    output = Calculator.calculator(firstNum,operation,secondNum);
                    System.out.println("Ответ: " + ArabicToRoman(output));
                }
            }
        }
        catch (NumberFormatException e){System.err.println("Ошибка: Ввидете арабску либо рисмкую цифру от 1 до 10 "+e.getMessage());}
    }

    public static int RomanToArabic (String roman) {
        for (int i = 0; i < in.length; i++) {
            if (roman.equals(in[i])){
                return i;
            }
        }
        return -1;
    }
    public static String ArabicToRoman(int arab ) {
        try {
            return out[arab];
        } catch(IndexOutOfBoundsException e){
            System.err.println(e.getMessage());
        }
        return "";
    }
}