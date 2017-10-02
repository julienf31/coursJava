package Ex5;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        double largeur = lireDonnee("largeur");
        double hauteur = lireDonnee("hauteur");

        boolean donneesOk = testerDonnees(largeur, hauteur);

        if(donneesOk){
            calculer(largeur,hauteur);
        }
        else{
            afficherErreur();
        }

    }

    static double lireDonnee(String nom){
        System.out.println("Saisissez la " + nom + " du rectangle : ");
        double nombre = new Scanner(System.in).nextInt();

        return nombre;
    }

    static boolean testerDonnees(double largeur, double hauteur){
        if(largeur > 0 && hauteur > 0) { // on accepte que les valeures supérieures à 0
            return true;
        }
        else{
            return false;
        }
    }

    static void afficherErreur(){
        System.out.println("Vous avez saisis une hauteur ou une largeur négative ou nulle.");
    }

    static void calculer(double largeur, double hauteur){
        System.out.println("Surface (s/S) ou périmétre (p/P) ? :");
        String choice = new Scanner(System.in).nextLine();

        if("p".equals(choice) || "P".equals(choice)){
            System.out.println("Le périmétre est : " + ((largeur*2)+(hauteur*2)));
        }
        else if("s".equals(choice) || "S".equals(choice)){
            System.out.println("La surface est : " + (largeur*hauteur));
        }
    }
}