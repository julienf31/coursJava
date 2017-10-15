package Ex10;

public class Color {
    String color = "";

    public Color(String color){
        switch (color){
            case "B":
                this.color = "blanc";
                break;
            case "b":
                this.color = "bleu";
                break;
            case "n":
                this.color = "noir";
                break;
            case "r":
                this.color = "rouge";
                break;
            case "v":
                this.color = "vert";
                break;
        }
    }
}
