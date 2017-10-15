package Ex9;

import java.util.Calendar;

abstract class Ustensile {
    int year;
    double size;

    public Ustensile(int year, double size){
        this.year = year;
        this.size = size;
    }

    double getSurface(){
        return 0;
    }

    public double getValue(){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        //currentYear = 2009; Pour la correction (395)
        if((currentYear-this.year)<50){
            return 0;
        }
        else{
            return currentYear - year - 50;
        }
    }
}