
public class Main {
    public static void main(String[] args) {

        SocieteArrayList societe = new SocieteArrayList();
        Employe e1 = new Employe(3, "mayssoun", "miaadi", "tech", 2);
        societe.ajouterEmploye(e1);

        societe.trierEmployeParId();
        societe.displayEmploye();
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();
        System.out.println("recherche par nom 'mayssoun': " + societe.rechercherEmploye("mayssoun"));
        System.out.println("recherche de l'employé e1: " + societe.rechercherEmploye(e1));

        societe.displayEmploye();
        societe.ajouterEmploye(new Employe(6, "may", "fzefzdvfsdf", "MR", 2));

        societe.trierEmployeParId();
        societe.displayEmploye();
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

    }
}