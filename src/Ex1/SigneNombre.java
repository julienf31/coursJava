package Ex1;

import java.util.Scanner;

public class SigneNombre {
    public static void main(String[] args){

    System.out.println("Saisissez un nombre");
    Scanner sc = new Scanner(System.in);
    int nombre = sc.nextInt();

    if(nombre % 2 != 0)
        System.out.println("Impaire");
    else
        System.out.println("Paire");
    if(nombre < 0)
        System.out.println("Négatif");
    else
        System.out.println("Positif ou nul");
    }
}