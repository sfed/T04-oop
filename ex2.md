import java.util.ArrayList;
import java.util.Scanner;

class Voiture {
    private String marque;
    private String modele;
    private int annee;
    private double prix;
    private double kilometrage;

    public Voiture(String marque, String modele, int annee, double prix, double kilometrage) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.prix = prix;
        this.kilometrage = kilometrage;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public int getAnnee() {
        return annee;
    }

    public double getPrix() {
        return prix;
    }

    public double getKilometrage() {
        return kilometrage;
    }

    public String toString() {
        return marque + " " + modele + " (" + annee + "), " + prix + " €, " + kilometrage + " km";
    }
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Voiture> listeVoitures = new ArrayList<Voiture>();

        while (true) {
            System.out.println("Que souhaitez-vous faire ?");
            System.out.println("1. Ajouter une voiture");
            System.out.println("2. Afficher la liste de toutes les voitures enregistrées");
            System.out.println("3. Quitter");

            int choix = scanner.nextInt();

            if (choix == 1) {
                System.out.println("Saisissez les détails de la voiture :");

                System.out.print("Marque : ");
                String marque = scanner.next();

                System.out.print("Modèle : ");
                String modele = scanner.next();

                System.out.print("Année : ");
                int annee = scanner.nextInt();

                System.out.print("Prix : ");
                double prix = scanner.nextDouble();

                System.out.print("Kilométrage : ");
                double kilometrage = scanner.nextDouble();

                Voiture voiture = new Voiture(marque, modele, annee, prix, kilometrage);
                listeVoitures.add(voiture);

                System.out.println("La voiture a été ajoutée à la liste.");
            } else if (choix == 2) {
                if (listeVoitures.size() == 0) {
                    System.out.println("Aucune voiture n'a été enregistrée.");
                } else {
                    System.out.println("Liste de toutes les voitures enregistrées :");

                    for (Voiture voiture : listeVoitures) {
                        System.out.println(voiture);
                    }
                }
            } else if (choix == 3) {
                break;
            } else {
                System.out.println("Choix invalide.");
            }
        }
    }
}

