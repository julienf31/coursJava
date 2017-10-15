package Ex4;

public class Portee {
    public static void main(String[] args){
        int x = 11, y = 22;
        System.out.println("1. x = " + x);
        System.out.println("2. y = " + y);
        System.out.println();

        calculer1(x,y);
        System.out.println();

        System.out.println("5. x = " + x); // même resultat que pour le 1
        System.out.println("6. y = " + y); // même resultat que pour le 2

        System.out.println();
        calculer2(x,y);
        System.out.println("11. x = " + x);
        System.out.println("12. y = " + y);

        System.out.println();
        int[] object = {5};
        System.out.println("13. object[0] = " + object[0]); //5
        calculer3(object); //37
        System.out.println("15. object[0] = " + object[0]); //37
    }

    static void calculer1(int x, int y){
        x = 878; // nouveau x dans cette fonction uniquement
        y++;    // y = 23 dans cette fonction uniquement
        System.out.println("3. x = " + x);
        System.out.println("4. y = " + y);
    }

    static void calculer2(int a, int b){
        int x = 33;
        int y = 44;
        a = 2 * x;
        b = 2 * y;
        System.out.println("7. x = " + x);
        System.out.println("8. y = " + y);
        System.out.println("9. a = " + a);
        System.out.println("10. b = " + b);
    }

    static void calculer3(int[] object){
        object[0] = 37; // la valeure change aussi dans le main
        System.out.println("14. object[0] = " + object[0]);
    }
}