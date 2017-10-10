package Ex7;

public class Moyenne1 {
    public static void main(String[] args){
        double noteProgrammation = 6.0;
        double noteAlgebre = 5.0;
        System.out.println("Ma moyenne est : " + (noteProgrammation++ + noteAlgebre)/2.0); //post incrément : (6 + 5)/2; NOTEPROGRAMATION++
    }
}
