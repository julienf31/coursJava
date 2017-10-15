package Ex10;

abstract class Carte {
    int cost;
    public Carte(){
        this.cost = 0;
        System.out.print("Nouvelle carte => ");
    }
    public Carte(int cost){
        this.cost = cost;
        System.out.print("Nouvelle carte => ");
    }

    public void afficher(){
        System.out.println();
    }
}
