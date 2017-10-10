package Ex10;

public class Terrain extends Carte {
    Color col;
    public Terrain(String color){
        this.col = new Color(color);
        System.out.println("Nouveau terrain " + this.col.color);
    }

    public void afficher(){
        System.out.println("Un terrain " + this.col.color + " coût : " + this.cost);
    }
}
