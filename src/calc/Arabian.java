package calc;

public class Arabian {
    private int value1;
    private int value2;
    private int result;


    public void setValue1(int value1) {
        if ((value1 > 10) || (value1 < 1)) {
            throw new WrongInputException("Введеные числа должны быть не больше 10 и не меньше 1");
        }
        this.value1 = value1;
    }

    public void setValue2(int value2) {
        if ( (value2 > 10)  || (value2 < 1)) {
            throw new WrongInputException("Введеные числа должны быть не больше 10 и не меньше 1");
        }
        this.value2 = value2;
    }


    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }

    public int getResult() {
        return result;

    }

    public void sum() {
        result = value1 + value2;
    }

    public void sub() {

        result = value1 - value2;
    }

    public void mul() {

        result = value1 * value2;
    }

    public void div() {

        result = value1 / value2;
    }


}
