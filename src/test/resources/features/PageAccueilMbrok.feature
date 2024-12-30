#autor : Khelifa
  Feature: Menu de Mabrok
    Scenario: Verification de menu de la page d'accueil Mabrok
      Given Acceder a la page  d accueil Mabrok
      When utilisateur survol la souris sur le menu "Femme"
      And utilisateur clique sur le submenu "Chemises"
      Then utilisateur est diriger vers la page submenu "Chemises & Blouses"