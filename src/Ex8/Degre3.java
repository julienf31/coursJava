package Ex8;

import java.util.Scanner;

public class Degre3 {
    public static void main(String[] args){
        double a = saisie("a");
        double b = saisie("b");
        double c = saisie("c");
        double x = saisie("x");

        double result = calculPolynome(a,b,c,x);
        System.out.println("Le resultat de ce polynome est : " + result);
    }

    static double saisie(String val){
        System.out.println("Saisissez " + val + " : ");
        return new Scanner(System.in).nextDouble();
    }

    static double calculPolynome(double a, double b, double c, double x){
        //((a+b)/2)x3+(a+b)2x^2+a+b+c
        return ((a+b)/2)*(x*x*x)+((a+b)*(a+b))*(x*x)+a + b + c;
    }
}
