package Ex6;

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Saisissez x : ");
        int number1 = scan.nextInt();
        System.out.println("Saisissez y : ");
        int number2 = scan.nextInt();

        System.out.println("Avant permutation :");
        System.out.println("x : " + number1);
        System.out.println("y : " + number2);

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("Après permutation :");
        System.out.println("x : " + number1);
        System.out.println("y : " + number2);

    }
}
