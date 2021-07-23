package calc;
import java.util.Scanner;
import java.util.Arrays;
public class Calculator {

    private static final String [] romes_values = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX","X"};
    public static int countSpaces(String s){
        int count = 0;
        for (int i = 0; i <s.length();i++){
            if ((s.charAt(i)==' ')) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        boolean it_s_an_arabian_number = true;
      Scanner scan = new Scanner(System.in);
      String s = scan.nextLine();
      String str_value1;
      String str_value2;
      int value1;
      int value2;
      int result;
        if(countSpaces(s)==2){
            str_value1 = s.substring(0,s.indexOf(' '));
            str_value2 = s.substring(s.lastIndexOf(' ')+1,s.length());
        }
        else throw new WrongInputException("Введите выражение, разделяя каждый символ пробелом");

try {
    value1 = Integer.parseInt(str_value1);
    value2 = Integer.parseInt(str_value2);
}
catch (NumberFormatException e){
    if ((Arrays.asList(romes_values).contains(str_value1))&&(Arrays.asList(romes_values).contains(str_value2))){
        it_s_an_arabian_number = false;
        Romes r = new Romes();
        value1 = r.convert_romes_to_int(str_value1);
        value2 = r.convert_romes_to_int(str_value2);
    }
   else throw new WrongInputException("Неверный формат ввода данных!");

}
            if ((s.indexOf('+')>0) && (s.indexOf('+')-s.indexOf(' ')==1)&&(s.lastIndexOf(' ')-s.indexOf('+')==1))
            {
                Arabian a = new Arabian();
                a.setValue1(value1);
                a.setValue2(value2);
                a.sum();
                result = a.getResult();

            }

       else if ((s.indexOf('-')>0) && (s.indexOf('-')-s.indexOf(' ')==1)&&(s.lastIndexOf(' ')-s.indexOf('-')==1))
        {
            Arabian a = new Arabian();
            a.setValue1(value1);
            a.setValue2(value2);
            a.sub();
            result = a.getResult();
        }

       else if ((s.indexOf('/')>0) && (s.indexOf('/')-s.indexOf(' ')==1)&&(s.lastIndexOf(' ')-s.indexOf('/')==1))
        {
            Arabian a = new Arabian();
            a.setValue1(value1);
            a.setValue2(value2);
            a.div();
            result = a.getResult();
        }

       else if ((s.indexOf('*')>0) && (s.indexOf('*')-s.indexOf(' ')==1)&&(s.lastIndexOf(' ')-s.indexOf('*')==1))
        {
            Arabian a = new Arabian();
            a.setValue1(value1);
            a.setValue2(value2);
            a.mul();
            result = a.getResult();
        }
        else throw new WrongInputException("Неверный формат ввода данных!");
        if (it_s_an_arabian_number){
            System.out.println(result);

        }
        else {
            Romes r = new Romes();
            r.convert_and_set_int_result_to_romes(result);
            System.out.println(r.get_result());
        }







    }

}
