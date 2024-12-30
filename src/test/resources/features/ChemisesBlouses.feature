Feature: Chemises & Blouses

  Scenario: Verifier les produits chemises et Blouses
    Given utilisateur est sur la page chemises et blouses
    When utilisateur clique sur le produit "CHEMISE ISRA"
    Then utilisateur est redirigé vers la page du produit et le produit "CHEMISE ISRA" est affiche

