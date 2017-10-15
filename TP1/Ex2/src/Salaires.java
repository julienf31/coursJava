import java.util.ArrayList;
import java.util.List;

public class Salaires {
    public static void main(String[] args){
        Personnel p = new Personnel();
        p.ajouterEmploye(new Vendeur("Pierre","Business",45,"1995", 30000));
        p.ajouterEmploye(new Representant("Léon","Vendtout",25,"2001", 20000));
        p.ajouterEmploye(new Technicien("Yves","Bosseur",28,"1998",1000));
        p.ajouterEmploye(new Manutentionnaire("Jeanne", "Stocketout", 32,"1998",45));
        p.ajouterEmploye(new TechARisque("Jean","Flippe",28,"2000",1000));
        p.ajouterEmploye(new ManutARisque("Al","Abordage",30,"2001",45));

        p.calculerSalaires();
        System.out.println("Le salaire moyen dans l'entreprise est de " + p.salaireMoyen() + " euros.");
    }
}

abstract class Employe {

    public Employe(String nom, String prenom, int age, String dateEmbauche, int salary){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.dateEmbauche = dateEmbauche;
        this.salary = salary;
    }

    protected String nom;
    protected String prenom;
    protected int age;
    protected String dateEmbauche;
    protected int salary;
    protected int salaire; // pas utile ?

    protected double calculerSalaire(){
        return 0;
    }

    protected String getNom(){
        return "L'employé " + prenom + " " + nom;
    }
}

class Vendeur extends Employe{
    public Vendeur(String nom, String prenom, int age, String dateEmbauche,int salary){
        super(nom,prenom,age,dateEmbauche,salary);
    }

    protected double calculerSalaire(){
        return (salary*0.20)+400;
    }

    protected String getNom(){
        return"Le vendeur " + prenom + " " + nom;
    }
}

class Representant extends Employe{
    public Representant(String nom, String prenom, int age, String dateEmbauche,int salary){
        super(nom,prenom,age,dateEmbauche,salary);
    }

    protected double calculerSalaire(){
        return (salary*0.20)+800;
    }

    protected String getNom(){
        return "Le représentant " + prenom + " " + nom;
    }
}

class Technicien extends Employe{
    public Technicien(String nom, String prenom, int age, String dateEmbauche,int salary){
        super(nom,prenom,age,dateEmbauche,salary);
    }

    protected double calculerSalaire(){
        return salary*5;
    }

    protected String getNom(){
        return "Le technicien " + prenom + " " + nom;
    }
}

class Manutentionnaire extends Employe{
    public Manutentionnaire(String nom, String prenom, int age, String dateEmbauche,int salary){
        super(nom,prenom,age,dateEmbauche,salary);
    }

    protected double calculerSalaire(){
        return salary*65;
    }

    protected String  getNom(){
        return "Le manutentionnaire " + prenom + " " + nom;
    }
}

interface EmployeARisque {
    double prime = 200.0;
}

class TechARisque extends Technicien implements EmployeARisque {
    public TechARisque(String nom, String prenom, int age, String dateEmbauche,int salary){
        super(nom,prenom,age,dateEmbauche,salary);
    }

    protected double calculerSalaire(){
        return (salary*5) + prime;
    }

    protected String getNom(){
        return "Le technicien à risque " + prenom + " " + nom;
    }
}

class ManutARisque extends Manutentionnaire implements EmployeARisque{
    public ManutARisque(String nom, String prenom, int age, String dateEmbauche,int salary){
        super(nom,prenom,age,dateEmbauche,salary);
    }

    protected double calculerSalaire(){
        return (salary*65) + prime;
    }

    protected String getNom(){
        return "Le manutentionnaire à risque " + prenom + " " + nom;
    }
}

class Personnel {
    List<Employe> list = new ArrayList<Employe>();

    void ajouterEmploye(Employe employe){
        list.add(employe);
    }

    protected void calculerSalaires(){
        for(Employe e:this.list){
            System.out.println(e.getNom() + " est payé " + e.calculerSalaire() + " euros par mois.");
        }
    }

    protected double salaireMoyen(){
        double sal = 0;
        int num = 0;
        for(Employe e:this.list){
            sal += e.calculerSalaire();
            num++;
        }
        return sal/num;
    }
}