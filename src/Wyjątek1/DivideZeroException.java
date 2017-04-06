package Wyjątek1;

/**
 * Created by Karol on 2016-11-26.
 */
public class DivideZeroException extends Exception{


    @Override
    public String getMessage(){
        return "Nie można podzielić przez 0!";
    }
}
