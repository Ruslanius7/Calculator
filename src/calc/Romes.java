package calc;

public class Romes {
    private int value1;
    private int value2;
    private String str_value1;
    private  String str_value2;
    private String result;
    public int convert_romes_to_int(String str1){
        switch (str1){
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            default:
                throw new WrongInputException("Неверный формат ввода данных!");
        }
    }
    public void convert_and_set_int_result_to_romes(int int_result){
        int[] roman_value_list = new int[]{ 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman_char_list = new String[]{ "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < roman_value_list.length; i ++) {
            while (int_result >= roman_value_list[i]){
                int_result -= roman_value_list[i];
                res.append(roman_char_list[i]);
            }
            this.result = res.toString();

    }

    }
    public String get_result(){
        return result;
    }


}
