package Ex10;

public class Creature extends Carte{
    String nom;
    int degat;
    int hp;

    public Creature(int cost, String nom, int degat, int hp){
        super(cost);
        this.nom = nom;
        this.degat = degat;
        this.hp = hp;
        System.out.println("Nouvelle créature");
    }

    public void afficher(){
        System.out.println("Une créature " + this.nom + " " + this.degat + "/" + this.hp + " coût : " + this.cost);
    }
}
