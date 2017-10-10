package Ex9;

import java.util.Calendar;

public class AssietteCarree extends Assiette {
    public AssietteCarree(int year, double size){
        super(year,size);
    }

    @Override public double getSurface(){
        return this.size*this.size;
    }

    public double getValue(){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        //currentYear = 2009; Pour la correction (395)
        if((currentYear-this.year)<50){
            return 0;
        }
        else{
            return (currentYear - year - 50)*5;
        }
    }
}
