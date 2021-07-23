package calc;

public class WrongInputException extends RuntimeException{
    WrongInputException(String message){
        super(message);
    }
    WrongInputException(){}
}
