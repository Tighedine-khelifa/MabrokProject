Feature: Produit au panier
  Scenario: Ajout du produit au panier
    Given utilisateur est sur la page produit
    When utilisateur clique sur la couleur et la taille et cliquer Ajouter au panier
    Then utilisateur verifier le produit ajouter au panier "CHEMISE ISRA - MOKA, M"