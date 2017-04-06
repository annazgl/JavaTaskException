package Wyjątek1;

import java.util.Scanner;

public class Main {
    //Stwórz klasę Number z metodą statyczną divide(doubl a,double b), która zwraca własny wyjątek DivideZeroException.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        try{
            System.out.println("a/b = " + Number.divide(a,b));
        }
        catch(DivideZeroException e){
            System.out.println("Coś poszło nie tak: " + e.getMessage());
        }

    }
}
