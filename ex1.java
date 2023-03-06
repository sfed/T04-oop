import java.util.ArrayList;

class Produit {
    private String nom;
    private String description;
    private double prix;
    private int quantite;
    
    public String getNom() {
		return nom;
  	}
  
  	public void setNom(String nom) {
  		this.nom = nom;
  	}
  
  	public String getDescription() {
  		return description;
  	}
  
  	public void setDescription(String description) {
  		this.description = description;
  	}
  
  	public double getPrix() {
  		return prix;
  	}
  
  	public void setPrix(double prix) {
  		this.prix = prix;
  	}
  
  	public int getQuantite() {
  		return quantite;
  	}
  
  	public void setQuantite(int quantite) {
  		this.quantite = quantite;
  	}

	  public Produit(String nom, String description, double prix, int quantite) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.quantite = quantite;
    }

    public void afficherDetails() {
        System.out.println("Nom : " + nom);
        System.out.println("Description : " + description);
        System.out.println("Prix : " + prix);
        System.out.println("Quantité en stock : " + quantite);
    }
  }


class Panier {
    private ArrayList<Produit> produits;

    public Panier() {
        produits = new ArrayList<Produit>();
    }

    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    public void supprimerProduit(Produit produit) {
        if (produits.contains(produit)) {
            produits.remove(produit);
        } else {
            System.out.println("Le produit n'est pas dans le panier.");
        }
    }

    public double calculerTotal() {
        double total = 0;
        for (Produit produit : produits) {
            total += produit.getPrix();
        }
        return total;
    }
}

class ex1 {
  
  public static void main(String[] args) {
    // Création d'un objet Panier
    Panier p1 = new Panier();
    
    
    // Ajout de deux produits au panier
    Produit produit1 = new Produit("T-shirt", "T-shirt en coton blanc", 20.0, 1);
    produit1.afficherDetails();
    Produit produit2 = new Produit("Chaussures", "Chaussures de sport", 50.0, 1);
    produit2.afficherDetails();
    p1.ajouterProduit(produit1);
    p1.ajouterProduit(produit2);
    
    // Suppression d'un produit du panier
    // p1.supprimerProduit(produit1);
    
    // Calcul du prix total du panier
    double total = p1.calculerTotal();
    System.out.println("Prix total du panier : " + total);
        
  }
}