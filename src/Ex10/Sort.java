package Ex10;

public class Sort extends Carte{
    String nom;
    String desc;

    public Sort(int cost, String nom, String desc){
        super(cost);
        this.nom = nom;
        this.desc = desc;
        System.out.println("Nouveau sort");
    }

    public void afficher(){
        System.out.println("Un sort " + this.nom + this.desc + " coût : " + this.cost);
    }
}
