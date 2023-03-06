import java.util.ArrayList;

class Livre {
  private String titre;
  private String auteur;
  private int id;

  private static int count = 0;

  public Livre(String titre, String auteur) {
    this.titre = titre;
    this.auteur = auteur;
    this.id = ++count;
  }

  public String getTitre() {
    return titre;
  }

  public String getAuteur() {
    return auteur;
  }

  public int getId() {
    return id;
  }

  public String toString() {
    return "Livre{" +
        "titre='" + titre + '\'' +
        ", auteur='" + auteur + '\'' +
        ", id=" + id +
        '}';
  }
}

class Bibliothèque {
  private ArrayList<Livre> livres;

  public Bibliothèque() {
    this.livres = new ArrayList<Livre>();
  }

  public void ajouterLivre(Livre livre) {
    livres.add(livre);
  }

  public void afficherLivres() {
    for (Livre livre : livres) {
      System.out.println(livre.toString());
    }
  }
}

public class TestBibliotheque {
  public static void main(String[] args) {
    Livre livre1 = new Livre("Les Misérables", "Victor Hugo");
    Livre livre2 = new Livre("Germinal", "Emile Zola");

    Bibliothèque bibliothèque = new Bibliothèque();
    bibliothèque.ajouterLivre(livre1);
    bibliothèque.ajouterLivre(livre2);

    bibliothèque.afficherLivres();
  }
}
