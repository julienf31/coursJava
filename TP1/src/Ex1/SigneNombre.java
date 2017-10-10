package Ex1;

import java.util.Scanner;

public class SigneNombre {
    public static void main(String[] args){
        System.out.println("Saisissez un nombre");
        Scanner sc = new Scanner(System.in);
        int nombre = sc.nextInt();

        if(nombre % 2 != 0){
            if(nombre < 0){
                System.out.println("Le nombre " + nombre + " est négatif et impaire");
            }
            else if(nombre > 0){
                System.out.println("Le nombre " + nombre + " est positif et impaire");
            }
        }
        else{
            if(nombre < 0){
                System.out.println("Le nombre " + nombre + " est négatif et pair");
            }
            else if(nombre > 0){
                System.out.println("Le nombre " + nombre + " est positif et pair");
            }
            else {
                System.out.println("Le nombre " + nombre + " est nul");
            }
        }
    }
}