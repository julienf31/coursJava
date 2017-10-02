package Ex10;

import java.util.ArrayList;
import java.util.List;

public class Jeu {
    int max;
    public Jeu(int max){
        this.max = max;
    }
    List<Carte> list = new ArrayList<Carte>();

    //ajoute une carte dans la main, verifie que la main n'est pas pleine
    void piocher(Carte carte){
        if(list.size() == max){
            System.out.println("Main pleine (" + max + " cartes), la carte n'est pas ajoutée");
        }
        else{
            list.add(carte);
            System.out.println("Vous avez : " + list.size() + " cartes");
        }
    }

    //Joue la premiére carte dans la liste
    void joue(){
        for(Carte c:this.list){

            System.out.print("La carte jouée est : ");
            c.afficher();
            list.remove(c);
            return;
        }
    }

    //affiche les cartes dans la main
    void afficher(){
        for(Carte c:this.list){
            System.out.print("La carte  est : ");
            c.afficher();
        }
    }
}
