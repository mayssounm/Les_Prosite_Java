public class Employe implements Comparable<Employe>{
    private int id;
    private String nom;
    private String prenom;
    private String nom_depart;
    private int grade;


    public Employe(int id, String nom, String prenom, String nom_depart, int grade) {
        this.id = id;this.nom = nom;this.prenom = prenom;this.nom_depart = nom_depart;this.grade = grade;
    }



    public String getNom() {return nom;}

    public String getNom_depart() {return nom_depart;}
    public int getGrade() {return grade;}


    @Override
    public boolean equals(Object o){
        if(o==null) return false;
        if(o==this) return true;

        if(o instanceof Employe e) return this.id == e.id && this.nom.equals(e.nom);

        return false;
    }

    @Override
    public String toString(){


        return this.nom + " " +
                this.prenom + " " +
                this.nom_depart + " " +
                this.grade;}

    @Override
    public int compareTo(Employe e) {



        return Integer.compare(this.id, e.id);}
}
