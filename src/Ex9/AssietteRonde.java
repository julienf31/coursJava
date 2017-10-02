package Ex9;

class AssietteRonde extends Assiette {
    public AssietteRonde(int year, double size){
        super(year,size);
    }
    @Override public double getSurface(){
        return 3.14*this.size*this.size;
    }
}
